package com.example.test_github;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DBOpenHelper";

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建时的回调
        Log.d(TAG,"创建数据库...");
        db.execSQL(Constant.Create_Material_Store_Table);
        db.execSQL(Constant.Create_Practice_Table);
        db.execSQL(Constant.Recipe_Table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    //上下文，数据库名称，游标，版本号
    public DBHelper(Context context) {
        super(context, Constant.DATABASE_NAME, null, Constant.VERSION_CODE);
    }
}
