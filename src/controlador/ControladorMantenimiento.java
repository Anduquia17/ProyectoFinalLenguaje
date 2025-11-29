/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;
import modelo.Mantenimiento;
import modelo.Maquina;
import singleton.Singleton;

/**
 *
 * @author juanjoanduquia
 */
public class ControladorMantenimiento {

    ControladorMaquina controladorMaq;

    public ControladorMantenimiento() {
        this.controladorMaq = new ControladorMaquina();
    }

    public boolean generarBloqueo(Maquina maquina, Mantenimiento mantenimiento) {
        for (int i = 0; i < controladorMaq.getListaDeMaquinas().size(); i++) {
            if (controladorMaq.getListaDeMaquinas().get(i).getIdMaquina() == maquina.getIdMaquina()) {
                if (controladorMaq.getListaDeMaquinas().get(i).isDisponible() == true) {
                    controladorMaq.getListaDeMaquinas().get(i).setDisponible(false);
                    controladorMaq.getListaDeMaquinas().get(i).setMantenimiento(mantenimiento);
                    Singleton.getINSTANCE().escribirMaquina();
                    return true;
                }
            }

        }
        return false;

    }

    public boolean eliminarBloqueo(int id) {
        for (int i = 0; i < controladorMaq.getListaDeMaquinas().size(); i++) {
            if (controladorMaq.getListaDeMaquinas().get(i).getIdMaquina() == id) {
                if (controladorMaq.getListaDeMaquinas().get(i).isDisponible() == false) {
                    controladorMaq.getListaDeMaquinas().get(i).setDisponible(true);
                    controladorMaq.getListaDeMaquinas().get(i).setMantenimiento(null);
                    Singleton.getINSTANCE().escribirMaquina();
                    return true;

                }
            }

        }
        return false;

    }

    public boolean eliminarBloqueoAutomaticamente(Maquina maquina, Mantenimiento mantenimiento) {
        if(mantenimiento == null){
            return false;
        }
        if (mantenimiento.getFechaInicioMan().isEqual(mantenimiento.getFechaFinMan())) {
            maquina.setDisponible(true);
            maquina.setMantenimiento(null);
            Singleton.getINSTANCE().escribirMaquina();
            return true;

        }
        return false;

    }

    public DefaultTableModel mostraMotivos() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Id Maquina", "Motivo", "Fecha Inicio", "Fecha fin"});
        for (int i = 0; i < controladorMaq.getListaDeMaquinas().size(); i++) {
            if (controladorMaq.getListaDeMaquinas().get(i) != null) {
                if (controladorMaq.getListaDeMaquinas().get(i).getMantenimiento() != null) {
                    model.addRow(new Object[]{controladorMaq.getListaDeMaquinas().get(i).getIdMaquina(),
                        controladorMaq.getListaDeMaquinas().get(i).getMantenimiento().getMotivo(),
                        controladorMaq.getListaDeMaquinas().get(i).getMantenimiento().getFechaFinMan(),
                        controladorMaq.getListaDeMaquinas().get(i).getMantenimiento().getFechaFinMan(),});
                }

            }

        }
        return model;
    }

}
