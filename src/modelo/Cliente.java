/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author juanjoanduquia
 */
public class Cliente extends Usuario implements Serializable {

    private String nombre;
    private int edad;
    private int id;
    private ArrayList<Subscripcion> listaDeSubcripsiones;

    public Cliente(String nombre, int edad, int id, ArrayList<Subscripcion> listaDeSubcripsiones, String correo, String contraseña, String rol) {
        super(correo, contraseña, rol);
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.listaDeSubcripsiones = listaDeSubcripsiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Subscripcion> getListaDeSubcripsiones() {
        return listaDeSubcripsiones;
    }

    public void setListaDeSubcripsiones(ArrayList<Subscripcion> listaDeSubcripsiones) {
        this.listaDeSubcripsiones = listaDeSubcripsiones;
    }

}
