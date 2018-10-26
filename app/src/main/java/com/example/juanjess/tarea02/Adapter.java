package com.example.juanjess.tarea02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<Usuario> listaUsuarios;

    public Adapter(Context context, ArrayList<Usuario> listaUsuarios) {
        this.context = context;
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public int getCount() {
        return listaUsuarios.size();
    }

    @Override
    public Object getItem(int position) {
        return listaUsuarios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Usuario User = (Usuario) getItem(position);

        convertView= LayoutInflater.from(context).inflate(R.layout.vista_usuario, null);
        ImageView Imagen = (ImageView) convertView.findViewById(R.id.imagen);
        TextView TxNombre = (TextView) convertView.findViewById(R.id.txt1);
        TextView TxTelefono = (TextView) convertView.findViewById(R.id.txt2);
        TextView TxCorreo = (TextView) convertView.findViewById(R.id.txt3);

        Imagen.setImageResource(User.getImg());
        TxNombre.setText(User.getNombre());
        TxTelefono.setText(User.getTelefono());
        TxCorreo.setText(User.getCorreo());

        return convertView;
    }
}
