package com.example.fredy.basedatos;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear una instancia de la clase BdHelper con el contexto como parámetro
        BdHelper helper = new BdHelper(this);
        //Aquí se crea la base de datos
        SQLiteDatabase db = helper.getWritableDatabase();
    }
}
