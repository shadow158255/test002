package test.work.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class Info implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableField("name")
    private String name;
    @TableField("address")
    private String address;
    @TableField("city")
    private String city;
    @TableField("postcode")
    private String postcode;
    @TableField("licensePlate")
    private String licensePlate;
    @TableField("color")
    private String color;
    @TableField("companySuffix")
    private String companySuffix;
    @TableField("email")
    private String email;
    @TableField("job")
    private String job;
    @TableField("phoneNumber")
    private String phoneNumber;
    @TableField("ip")
    private String ip;

    public Info( String name, String address, String city, String postcode, String licensePlate, String color, String companySuffix, String email, String job, String phoneNumber, String ip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.licensePlate = licensePlate;
        this.color = color;
        this.companySuffix = companySuffix;
        this.email = email;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.ip = ip;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }

    public void setCompanySuffix(String companySuffix) {
        this.companySuffix = companySuffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
