package test.work.controller;


import com.sun.jmx.snmp.SnmpUsmKeyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.work.entity.User;
import test.work.service.UserService;

@RequestMapping("index")
@RestController
public class IndexController {
    @Autowired
    private UserService userService;

    int num = 0;
//    @PostMapping("login")
    public String login(User user){
        User userByUsername = userService.getUserByUsername(user.getUsername());
        if (userByUsername == null){
            return "用户名不存在在！请重新输入！";
        }
        if (!user.getPassword().equals(userByUsername.getPassword())){
            num++;
            if (num > 3){
                User user1 = new User();
                user1.setIsFreezing("1");
                userService.save(user1);
            }
            return "密码不正确";
        }
        if (userByUsername.getIsFreezing().equals("1")){
            return "您的账户已冻结，请联系管理员处理！";
        }

        return "登陆成功！";
    }
    //@PostMapping("reg")
    public String reg(User user){
        if (user.getUsername() == null || user.getPassword() == null){
            return "用户名或密码不能为空！";
        }
        User userByUsername = userService.getUserByUsername(user.getUsername());
        if (!(userByUsername == null)){
            return "该用户已存在！请重新输入！";
        }
        User user1 = new User();
        user1.setPassword(user.getPassword());
        user1.setUsername(user.getUsername());
        userService.save(user1);
        return "注册成功！";
    }


    
}
