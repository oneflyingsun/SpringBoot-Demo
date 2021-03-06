package com.apollo.business.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@PropertySource(value = "classpath:business/read.properties",encoding = "utf-8")
@Component
public final class BusinessConstant {
    @Value("${token_valid_time}")
    public int TOKEN_VALID_TIME;
    @Value("${account_lock_time}")
    public int ACCOUNT_LOCK_MINUTE;
    @Value("${password_error_allow}")
    public int PASSWORD_ERROR_ALLOW;
    @Value("${ip_cal_count}")
    public int IP_CAL_COUNT;
    @Value("${ip_cal_time}")
    public int IP_CAL_TIME;

    @Value("${root_admin_username}")
    public String ROOT_ADMIN_USERNAME;
    @Value("${root_admin_pwd}")
    public String ROOT_ADMIN_PWD;


//    @Value("${mock.host}")
//    public String host;




}
