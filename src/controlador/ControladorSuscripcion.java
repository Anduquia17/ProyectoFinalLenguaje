/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Subscripcion;
import modelo.Usuario;
import singleton.Singleton;

/**
 *
 * @author juanjoanduquia
 */
public class ControladorSuscripcion {

    private ArrayList<Subscripcion> listaDeSuscripciones;

    public ArrayList<Subscripcion> getListaDeSuscripciones() {
        return listaDeSuscripciones;
    }

    public ControladorSuscripcion() {
        this.listaDeSuscripciones = Singleton.getINSTANCE().getListaSubscripcion();
    }

    public Subscripcion buscarSubscripción(int id) {
        for (int i = 0; i < listaDeSuscripciones.size(); i++) {
            if (listaDeSuscripciones.get(i).getIdSuscripcion() == id) {
                return listaDeSuscripciones.get(i);
            }

        }
        return null;

    }

    public boolean guardarSubcripcion(Subscripcion subscripcion, Cliente cliente) {
        for (int i = 0; i < listaDeSuscripciones.size(); i++) {
            if (listaDeSuscripciones.get(i) != null && listaDeSuscripciones.get(i).getIdSuscripcion() == subscripcion.getIdSuscripcion()) {
                return false; // Ya existe una suscripción con ese ID
            }
        }
        // 2) Validar que el cliente NO tenga una suscripción activa
        for (int i = 0; i < cliente.getListaDeSubcripsiones().size(); i++) {
            Subscripcion s = cliente.getListaDeSubcripsiones().get(i);
            if (s != null && s.isEstadoSubs() == true) {
                return false; // El cliente ya tiene una suscripción activa
            }
        }
        // 3) Agregar la nueva suscripción a la lista del cliente y a la lista general
        cliente.getListaDeSubcripsiones().add(subscripcion);
        listaDeSuscripciones.add(subscripcion);
        // 4) Persistir cambios
        Singleton.getINSTANCE().escribirSubscricion();
        return true;

    }

    public boolean generarCobro(Subscripcion subscripcion, Cliente cliente) {

        for (int i = 0; i < listaDeSuscripciones.size(); i++) {
            if (listaDeSuscripciones.get(i).getIdSuscripcion() == subscripcion.getIdSuscripcion()) {
                listaDeSuscripciones.get(i).setValorBase(subscripcion.calcularSubs(i));
                Singleton.getINSTANCE().escribirSubscricion();
                return true;
            }

        }
        return false;
    }

    public DefaultTableModel listarSubs() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Id subscripción", "Tipo Subscripción", "Horas disponibles", "Valor Base"});
        for (int i = 0; i < getListaDeSuscripciones().size(); i++) {
            if (getListaDeSuscripciones().get(i) != null) {
                model.addRow(new Object[]{getListaDeSuscripciones().get(i).getIdSuscripcion(),
                    getListaDeSuscripciones().get(i).getTipo(),
                    getListaDeSuscripciones().get(i).getHorasDisponibles(),
                    getListaDeSuscripciones().get(i).getValorBase()});
            }

        }
        return model;
    }

}
