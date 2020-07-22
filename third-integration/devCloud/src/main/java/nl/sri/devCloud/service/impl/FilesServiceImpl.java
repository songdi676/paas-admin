package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Files;
import nl.sri.devCloud.mapper.FilesMapper;
import nl.sri.devCloud.service.IFilesService;
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
public class FilesServiceImpl extends ServiceImpl<FilesMapper, Files> implements IFilesService {

}
