package test.work.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import test.work.entity.Info;

import java.util.List;

@Repository
public interface InfoMapper extends BaseMapper<Info> {
    List<Info> getInfos();
}
