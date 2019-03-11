package com.apollo.business.constant;

/**
 * Created by superlee on 2017/11/6.
 * [1000 - 1999] 登录注册，权限校验
 * [3000 - 3999] 项目模块
 * [2000 - 2999]  信用模块
 * [9000 - 9999]  系统通用模块
 * [4000 - 4999] 数据获取模块
 */
public enum Code {
    //通用部分
    UNDEFINED(-1, "未定义"),
    SUCCESS(0, "成功"),
    NONE(1, "应收款不存在"),

    // superlee start
    USER_EXIST(1100,"用户已存在"),
    USER_NOT_EXIST(1101,"用户不存在"),
    COMPANY_EXIST(1102,"企业已存在"),
    COMPANY_NOT_EXIST(1103,"企业不存在"),

    USER_OPERATION_INVALID(1104,"对用户操作不合法"),

    RELATION_USER_ROLE_NOT_EXIST(1200,"用户角色关系不存在"),
    RELATION_ROLE_RESOURCE_NOT_EXIST(1201,"角色资源关系不存在"),
    RELATION_USER_ROLE_IS_EXIST(1202,"用户角色关系已存在"),

    CUSTOM_EXIST(1300,"客户已存在"),

    ROLE_NOT_EXIST(1400,"角色不存在"),

    ROLE_CANNOT_DELETE(1401,"角色不能删除"),
    // superlee end

    // gcg start
    CUSTOMER_NOT_EXIST(3000, "客户不存在"),
    PROJECT_NOT_EXIST(3001, "项目不存在"),
    AUDIT_ERROR(3002, "审核结果错误"),
    REASON_NONE(3003, "需要输入理由"),
    DEVICE_DUP(3004, "设备重复"),
    ATTACH_NOT_EXIST(3005, "附件不存在"),
    PROJECT_AUDIT_REA(3006, "项目已经被审核"),
    PROJECT_NOT_UPDATE(3007, "项目不能被修改"),
    ELENUM_EXSIT(3008, "电子账户重复"),
    DEVICE_BIND(3009, "设备已绑定"),
    PROJECT_NOT_ADD(3010, "项目不能补充信息"),
    FROM_NULL(3011, "需要选择资方"),
    CUSTOMER_DUP(3012, "客户不能重复接项目"),
    DEVICE_NOT_EXSIT(3013, "设备不存在"),
    ELENUM_BIND(3014, "电子账户已绑定"),
    BANK_BIND(3015, "银行卡已绑定"),
    RELATION_NOT_EXSIT(3016, "角色关系没有找到"),
    RELATION_ERROR(3017, "关联企业角色错误"),
    DEVICE_TYPE_ERROR(3018, "设备类型错误"),
    ELE_ERROR(3019, "电子账户生成失败"),
    PROJECT_AUDIT_ERROR(3020, "项目没有权限"),
    PROJECT_REPAY_ERROR(3021, "项目不能还款"),
    DEVICE_NOT_BIND(3022, "设备未绑定"),
    CUSTOMER_HAS_PROJECT(3023, "客户存在项目不可删除"),
    PROJECT_NOT_DELETE(3024, "项目不可删除"),
    DEVICE_NOT_DELETE(3025, "设备不可删除"),
    RELATION_NOT_DELETE(3026, "关系不可删除"),
    PROJECT_TYPE_ERROR(3027, "项目类型错误"),
    NOT_FACTOR(3028, "企业不为保理商"),
    NOT_BROKERAGE(3029, "企业不为券商"),
    ASSERPACK_NOT_EXSIT(3030, "资产包不存在"),
    ASSERPACK_NOT_UPDATE(3031, "资产包不允许修改"),
    ASSERPACK_NOT_ISSUED(3032, "资产包不允许发行"),
    ASSERPACK_ALREADY_RELATION(3033, "项目已关联资产包"),
    A_NOT_EXSIT(3034, "A级不存在"),
    SEC_NOT_EXSIT(3035, "次级不存在"),

    AUTH_NOT(3036, "请先认证"),

    // gcg end

    PERMISSION_DENIED(9001, "权限拒绝"),
    UNKNOWN_ABNORMAL(9002, "未知异常"),
    INVALID_USER(9003, "账户不存在，该用户可能未注册或已失效"),
    ACCOUNT_KEY_EMPTY(9004, "用户名为空"),
    ACCOUNT_ALREADY_EXIST(9005, "用户名已存在"),
    ERROR_PASSWORD(9006, "密码错误"),
    PASSWORD_ERROR_TIME_OVER(9007, "错误次数超过限制"),
    ACCOUNT_STILL_LOCK(9008, "账户仍处于锁定状态"),
    ACCOUNT_FROZEN(9009, "账户被冻结"),

    TOKEN_FORMAT_ERROR(9109, "token格式错误，不是有效token"),
    TOKEN_INVALID(9110, "token过期"),
    TOKEN_CRYPT_ERROR(9111, "token加解密异常"),

    HYPERCHAIN_ERROR(9100, "区块链异常"),

    JSON_TRANSFER_ERROR(9200, "JSON转化异常"),

    CLIENT_NOT_REGISTER(9300,"业务系统未注册"),
    CLIENT_ALREADY_REGISTER(9301,"业务系统已注册"),

    CLIENT_ROLE_NOT_EXIST(9400,"该业务系统该角色不存在"),

    PARAMETER_ERROR(9998,"参数校验异常"),
    SYSTEM_ERROR(9999, "系统异常，请稍后重试"),


    // cmt begin


    ASSET_POOL_EXIST(2001,"资金池已注册"),
    ASSET_POOL_INSERT_FAILED(2002,"资金池插入失败"),
    ASSET_POOL_UPDATE_FAILED(2003,"资金池修改失败"),
    ASSET_POOL_NOT_FOUND(2004,"资金池未找到"),
    ASSET_POOL_DEFICIENCY(2005,"资金池余额不足"),
    ASSET_POOL_OF_FIRM_DEFICIENCY(2006,"经销商上一级厂商的资产池额度不足"),
    ASSET_ADDAMOUNT_CAN_NOT_BE_NEGATIVE(2007,"追加资金池额度不可为负数"),
    CREDIT_EXIST(2011,"授信已存在"),
    CREDIT_INSERT_FAILE(2012,"授信插入失败"),
    CREDIT_FREEZE_FAIL(2013,"授信冻结失败"),
    CREDIT_NOT_FOUND(2014,"未找到授信记录"),
    CREDIT_UPDATE_FAIL(2015,"授信修改失败"),
    CREDIT_AVAILABLE_SHORTAGE(2016,"授信可用额度不够"),
    CREDIT_ADDAMOUNT_CAN_NOT_BE_NEGATIVE(2017,"追加授信值不可为负数"),

    PROJECT_LOG_ADD_FAIL(2021,"插入项目状态变化日志失败"),
    ASSET_RECORD_NOT_FOUND(2031,"资金池使用流水记录不存在"),

    PROJECT_STATUS_IS_NOT_SUCCEED(2041,"项目状态不为审核通过"),
    PROJECT_STATUS_IS_NOT_IMP(2042,"项目状态不为厂商实施"),
    LOAN_AMOUNT_LARGE_THAN_PROJECT_AMOUNT(2043,"放贷金额大于项目金额"),

    USER_TYPE_NOT_PLANTFORM(2051,"用户类型不为平台管理员"),
    USER_TYPE_NOT_FUNDS(2052,"用户类型不为资金方"),
    USER_TYPE_NOT_FIRM(2053,"用户类型不为厂商"),
    USER_TYPE_NOT_DEALER(2054,"用户类型不为经销商"),

    OPT_CANNOT_YOURSELF(2061,"操作用户不能为自己"),

    // cmt end

    // ZhXiQi begin

    ILLEGAL_OPERATION(4005,"非法操作"),
    DATA_REQUEST_FAIL(4001,"数据请求失败"),
    DATA_EXISTS(4002,"数据已存在"),
    DATA_INEXISTENCE(4003,"数据记录不存在"),
    DATA_FORMAT_ERROR(4004,"数据格式错误"),
    ADD_STATION_STATUS_LOG_FAIL(4006,"记录状态变更失败"),
    ADD_TRANLOG_FAIL(4007,"添加交易记录失败"),
    CHANGING_FAIL(4008,"变更失败"),
    PURCHASE_FAIL(4009,"购买失败"),
    AUTH_FAIL(4010,"认证通过失败"),
    AUTH_REFUSE(4011,"认证拒绝失败"),
    ROLLBACK_FAIL(4012,"撤回转让失败"),
    TRANSFER_FAIL(4013,"发布转让信息失败"),
    CHECK_FAIL(4014,"验收失败"),
    // ZhXiQi end

    // loy begin

    FILE_NOT_EXIST(5001,"文件不存在");

    // loy end
    private int code;
    private String msg;

    // 构造方法
    Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static String getMsgByCodeInt(int codeInt) {
        for (Code e : Code.values()) {
            if (e.getCode() == codeInt) {
                return e.msg;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }

    public static Code getCodeByCodeInt(int codeInt) {
        for (Code code : Code.values()) {
            if (code.getCode() == codeInt) {
                return code;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }


}
