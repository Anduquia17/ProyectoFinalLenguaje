/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Mantenimiento;
import modelo.Maquina;
import singleton.Singleton;

/**
 *
 * @author juanjoanduquia
 */
public class ControladorMaquina {

    private ArrayList<Maquina> listaDeMaquinas;

    public ArrayList<Maquina> getListaDeMaquinas() {
        return listaDeMaquinas;
    }

    public ControladorMaquina() {
        this.listaDeMaquinas = Singleton.getINSTANCE().getListaDeMaquinas();
    }

    public Maquina buscarMaquina(int idMaquina) {
        for (int i = 0; i < listaDeMaquinas.size(); i++) {
            if (listaDeMaquinas.get(i).getIdMaquina() == idMaquina) {

                return listaDeMaquinas.get(i);
            }

        }
        return null;
    }

    public boolean guardarMaquina(Maquina maquina) {
        Maquina aux = buscarMaquina(maquina.getIdMaquina());
        if (aux == null) {
            listaDeMaquinas.add(maquina);
            Singleton.getINSTANCE().escribirMaquina();
            return true;
        }
        return false;

    }

    public boolean editarMaquina(Maquina maquina) {
        for (int i = 0; i < listaDeMaquinas.size(); i++) {
            if (listaDeMaquinas.get(i).getIdMaquina() == maquina.getIdMaquina()) {
                listaDeMaquinas.get(i).setEdadMinima(maquina.getEdadMinima());
                listaDeMaquinas.get(i).setTipoDeJuego(maquina.getTipoDeJuego());
                listaDeMaquinas.get(i).setGenero(maquina.getGenero());
                listaDeMaquinas.get(i).setValorHora(maquina.getValorHora());
                listaDeMaquinas.get(i).setDisponible(maquina.isDisponible());
                Singleton.getINSTANCE().escribirMaquina();
                return true;

            }

        }
        return false;
    }

    public boolean eliminarMaquina(int idMaquina) {
        for (int i = 0; i < listaDeMaquinas.size(); i++) {
            if (listaDeMaquinas.get(i).getIdMaquina() == idMaquina) {
                listaDeMaquinas.remove(i);
                Singleton.getINSTANCE().escribirMaquina();
                return true;
            }

        }
        return false;
    }

    public DefaultTableModel listarMaquina() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Id Maquina", "Edad Minima", "Tipo De Juego", "Genero", "Valor Hora", "Disponible"});
        for (int i = 0; i < getListaDeMaquinas().size(); i++) {
            if (getListaDeMaquinas().get(i) != null) {
                model.addRow(new Object[]{getListaDeMaquinas().get(i).getIdMaquina(),
                    getListaDeMaquinas().get(i).getEdadMinima(),
                    getListaDeMaquinas().get(i).getTipoDeJuego(),
                    getListaDeMaquinas().get(i).getGenero(),
                    getListaDeMaquinas().get(i).getValorHora(),
                    getListaDeMaquinas().get(i).isDisponible() ? "SI" : "NO"
                });

            }

        }
        return model;
    }

    

}
