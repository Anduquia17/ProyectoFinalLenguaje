package controlador;

import java.util.ArrayList;
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
    
    Usuario admin = new Usuario("123", "123", "Administrador");

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
    
    
    
    

}

