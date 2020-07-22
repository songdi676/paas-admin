package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Events;
import nl.sri.devCloud.mapper.EventsMapper;
import nl.sri.devCloud.service.IEventsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-20
 */
@Service
public class EventsServiceImpl extends ServiceImpl<EventsMapper, Events> implements IEventsService {

}
