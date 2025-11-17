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

    private String motivo;
    private LocalDate fechaInicioMan;
    private LocalDate fechaFinMan;
    private int diasRestantes;
    private boolean activar;

    public Mantenimiento(String motivo, LocalDate fechaInicioMan, LocalDate fechaFinMan, boolean activa, int diasRestantes) {
        this.motivo = motivo;
        this.fechaInicioMan = fechaInicioMan;
        this.fechaFinMan = fechaFinMan;
        this.activar = false;
        this.diasRestantes = diasRestantes;
    }

    public boolean isActiva() {
        return activar;
    }

    public void setActiva(boolean activa) {
        this.activar = activa;
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

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

}
