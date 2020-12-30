/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHandler extends SQLiteOpenHelper{

    private static final String LOG_TAG = "DATABASEHANDLER";

    private static final String DATABASE_NAME = "soundbox.france.v2";
    private static final int DATABASE_VERSION = 6;

    private static final String MAIN_TABLE = "main_table";

    private static final String FAVORITES_TABLE = "favorites_table";

    private static final String FAVORITES_ID = "_id";
    private static final String FAVORITES_NAME = "favoName";
    private static final String FAVORITES_CATEGORIES = "favoCategories";
    private static final String FAVORITES_ITEM_ID = "favoId";
    private static final String FAVORITES_ITEM_IMAGE = "favoImage";
    private static final String SQL_CREATE_FAVORITES_TABLE = "CREATE TABLE IF NOT EXISTS " + FAVORITES_TABLE + "(" + FAVORITES_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FAVORITES_NAME + " TEXT, " + FAVORITES_ITEM_ID + " INTEGER, " + FAVORITES_ITEM_IMAGE + " INTEGER, " + FAVORITES_CATEGORIES + "INTEGER );";

    private static final String CUSTOM_TABLE = "custom_table";

    private static final String CUSTOM_ID = "_id";
    private static final String CUSTOM_NAME = "customName";
    private static final String CUSTOM_ITEM_ID = "customId";
    private static final String SQL_CREATE_CUSTOM_TABLE = "CREATE TABLE IF NOT EXISTS " + CUSTOM_TABLE + "(" + CUSTOM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CUSTOM_NAME + " TEXT, " + CUSTOM_ITEM_ID + " TEXT );";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d(LOG_TAG, "Database successfully initialised: " + getDatabaseName());
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(SQL_CREATE_FAVORITES_TABLE);
            db.execSQL(SQL_CREATE_CUSTOM_TABLE);
        }catch (Exception e){
            Log.e(LOG_TAG, " " +e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + MAIN_TABLE);
        onCreate(db);
    }

    private boolean verification(SQLiteDatabase database, Integer soundId){
        int count = -1;
        Cursor cursor = null;
        try {
            String query = "SELECT * FROM " + DatabaseHandler.FAVORITES_TABLE + " WHERE " + DatabaseHandler.FAVORITES_ITEM_ID + " = " +  +soundId ;
            cursor = database.rawQuery(query, null);
            if (cursor.moveToFirst()){
                count = cursor.getInt(0);
            }
            return (count > 0);
        } finally {
            if (cursor != null){
                cursor.close();
            }
        }
    }

    public void addFavorite(SoundObject soundObject) {
        SQLiteDatabase database = this.getWritableDatabase();
        if (!verification(database, soundObject.getItemID()) ) {
            try{
                ContentValues contentValues = new ContentValues();
                contentValues.put(FAVORITES_NAME, soundObject.getItemName());
                contentValues.put(FAVORITES_ITEM_ID, soundObject.getItemID());
                contentValues.put(FAVORITES_ITEM_IMAGE, soundObject.getItemImage());
                database.insert(FAVORITES_TABLE, null, contentValues);
            } catch (Exception e){
                Log.e(LOG_TAG, "(FAVORIS) Erreur lors de l'insertion des sons: " + e.getMessage());
            } finally {
                database.close();
            }
        } else {
            Log.e(LOG_TAG, "(FAVORIS) Erreur lors de la vérification des sons: ");
        }
    }

    public void removeFavorite(Context context, SoundObject soundObject) {
        SQLiteDatabase database = this.getWritableDatabase();
        if (verification(database, soundObject.getItemID()) ) {
            try {
                database.delete(FAVORITES_TABLE, FAVORITES_ITEM_ID + " = " + soundObject.getItemID(), null);
                Activity activity = (Activity) context;
                Intent intent = activity.getIntent();
                activity.overridePendingTransition(0,0);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                activity.finish();
                activity.overridePendingTransition(0,0);
                context.startActivity(intent);
            } catch (Exception e){
                Log.e(LOG_TAG, "(FAVORITES) Erreur lors de la suppression du son: " + e.getMessage());
            } finally {
                database.close();
            }
        } else {
            Log.e(LOG_TAG, "(FAVORIS) Erreur lors de la vérification des sons: ");
        }
    }

    public Cursor getFavorites(){
        SQLiteDatabase database = this.getReadableDatabase();
        return database.rawQuery("SELECT * FROM " + FAVORITES_TABLE + " ORDER BY " + FAVORITES_NAME, null);
    }

    public void clearAll(Context context){
        try (SQLiteDatabase database = this.getWritableDatabase()) {
            database.delete(FAVORITES_TABLE, null, null);
            Activity activity = (Activity) context;
            Intent intent = activity.getIntent();
            activity.overridePendingTransition(0, 0);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            activity.finish();
            activity.overridePendingTransition(0, 0);
            context.startActivity(intent);
        } catch (Exception e) {
            Log.e(LOG_TAG, "(FAVORITES) Erreur lors de la suppression du son: " + e.getMessage());
        }
    }

    public void addCustom(SoundObject soundObject) {
        try (SQLiteDatabase database = this.getWritableDatabase()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(CUSTOM_NAME, soundObject.getItemName());
            contentValues.put(CUSTOM_ITEM_ID, soundObject.getItemUri().toString());
            database.insert(CUSTOM_TABLE, null, contentValues);
        } catch (Exception e) {
            Log.e(LOG_TAG, "(CUSTOM) Erreur lors de l'insertion des sons: " + e.getMessage());
        }
    }

    public void removeCustom(Context context, SoundObject soundObject) {
        try (SQLiteDatabase database = this.getWritableDatabase()) {
            database.delete(CUSTOM_TABLE, CUSTOM_NAME + " = " + "'" + soundObject.getItemName() + "'", null);
            Activity activity = (Activity) context;
            Intent intent = activity.getIntent();
            activity.overridePendingTransition(0, 0);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            activity.finish();
            activity.overridePendingTransition(0, 0);
            context.startActivity(intent);
        } catch (Exception e) {
            Log.e(LOG_TAG, "(CUSTOM) Erreur lors de la suppression du son: " + e.getMessage());
        }
    }

    public Cursor getCustom(){
        SQLiteDatabase database = this.getReadableDatabase();
        return database.rawQuery("SELECT * FROM " + CUSTOM_TABLE + " ORDER BY " + CUSTOM_NAME, null);
    }

    public void clearAllCustom(Context context){
        try (SQLiteDatabase database = this.getWritableDatabase()) {
            database.delete(CUSTOM_TABLE, null, null);
            Activity activity = (Activity) context;
            Intent intent = activity.getIntent();
            activity.overridePendingTransition(0, 0);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            activity.finish();
            activity.overridePendingTransition(0, 0);
            context.startActivity(intent);
        } catch (Exception e) {
            Log.e(LOG_TAG, "(CUSTOM) Erreur lors de la suppression du son: " + e.getMessage());
        }
    }
}
