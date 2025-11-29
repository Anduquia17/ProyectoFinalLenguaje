/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import singleton.Singleton;

/**
 *
 * @author juanjoanduquia
 */
public class Cliente extends Usuario implements Serializable {

    private String nombre;
    private int edad;
    private ArrayList <Subscripcion> listaDeSubcripsiones;
    private ArrayList <Reserva> listaDeReservas;

    public Cliente(String nombre, int edad, int id, String correo, String contraseña, String rol) {
        super(id, correo, contraseña, rol);
        this.nombre = nombre;
        this.edad = edad;
        this.listaDeSubcripsiones = new ArrayList<>();
        this.listaDeReservas = new ArrayList<>();
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

    

    public ArrayList<Subscripcion> getListaDeSubcripsiones() {
        return listaDeSubcripsiones;
    }

    public void setListaDeSubcripsiones(ArrayList<Subscripcion> listaDeSubcripsiones) {
        this.listaDeSubcripsiones = listaDeSubcripsiones;
    }

    public ArrayList<Reserva> getListaDeReservas() {
        return listaDeReservas;
    }

    public void setListaDeReservas(ArrayList<Reserva> listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }
     

}
