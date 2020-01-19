package com.example.mynotes;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NoteDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERISON  =2;
    private static final String DATABASE_NAME  ="MyNotesDB";
    private static final String DATABASE_TABLE ="MyNotesTable";

    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_CONTENT ="content";
    private static final String KEY_DATE = "date";
    private static final String KEY_TIME = "time";


    NoteDB(Context context){
        super(context,DATABASE_NAME,factory: null,DATABASE_VERISON);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
