package nl.sri.sonar.service.impl;

import nl.sri.sonar.entity.Projects;
import nl.sri.sonar.mapper.ProjectsMapper;
import nl.sri.sonar.service.IProjectsService;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author songdi
 * @since 2020-07-31
 */
@Service
@Primary
@DS("#header.sonarDataSource")
public class ProjectsServiceImpl extends ServiceImpl<ProjectsMapper, Projects> implements IProjectsService {

}
