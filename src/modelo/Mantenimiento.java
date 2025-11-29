/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author juanjoanduquia
 */
public class Mantenimiento implements Serializable {

    private String motivo;
    private LocalDateTime fechaInicioMan;
    private LocalDateTime fechaFinMan;
    private int diasRestantes;
    private Maquina maquina;

    public Mantenimiento(String motivo, LocalDateTime fechaInicio, Maquina maquina, int diasRestantes) {
        this.motivo = motivo;
        this.fechaInicioMan = LocalDateTime.now();
        this.fechaFinMan = this.fechaInicioMan.plusDays(diasRestantes);
        this.fechaFinMan = fechaFinMan;
        this.diasRestantes = diasRestantes;
        this.maquina = maquina;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getFechaInicioMan() {
        return fechaInicioMan;
    }

    public void setFechaInicioMan(LocalDateTime fechaInicioMan) {
        this.fechaInicioMan = fechaInicioMan;
    }

    public LocalDateTime getFechaFinMan() {
        return fechaFinMan;
    }

    public void setFechaFinMan(LocalDateTime fechaFinMan) {
        this.fechaFinMan = fechaFinMan;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public long calcularDias() {
        Duration duracion = Duration.between(fechaInicioMan, LocalDate.now().atStartOfDay());
        return duracion.toDays();
    }

}
