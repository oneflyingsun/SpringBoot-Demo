package com.apollo.business.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 * @author superlee
 * @date 2017/7/28
 */
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
    @Value("${root_org_code}")
    public String ROOT_ORG_CODE;
    @Value("${root_org_name}")
    public String ROOT_ORG_NAME;
    @Value("${root_org_business_capital}")
    public String ROOT_ORG_BUSINESS_CAPITAL;
    @Value("${root_org_business_scope}")
    public String ROOT_ORG_BUSINESS_SCOPE;
    @Value("${root_org_legal_person}")
    public String ROOT_ORG_LEGAL_PERSON;
    @Value("${root_org_register_authority}")
    public String ROOT_ORG_REGISTER_AUTHORITY;
    @Value("${root_org_establish_date}")
    public Long ROOT_ORG_ESTABLISH_DATE;
    @Value("${root_org_issue_date}")
    public Long ROOT_ORG_ISSUE_DATE;

//    @Value("${mock.host}")
//    public String host;




}
