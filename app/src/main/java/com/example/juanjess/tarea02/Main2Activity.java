package com.example.juanjess.tarea02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

// Esta viene a ser la segunda ventana de la aplicacion

public class Main2Activity extends AppCompatActivity {
    Adapter adaptador;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Usuario> listaobtenida = (ArrayList<Usuario>) getIntent().getSerializableExtra("getlista");
        lista = (ListView) findViewById(R.id.Lista);
                adaptador = new Adapter(this,listaobtenida);
                lista.setAdapter(adaptador);
    }
}
