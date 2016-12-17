package com.example.fredy.basedatos;

/**
 * Created by Fredy on 16/12/2016.
 */
//Esta clase se va a encargar de las operaciones CRUD
public class BdManager {
    public static final String TABLE_NAME ="TUsuario";
    public static final String CN_ID = "id";
    public static final String CN_NAME = "usuario";
    public static final String CN_PASS = "contrasena";

    public static final String CREATE_TABLE = "create table " +TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_NAME + " varchar,"
            + CN_PASS + " varchar);";



}
