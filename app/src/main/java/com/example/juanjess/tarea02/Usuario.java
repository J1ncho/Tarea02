package com.example.juanjess.tarea02;

public class Usuario {
    public int img;
    public String nombre;
    public String telefono;
    public String correo;

    public Usuario(int img, String nombre, String telefono, String correo) {
        this.img = img;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
}
