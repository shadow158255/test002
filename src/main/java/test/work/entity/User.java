package test.work.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;
    @TableField("password")
    private String password;
    @TableField("username")
    private String username;
    @TableField("isFreezing")
    private String isFreezing;

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIsFreezing() {
        return isFreezing;
    }

    public void setIsFreezing(String isFreezing) {
        this.isFreezing = isFreezing;
    }


}
