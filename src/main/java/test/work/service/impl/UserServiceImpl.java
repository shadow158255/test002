package test.work.service.impl;


import test.work.entity.Info;
import test.work.entity.User;
import test.work.mapper.InfoMapper;
import test.work.mapper.UserMapper;
import test.work.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User getUserByUsername(String username) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        return baseMapper.selectOne(wrapper);

    }
}
