/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package nl.sri.webhook;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;

import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerBuilder;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppRun {
    public static final DateTimeFormatter DFY_MD_HMS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

    @Bean
    public ServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory fa = new TomcatServletWebServerFactory();
        fa.addConnectorCustomizers(connector -> connector.setProperty("relaxedQueryChars", "[]{}"));
        return fa;
    }

    /**
     * 访问首页提示
     *
     * @return /
     */
    @GetMapping("/deployment")
    public String index(UpdateRequest updateRequest) {
        KubernetesClient client = new DefaultKubernetesClient();
        Deployment deployment =
            client.apps().deployments().inNamespace(updateRequest.getNamespace()).withName(updateRequest.getWorkload())
                .get();
        Container updatedContainer = null;
        for (Container container : deployment.getSpec().getTemplate().getSpec().getContainers()) {
            if (container.getName().equals(updateRequest.getContainer())) {
                updatedContainer = new ContainerBuilder(container).withImage(updateRequest.getRepository()).build();
            }
        }
        if (updatedContainer == null) {
            return "没有找到容器" + updateRequest.getContainer();
        }

        client.apps().deployments().inNamespace(updateRequest.getNamespace()).withName(updateRequest.getWorkload())
            .rolling().edit().editMetadata().addToLabels("webhook-update", DFY_MD_HMS.format(LocalDateTime.now()))
            .endMetadata().editSpec().editTemplate().editSpec()
            .withContainers(Collections.singletonList(updatedContainer)).endSpec().endTemplate().endSpec().done();
        return "update successfully";
    }

}
