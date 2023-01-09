package test.work.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import test.work.entity.Info;
import test.work.mapper.InfoMapper;
import test.work.service.InfoService;

import java.util.List;

@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public List<Info> getInfos(Info info) {
        //获取条件值
        String name = info.getName();
        String phoneNumber =info.getPhoneNumber();
        //封装条件
        //根据姓名和手机好筛选
        QueryWrapper<Info> wrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(name)) {
            wrapper.like("name",name);
        }
        if(!StringUtils.isEmpty(phoneNumber)) {
            wrapper.ge("phone_number",phoneNumber);
        }
        //调用mapper方法
        List<Info> infos = infoMapper.selectList(wrapper);
        return infos;
    }


}
