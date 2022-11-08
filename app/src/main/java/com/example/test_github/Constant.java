package com.example.test_github;

public class Constant {
    //数据库名称
    public static String DATABASE_NAME = "Cooking";

    //版本号
    public static final int VERSION_CODE = 1;

    //创建原料库表Material_Store_Table的语句
    public static String Create_Material_Store_Table = "create table if not exists Material_Store_Table(_id integer primary key autoincrement,Material_Name text,Material_Picture blog,Material_Function text,Material_Introduction text,Material_Heat text,Special_Request text)";

    //创建本次实践表Practice_Table的语句
    public static String Create_Practice_Table = "create table if not exists Practice_Table(_id integer primary key autoincrement,Recipe_Num text,Recipe_Name text,Recipe_Time text,Recipe_Type text,Recipe_Material text,Recipe_Weight text)";

    //创建食谱表Recipe_Table的语句
    public static String Recipe_Table = "create table if not exists Recipe_Table(_id integer primary key autoincrement,Publisher_ID text,Recipe_Cover blog,Recipe_Number text,Recipe_Name text,Recipe_Time text,Recipe_Type text,Recipe_Material text,Recipe_Material_Weight text,Recipe_Process_Text text)";

}
