package com.mall.common;

public class Constant {
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role {
        int CUSTOMER = 0; // 普通用户
        int ADMIN = 1; // 管理员
    }
}
