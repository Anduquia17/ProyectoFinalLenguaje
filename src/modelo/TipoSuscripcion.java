/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author juanjoanduquia
 */
public enum TipoSuscripcion implements Serializable{
    
    VIP("vip"),
    BASICA("básico");
    
    private String valor;

    private TipoSuscripcion(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
    
     
    
}
