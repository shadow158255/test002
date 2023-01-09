package test.work.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import test.work.entity.Info;
import test.work.service.InfoService;

import java.util.List;

//@RequestMapping("info")
//@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    //查询用户列表/条件查询
    //@GetMapping("infoList")
    public List<Info> list(Info info) {
        //查询用户列表/条件查询
        return infoService.getInfos(info);
    }

    //添加用户详情
    //@PostMapping("addInfo")
    public String addInfo(Info info) {
        //添加用户
        boolean isSuccess = infoService.save(info);
        if (isSuccess){
            return "添加成功！";
        }else{
            return "添加失败！";
        }
    }

    //根据id删除用户详情
    //@DeleteMapping("deleteById/{id}")
    public String deleteById(String id) {
        //
        boolean isSuccess = infoService.removeById(id);
        if (isSuccess){
            return "删除成功！";
        }else{
            return "删除失败！";
        }
    }

    //根据id修改用户详情
    //@PostMapping("updateInfo")
    public String updateInfo(Info info) {
        boolean isSuccess = infoService.updateById(info);
        if (isSuccess){
            return "修改成功！";
        }else{
            return "修改失败！";
        }
    }
    //根据id查询用户详情
    //@GetMapping("getInfoById/{id}")
    public Info getInfoById(String id) {
        Info getInfoById = infoService.getById(id);
       return getInfoById;
    }

}
