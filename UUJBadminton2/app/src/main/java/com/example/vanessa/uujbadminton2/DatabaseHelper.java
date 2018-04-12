package com.example.vanessa.uujbadminton2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vanessa.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    //database version
    private static final int DATABASE_VERSION = 1;

    //database name
    private static final String DATABASE_NAME= "MyDatabase.db";

    //table register
    public static final String TABLE_NAME = "tblRegister";
    public static final String COL_1= "ID";
    public static final String COL_2= "FullName";
    public static final String COL_3= "Username";
    public static final String COL_4= "Password";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE" + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, FullName TEXT, Username TEXT, Password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME); //Drop older table if one exists
        onCreate(db);

    }
}
