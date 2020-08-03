package nl.sri.sonar.service;

import nl.sri.sonar.entity.Snapshots;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author songdi
 * @since 2020-07-31
 */
public interface ISnapshotsService extends IService<Snapshots> {
    public Snapshots getLast2(Snapshots snapshots);

    Snapshots getLast(Snapshots snapshots);

    Snapshots getLast(Snapshots snapshots, long buildStartDate, long buildEndDate);

    Snapshots getYesterdayLast(Snapshots snapshots);

    Snapshots getSomeDaysAgoLast(Snapshots snapshots, long timestamp, long days);

}
