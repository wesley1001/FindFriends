package com.ashkin.findfriends.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.ashkin.findfriends.app.Config;

import java.util.List;

/**
 * SQLite Util
 * SQLite 数据库工具类
 */
public class SqlUtil extends SQLiteOpenHelper {

    private static final String TAG = "SqlUtil";

    private static SqlUtil ourInstance = null;

    public static SqlUtil getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new SqlUtil(context, Config.SQLITE_DATABASE_NAME, null, Config.SQLITE_DATABASE_VERSION);
        }
        return ourInstance;
    }

    private SqlUtil(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        LogUtil.i(TAG, "int");

        /**
         * 创建表
         * create tables
         */
        db.execSQL(Config.SQLITE_DATABASE_CREATE_USER);
        db.execSQL(Config.SQLITE_DATABASE_CREATE_FRIENDS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /**
         * 删除表
         * drop tables
         */
        db.execSQL(Config.SQLITE_DATABASE_DROP_FRIENDS);
        db.execSQL(Config.SQLITE_DATABASE_DROP_USER);

        onCreate(db);
    }

    public void insert(String sql) {

    }

    public void delete(String sql) {

    }

    public void update(String sql) {

    }

    public List<Object> query(String sql) {
        List<Object> list = null;

        return list;
    }
}