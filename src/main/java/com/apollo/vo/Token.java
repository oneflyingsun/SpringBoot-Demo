package com.apollo.vo;

/**
 *
 * @author superlee
 * @date 2017/11/7
 */
public class Token {
    private long timestamp;
    private String pubKey;
    private String role;
    private String cmyCode;
    private Integer cmyType;
    private String cmyName;

    public Token() {
        this.timestamp = System.currentTimeMillis();
    }

    public Token(long timestamp, String pubKey, String role, String cmyCode) {
        this.timestamp = timestamp;
        this.pubKey = pubKey;
        this.role = role;
        this.cmyCode = cmyCode;
    }

    public Token(long timestamp, String pubKey, String role, String cmyCode, Integer cmyType, String cmyName) {
        this(timestamp, pubKey, role, cmyCode);
        this.cmyType = cmyType;
        this.cmyName = cmyName;
    }

    @Override
    public String toString() {
        return "Token{" +
                "timestamp=" + timestamp +
                ", pubKey='" + pubKey + '\'' +
                ", role='" + role + '\'' +
                ", cmyCode='" + cmyCode + '\'' +
                ", cmyType='" + cmyType + '\'' +
                ", cmyName='" + cmyName + '\'' +
                '}';
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCmyCode() {
        return cmyCode;
    }

    public void setCmyCode(String cmyCode) {
        this.cmyCode = cmyCode;
    }


    public Integer getCmyType() {
        return cmyType;
    }

    public void setCmyType(Integer cmyType) {
        this.cmyType = cmyType;
    }

    public String getCmyName() {
        return cmyName;
    }

    public void setCmyName(String cmyName) {
        this.cmyName = cmyName;
    }
}
