package com.ashkin.findfriends.app;

/**
 * Config
 * 配置常量
 */
public class Config {

    public static final String PACKAGE = "com.ashkin.findfriends";

    // Bmob Application ID
    /** Bmob SDK Key */
    public static final String BMOB_APPLICATION_ID = "21e171e35b32181bcd59078894baeb36";

    // DataUtil SharedPreferences Key
    public static final String SP_REMEMBER_ACCOUNT = "RememberAccount";

    // StringUtil Key
    /** email regex，email 的正则表达式 */
    public static final String EMAIL_REGEX = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
    /** number regex，数字的正则表达式 */
    public static final String NUMBER_REGEX = "[1-9][0-9]{4,}";
}
