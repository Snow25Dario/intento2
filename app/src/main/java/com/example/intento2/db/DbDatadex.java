package com.example.intento2.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbDatadex extends  DbHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "pokedex.db";
    //private static final String TABLE_DATADEX= "t_datadex";

    Context context;
    public DbDatadex(@Nullable Context context) {
        super(context);
        this.context =context;
    }
    public long insertarDatadex(String nombre,String numero,String region){
        long id = 0;

        try {
         DbHelper dbHelper = new DbHelper(context);
         SQLiteDatabase db = dbHelper.getWritableDatabase();

         ContentValues values = new ContentValues();
         values.put("nombre", nombre);
         values.put("numero", numero);
         values.put("region", region);

         id = db.insert("t_datadex", null, values);
     }catch (Exception ex){
         ex.toString();
     }
     return id;
    }
}
