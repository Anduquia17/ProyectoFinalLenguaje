/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author juanjoanduquia
 */
public class Mantenimiento implements Serializable{
    
    private String motivo;
    private LocalDate fechaInicioMan;
    private LocalDate fechaFinMan;

    public Mantenimiento(String motivo, LocalDate fechaInicioMan, LocalDate fechaFinMan) {
        this.motivo = motivo;
        this.fechaInicioMan = fechaInicioMan;
        this.fechaFinMan = fechaFinMan;
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
    
    
   
    
}
