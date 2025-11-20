/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author juanjoanduquia
 */
public class Subscripcion implements Serializable {

    private int idSuscripcion;
    private TipoSuscripcion tipo;
    private int horasDisponibles;
    private boolean descuento;
    private double valorBase;
    private Cliente cliente;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechafin;
    private ArrayList<Reserva> listaDeReservas;
    private boolean estadoSubs;

    public Subscripcion(int idSuscripcion, TipoSuscripcion tipo, int horasDisponibles, double valorBase, Cliente cliente, LocalDateTime fechaInicio, LocalDateTime fechafin, boolean estadoSubs) {
        this.idSuscripcion = idSuscripcion;
        this.tipo = tipo;
        this.horasDisponibles = horasDisponibles;
        this.descuento = false;
        this.valorBase = valorBase;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.estadoSubs = estadoSubs;
    }

    public boolean isEstadoSubs() {
        return estadoSubs;
    }

    public void setEstadoSubs(boolean estadoSubs) {
        this.estadoSubs = estadoSubs;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
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

    public void setListaDeReservas(ArrayList<Reserva> listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }

    public double calcularSubs(int horasUsadas) {
        int horasDisponibles = 0;
        double precioHoraExtra = 1000;
        double total = 0;
        if (tipo == TipoSuscripcion.BASICA) {
            valorBase = 12000;
            horasDisponibles = 20;
        } else if (tipo == TipoSuscripcion.VIP) {
            valorBase = 25000;
            horasDisponibles = 48;
        }
        int horasExtra = horasUsadas - horasDisponibles;
        if (horasExtra > 0) {
            double costoHorasExtra = horasExtra * precioHoraExtra;
            if (tipo == TipoSuscripcion.VIP) {
                costoHorasExtra = costoHorasExtra - (costoHorasExtra * 0.20);
            }
            total = valorBase + costoHorasExtra;
        } else {
            total = valorBase;
        }

        return total;
    }

}
