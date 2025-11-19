/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

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
                    Singleton.getINSTANCE().escribirMaquina();
                    return true;
                }
            }

        }
        return false;

    }

}
