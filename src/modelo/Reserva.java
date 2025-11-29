/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
                                                    /**POSIBLES CAMBIOS:
                                                     * CAMBIAR EL MODELADO DE LA SUBS (ELIMINAR ENUM),
                                                     * PARA QUE LA SUBSCRIPCION SEA LA CLASE PADRE 
                                                     * AGREGAR UNA CLASE CALENDARIO,
                                                    */
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author juanjoanduquia
 */
public class Reserva implements Serializable{
    
    private int idReserva;
    private Cliente Cliente;
    private Maquina maquina;
    private LocalDateTime fechaReserva;
    private int cantidadHoras;

    public Reserva(int idReserva, Cliente Cliente, Maquina maquina, LocalDateTime fechaReserva, int cantidadHoras) {
        this.idReserva = idReserva;
        this.Cliente = Cliente;
        this.maquina = maquina;
        this.fechaReserva = fechaReserva;
        this.cantidadHoras = cantidadHoras;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    
    
    
}
