FROM 10.1.8.15:5000/songdi/java:8
# 作者
MAINTAINER songdi
# 将jar包添加到容器中并更名为app.jar
ADD webhook*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]