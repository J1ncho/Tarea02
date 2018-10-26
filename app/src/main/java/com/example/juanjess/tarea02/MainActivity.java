package com.example.juanjess.tarea02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView Lista;
    Button Agregar;
    Button Mostrar;
    EditText Nombre;
    EditText Telefono;
    EditText Correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Agregar=(Button)findViewById(R.id.btnagregar);
        Mostrar=(Button)findViewById(R.id.btnmostrar);
        Nombre=(EditText)findViewById(R.id.txtnombre);
        Telefono=(EditText)findViewById(R.id.txttelefono);
        Correo=(EditText)findViewById(R.id.txtcorreo);
        Usuario lista_usuarios[] = new Usuario[100];

        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Nombre.getText().toString()!="" && Telefono.getText().toString() !="" && Correo.getText().toString()!="") {
                    new Usuario(R.drawable.ic_launcher, Nombre.getText().toString(), Telefono.getText().toString(), Correo.getText().toString());
                }
            }
        });
    }
}
