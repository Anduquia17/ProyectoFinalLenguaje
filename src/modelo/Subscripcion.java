/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author juanjoanduquia
 */
public class Subscripcion implements Serializable {
    
    private TipoSuscripcion tipo;
    private int horasDisponibles;
    private boolean descuento;
    private double valorBase;
    private Cliente cliente;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechafin;
    private boolean activa; 

    public Subscripcion(TipoSuscripcion tipo, int horasDisponibles, boolean descuento, double valorBase, Cliente cliente, LocalDateTime fechaInicio, LocalDateTime fechafin, boolean activa) {
        this.tipo = tipo;
        this.horasDisponibles = horasDisponibles;
        this.descuento = descuento;
        this.valorBase = valorBase;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.activa = activa;
    }

    public TipoSuscripcion getTipo() {
        return tipo;
    }

    public void setTipo(TipoSuscripcion tipo) {
        this.tipo = tipo;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDateTime fechafin) {
        this.fechafin = fechafin;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    
}