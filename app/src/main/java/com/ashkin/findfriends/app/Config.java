package com.ashkin.findfriends.app;

/**
 * Config
 * 配置常量
 */
public class Config {

    public static final String PACKAGE = "com.ashkin.findfriends";

    // Bmob Application ID
    /**
     * Bmob SDK Key
     */
    public static final String BMOB_APPLICATION_ID = "21e171e35b32181bcd59078894baeb36";

    // DataUtil SharedPreferences Key
    public static final String SP_REMEMBER_ACCOUNT = "RememberAccount";

    // StringUtil Key
    /**
     * email regex，email 的正则表达式
     */
    public static final String EMAIL_REGEX = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
    /**
     * number regex，数字的正则表达式
     */
    public static final String NUMBER_REGEX = "[1-9][0-9]{4,}";

    // SqlUtil Key
    /**
     * 数据库名
     */
    public static final String SQLITE_DATABASE_NAME = "FindFriends";
    /**
     * 数据库版本
     */
    public static final int SQLITE_DATABASE_VERSION = 1;

    /**
     * 创建表
     * crate table
     */
    /**
     * 创建 User 表
     * create table User
     */
    public static final String SQLITE_DATABASE_CREATE_USER = "";
    /**
     * 创建 Friends 表
     * create table Friends
     */
    public static final String SQLITE_DATABASE_CREATE_FRIENDS = "";

    /**
     * 删除表
     * drop table
     */
    /**
     * 删除 User 表
     * drop table User
     */
    public static final String SQLITE_DATABASE_DROP_USER = "drop table if exists user";
    /**
     * 删除 Friends 表
     * drop table Friends
     */
    public static final String SQLITE_DATABASE_DROP_FRIENDS = "drop table if exists friends";
}
