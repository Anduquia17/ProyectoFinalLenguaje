/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author juanjoanduquia
 */
public class Mantenimiento implements Serializable {

    private Maquina maquina;
    private String motivo;
    private LocalDate fechaInicioMan;
    private LocalDate fechaFinMan;
    private int diasRestantes;
    private boolean activa;

    public Mantenimiento(String motivo, LocalDate fechaInicioMan, LocalDate fechaFinMan, boolean activa, Maquina maquina, int diasRestantes) {
        this.motivo = motivo;
        this.fechaInicioMan = fechaInicioMan;
        this.fechaFinMan = fechaFinMan;
        this.activa = false;
        this.maquina = this.maquina;
        this.diasRestantes = diasRestantes;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getFechaInicioMan() {
        return fechaInicioMan;
    }

    public void setFechaInicioMan(LocalDate fechaInicioMan) {
        this.fechaInicioMan = fechaInicioMan;
    }

    public LocalDate getFechaFinMan() {
        return fechaFinMan;
    }

    public void setFechaFinMan(LocalDate fechaFinMan) {
        this.fechaFinMan = fechaFinMan;
    }

    public long CalcularDiasRestantes() {
        long diasRestantes = ChronoUnit.DAYS.between(fechaInicioMan, fechaInicioMan);
        return diasRestantes;
    }

}
