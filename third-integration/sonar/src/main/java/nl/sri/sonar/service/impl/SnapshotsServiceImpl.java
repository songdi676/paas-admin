package nl.sri.sonar.service.impl;

import nl.sri.sonar.entity.Snapshots;
import nl.sri.sonar.mapper.SnapshotsMapper;
import nl.sri.sonar.service.ISnapshotsService;

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
public class SnapshotsServiceImpl extends ServiceImpl<SnapshotsMapper, Snapshots> implements ISnapshotsService {

}
