package com.example.seckill.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Timestamp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 *
 * @author 作者
 * @date 2023-03-30
 */
@TableName("t_user")
@ApiModel(value = "", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 用户ID，手机号码 **/
    @ApiModelProperty("用户ID，手机号码")
      private Long id;

    private String nickname;

    /** MD5(MD5(pass明文+固定salt)+salt) **/
    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    private String password;

    private String slat;

    /** 头像 **/
    @ApiModelProperty("头像")
    private String head;

    /** 注册时间 **/
    @ApiModelProperty("注册时间")
    private Timestamp registerData;

    /** 最后一次登录时间 **/
    @ApiModelProperty("最后一次登录时间")
    private Timestamp lastLoginDate;

    /** 登录次数 **/
    @ApiModelProperty("登录次数")
    private Integer loginCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Timestamp getRegisterData() {
        return registerData;
    }

    public void setRegisterData(Timestamp registerData) {
        this.registerData = registerData;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", nickname=" + nickname +
        ", password=" + password +
        ", slat=" + slat +
        ", head=" + head +
        ", registerData=" + registerData +
        ", lastLoginDate=" + lastLoginDate +
        ", loginCount=" + loginCount +
        "}";
    }
}
