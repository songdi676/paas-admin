package nl.sri.sonar.service.impl;

import nl.sri.sonar.entity.Issues;
import nl.sri.sonar.mapper.IssuesMapper;
import nl.sri.sonar.service.IIssuesService;

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
 * @since 2020-07-15
 */
@Service
@Primary
@DS("#header.DataSource")
public class IssuesServiceImpl extends ServiceImpl<IssuesMapper, Issues> implements IIssuesService {

}
