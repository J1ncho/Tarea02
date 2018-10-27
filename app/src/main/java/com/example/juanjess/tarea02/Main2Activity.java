package com.example.juanjess.tarea02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

// Esta viene a ser la segunda ventana de la aplicacion

public class Main2Activity extends AppCompatActivity {

    Adapter adaptador;
    ListView lista;
    ArrayList<Usuario> arrayList = new ArrayList<>();


    ArrayList<String> lnombre = new ArrayList<>();
    ArrayList<String> ltelefono = new ArrayList<>();
    ArrayList<String> lcorreo = new ArrayList<>();
    ArrayList<Integer> lphoto = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        lista = (ListView) findViewById(R.id.Lista);

        lnombre = getIntent().getStringArrayListExtra("nombre");
        ltelefono = getIntent().getStringArrayListExtra("telefono");
        lcorreo = getIntent().getStringArrayListExtra("correo");
        lphoto = getIntent().getIntegerArrayListExtra("image");

        for(int i=0; i<lnombre.size();i++){
            arrayList.add(new Usuario(lphoto.get(i),lcorreo.get(i),ltelefono.get(i),lcorreo.get(i)));
        }
        adaptador = new Adapter(Main2Activity.this, arrayList);
        lista.setAdapter(adaptador);

    }
}
