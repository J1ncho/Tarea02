package com.example.juanjess.tarea02;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button Agregar;
    Button Mostrar;
    EditText Nombre;
    EditText Telefono;
    EditText Correo;

    ArrayList<String> lnombre = new ArrayList<>();
    ArrayList<String> ltelefono = new ArrayList<>();
    ArrayList<String> lcorreo = new ArrayList<>();
    ArrayList<Integer> lphoto = new ArrayList<>();

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Agregar=(Button)findViewById(R.id.btnagregar);
        Mostrar=(Button)findViewById(R.id.btnmostrar);
        Nombre=(EditText)findViewById(R.id.txtnombre);
        Telefono=(EditText)findViewById(R.id.txttelefono);
        Correo=(EditText)findViewById(R.id.txtcorreo);

        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Nombre.getText().toString()!="" &&
                        Telefono.getText().toString() !="" &&
                        Correo.getText().toString()!="") {
                    Usuario usuario = new Usuario(R.drawable.ic_launcher,
                            Nombre.getText().toString(),
                            Telefono.getText().toString(),
                            Correo.getText().toString());
                    lnombre.add(usuario.getNombre());
                    ltelefono.add(usuario.getTelefono());
                    lcorreo.add(usuario.getCorreo());
                    lphoto.add(usuario.getImg());



                    Log.d(TAG, " "+ lnombre + " " + ltelefono + " " + lcorreo);

                    Nombre.setText("");
                    Telefono.setText("");
                    Correo.setText("");

                }
            }
        });

        Mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putStringArrayListExtra("nombre",lnombre);
                intent.putStringArrayListExtra("telefono",ltelefono);
                intent.putStringArrayListExtra("correo",lcorreo);
                intent.putIntegerArrayListExtra("image",lphoto);
                startActivity(intent);
            }
        });
    }
}
