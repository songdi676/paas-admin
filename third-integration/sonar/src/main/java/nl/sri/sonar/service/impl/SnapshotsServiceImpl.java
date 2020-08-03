package nl.sri.sonar.service.impl;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Optional;

import nl.sri.sonar.entity.Snapshots;
import nl.sri.sonar.mapper.SnapshotsMapper;
import nl.sri.sonar.service.ISnapshotsService;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author songdi
 * @since 2020-07-31
 */
@Service
@Primary
@DS("#header.sonarDataSource")
public class SnapshotsServiceImpl extends ServiceImpl<SnapshotsMapper, Snapshots> implements ISnapshotsService {

    /**
     * 获取最新的构建
     *
     * @param snapshots
     * @return
     */
    @Override
    public Snapshots getLast2(Snapshots snapshots) {
        Optional<Snapshots> lastSnapshots =
            list(Wrappers.<Snapshots>query(snapshots).orderByDesc("build_date")).stream().findFirst();
        return lastSnapshots.isPresent() ? lastSnapshots.get() : null;
    }

    /**
     * 获取最新的构建
     *
     * @param snapshots
     * @return
     */
    @Override
    public Snapshots getLast(Snapshots snapshots) {
        snapshots.setIslast(true);
        Snapshots lastSnapshots = getOne(Wrappers.<Snapshots>query(snapshots));
        return lastSnapshots;
    }

    /**
     * 获取某个时间段内最新的构建
     *
     * @param snapshots
     * @param buildStartDate
     * @param buildEndDate
     * @return
     */
    @Override
    public Snapshots getLast(Snapshots snapshots, long buildStartDate, long buildEndDate) {
        Optional<Snapshots> lastSnapshots = list(
            Wrappers.<Snapshots>query(snapshots).between("build_date", buildStartDate, buildEndDate)
                .orderByDesc("build_date")).stream().findFirst();
        return lastSnapshots.isPresent() ? lastSnapshots.get() : null;
    }

    /**
     * 获取昨日构建快照
     *
     * @param snapshots
     * @return
     */
    @Override
    public Snapshots getYesterdayLast(Snapshots snapshots) {
        long timestamp = System.currentTimeMillis();
        return getSomeDaysAgoLast(snapshots, timestamp, 1L);
    }

    @Override
    public Snapshots getSomeDaysAgoLast(Snapshots snapshots, long timestamp, long days) {
        LocalDate date = Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDate();
        LocalTime time = LocalTime.of(0, 0);
        LocalTime endTime = LocalTime.of(23, 59);
        LocalDateTime start = LocalDateTime.of(date, time);
        LocalDateTime end = LocalDateTime.of(date, endTime);
        //获得时间戳
        LocalDateTime someDaysStart = start.minusDays(days);
        LocalDateTime endDaysStart = end.minusDays(days);
        //获得时间戳
        long someDaysMilliseconds = someDaysStart.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long someDaysEndMilliseconds = endDaysStart.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        Snapshots lastSnapshots = getLast(snapshots, someDaysMilliseconds, someDaysEndMilliseconds);
        return lastSnapshots;
    }
}
