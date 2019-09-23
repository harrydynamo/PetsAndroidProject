package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class PetDbHelper extends SQLiteOpenHelper {

    private static final String DATABAE_NAME = "shelter.db";
    private static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABAE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetContract.PetEntry.TABLE_NAME + "(" + PetContract.PetEntry._ID + " INTEGER," + PetContract.PetEntry.COLUMN_PET_NAME + " TEXT," + PetContract.PetEntry.COLUMN_PET_BREED + " TEXT," + PetContract.PetEntry.COLUMN_PET_GENDER + " INTEGER," + PetContract.PetEntry.COLUMN_PET_WEIGHT + " INTEGER)";
        db.execSQL(SQL_CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
