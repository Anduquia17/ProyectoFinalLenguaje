/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Subscripcion;
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
                Singleton.getINSTANCE().escribirSubscricion();
                return listaDeSuscripciones.get(i);
            }

        }
        return null;

    }

    public boolean guardarSubcripcion(Subscripcion subscripcion) {
        Subscripcion aux = buscarSubscripción(subscripcion.getIdSuscripcion());
        if (aux == null) {
            listaDeSuscripciones.add(subscripcion);
            Singleton.getINSTANCE().escribirSubscricion();
            return true;
        }
        return false;
    }
    
    
    
    public DefaultTableModel listarSubs(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String []{"Id subscripción","Tipo Subscripción","Horas disponibles","Valor Base"});
        for (int i = 0; i < getListaDeSuscripciones().size(); i++) {
            if(getListaDeSuscripciones().get(i) != null){
                model.addRow(new Object[]{getListaDeSuscripciones().get(i).getIdSuscripcion(),
                getListaDeSuscripciones().get(i).getTipo(),
                getListaDeSuscripciones().get(i).getHorasDisponibles(),
                getListaDeSuscripciones().get(i).getValorBase()});
            }
            
        }
        return model;
    }

}
