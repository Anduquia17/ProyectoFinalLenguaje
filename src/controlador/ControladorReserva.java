/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Maquina;
import modelo.Reserva;
import singleton.Singleton;

/**
 *
 * @author juanjoanduquia
 */
public class ControladorReserva {

    private ArrayList<Reserva> listaReserva;

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public ControladorReserva() {
        this.listaReserva = Singleton.getINSTANCE().getListaDereservas();
    }

    public Reserva buscarReserva(int idReserva) {
        for (int i = 0; i < listaReserva.size(); i++) {
            if (listaReserva.get(i).getIdReserva() == idReserva) {
                return listaReserva.get(i);

            }

        }
        return null;
    }

    public boolean guardarReserva(Cliente cliente, Reserva reserva, Maquina maquina) {
        if (cliente.getEdad() >= maquina.getEdadMinima() && cliente.getListaDeReservas().size() <= 2) {
            cliente.getListaDeReservas().add(reserva);
            Singleton.getINSTANCE().escribirReserva();
            return true;

        }
        return false;

    }

    public boolean eliminarReserva(int idReserva, Cliente cliente) {
        for (int i = 0; i < listaReserva.size(); i++) {
            Reserva reserva = listaReserva.get(i);
            if (listaReserva.get(i).getIdReserva() == idReserva
                    && LocalDate.now().plusDays(1).isEqual(listaReserva.get(i).getFechaReserva().toLocalDate())) {
                listaReserva.remove(i);
                cliente.getListaDeReservas().remove(reserva);
                Singleton.getINSTANCE().escribirReserva();
                return true;

            }

        }
        return false;

    }

}
