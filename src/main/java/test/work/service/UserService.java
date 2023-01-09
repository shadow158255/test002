package test.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import test.work.entity.User;

public interface UserService extends IService<User> {
    User getUserByUsername(String username);
}
