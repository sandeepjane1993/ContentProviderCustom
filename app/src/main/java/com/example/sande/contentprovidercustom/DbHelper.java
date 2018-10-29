package com.example.sande.contentprovidercustom;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.sande.contentprovidercustom.DataContract.*;

public class DbHelper extends SQLiteOpenHelper {

    private static final String sql = " CREATE TABLE " +
            FeedEntry.TABLE_NAME + " ( " +
            FeedEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            FeedEntry.EMP_NAME + " TEXT, " +
            FeedEntry.EMP_AGE + " INTEGER, " +
            FeedEntry.EMP_EMAIL + " TEXT) ";
    public DbHelper( Context context) {
        super(context, "contentdb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
