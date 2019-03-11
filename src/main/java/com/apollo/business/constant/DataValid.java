package com.apollo.business.constant;

/**
 * @author superlee
 * @date 2018/4/11
 */
public enum DataValid {
    VALID("0", "有效，未逻辑删除"),
    INVALID("1", "无效，逻辑删除");

    private String code;
    private String msg;

    DataValid(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }
}
