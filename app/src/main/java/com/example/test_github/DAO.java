package com.example.test_github;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public class DAO {

    private DBHelper helper;

    public DAO(Context context) {
        //创建数据库,ctrl+alt+f可以让一个变量变成成员变量
        helper = new DBHelper(context);

    }

    public void insert(String sql){
        SQLiteDatabase db = helper.getReadableDatabase();
        db.execSQL(sql);

    }

    public void delete(String sql){
        SQLiteDatabase db = helper.getReadableDatabase();
        db.execSQL(sql);

    }

    public void update(String sql){
        SQLiteDatabase db = helper.getReadableDatabase();
        db.execSQL(sql);
    }


}