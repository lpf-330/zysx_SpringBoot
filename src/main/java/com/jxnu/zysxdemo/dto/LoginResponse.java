package com.jxnu.zysxdemo.dto;


import lombok.Data;

@Data
public class LoginResponse {
    private boolean success;
    private Long user_id;
    private String avatar;
    private Integer age;
    private Double height;
    private Double weight;

    public LoginResponse(boolean b, Object o, Object o1, Object o2, Object o3, Object o4) {
        this.success = b;
        this.user_id = (Long) o;
        this.avatar = (String) o1;
        this.age = (Integer) o2;
        this.height = (Double) o3;
        this.weight = (Double) o4;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
