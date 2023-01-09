package test.work.service;

import com.baomidou.mybatisplus.extension.service.IService;
import test.work.entity.Info;

import java.util.List;

public interface InfoService extends IService<Info> {

    List<Info> getInfos(Info info);
}
