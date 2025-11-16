/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Maquina;
import modelo.Usuario;

/**
 *
 * @author juanjoanduquia
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Maquina> listaDeMaquinas;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Maquina> getListaDeMaquinas() {
        return listaDeMaquinas;
    }
    

    public Singleton() {
        this.listaUsuarios = leerUsuario();
        this.listaDeMaquinas = leerMaquina();
    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }

    public void escribirUsuario() {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("listasUsuario.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(listaUsuarios);
        } catch (IOException ex) {
        }
    }

    private ArrayList<Usuario> leerUsuario() {
        try {
            FileInputStream archivo
                    = new FileInputStream("listasUsuario.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Usuario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

    //ESCRIBIR Y LEER POR CADA LISTA
    public void escribirMaquina() {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("listaMaquinas.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(listaDeMaquinas);
        } catch (IOException ex) {
        }
    }

    private ArrayList<Maquina> leerMaquina() {
        try {
            FileInputStream archivo
                    = new FileInputStream("listaMaquinas.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            ArrayList<Maquina> listaDeMaquinas
                    = (ArrayList<Maquina>)lector.readObject();
            lector.close();;
            return listaDeMaquinas;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
}
