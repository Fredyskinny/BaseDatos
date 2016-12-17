package com.example.fredy.basedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Fredy on 16/12/2016.
 */
//Está clase necesita de 3 métodos el constructor, onCreate y onUpgrade
public class BdHelper extends SQLiteOpenHelper {
    //Igual son necesarios los siguientes parámetros
    //Nombre del archivo que se va a crear
    public static final String DB_NAME = "BDYOGRAFY.sqlite";
    //Versión del esquema de la base de datos
    public static final int DB_SCHEME_VERSION = 1;

    //Método constructor
    public BdHelper(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    //Crear mediante sentencias SQL las tablas
        sqLiteDatabase.execSQL(BdManager.CREATE_TABLE);
    }

    @Override
    //Se encarga de actualizar el esquema de la base datos
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
