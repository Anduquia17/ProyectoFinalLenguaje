package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Usuario;
import singleton.Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author juanjoanduquia
 */
public class ControladorUsuario {

    ArrayList<Usuario> listaUsuarios;

    public ControladorUsuario() {
        listaUsuarios = Singleton.getINSTANCE().getListaUsuarios();

    }

    Usuario admin = new Usuario(1, "123", "123", "Administrador");

    public Usuario login(String correo, String contraseña) {
        if (correo.equals(admin.getCorreo()) && contraseña.equals(admin.getContraseña())) {
            return admin;
        } else {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).getCorreo().equals(correo) && listaUsuarios.get(i).getContraseña().equals(contraseña)) {
                    return listaUsuarios.get(i);
                }
            }
            return null;

        }
    }

    public Usuario buscarUsuario(int id) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getId() == id) {
                return listaUsuarios.get(i);

            }

        }
        return null;

    }

    public Cliente buscarCliente(int id) {
        Usuario aux = buscarUsuario(id);
        if (aux != null && aux instanceof Cliente) {
            return (Cliente) aux;

        }
        return null;
    }

    public boolean guardarCliente(Cliente cliente) {
        Cliente aux = buscarCliente(cliente.getId());
        if (aux == null) {
            listaUsuarios.add(cliente);
            Singleton.getINSTANCE().escribirUsuario();
            return true;
        }
        return false;
    }

}
