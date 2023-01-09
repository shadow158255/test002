package test.work.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import test.work.entity.Info;
import test.work.entity.User;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
