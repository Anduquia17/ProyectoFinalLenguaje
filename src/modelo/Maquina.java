/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author juanjoanduquia
 */
public class Maquina implements Serializable {
    private int idMaquina;
    private int edadMinima;
    private String tipoDeJuego;
    private String genero;
    private double valorHora;
    private Mantenimiento mantenimiento;
    private boolean disponible;

    public Maquina(int idMaquina, int edadMinima, String tipoDeJuego, String genero, double valorHora, boolean disponible) {
        this.idMaquina = idMaquina;
        this.edadMinima = edadMinima;
        this.tipoDeJuego = tipoDeJuego;
        this.genero = genero;
        this.valorHora = valorHora;
        this.disponible = true;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getTipoDeJuego() {
        return tipoDeJuego;
    }

    public void setTipoDeJuego(String tipoDeJuego) {
        this.tipoDeJuego = tipoDeJuego;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

   
    
    
}
