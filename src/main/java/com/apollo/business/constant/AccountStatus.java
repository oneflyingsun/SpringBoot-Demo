package com.apollo.business.constant;


public enum AccountStatus {
    VALID(0, "有效"),
    INVALID(1, "无效"),
    FROZEN(2, "冻结"),
    LOCK(3, "锁定"),
    WAITACTIVE(4,"待激活");

    private int code;
    private String status;

    AccountStatus(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
