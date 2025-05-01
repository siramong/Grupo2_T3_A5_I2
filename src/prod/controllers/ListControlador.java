/*
 * UNIDAD EDUCATIVA TÉCNICO SALESIANO
 * Aporte .... Insumo ...: ...
 * Programado por: Esteban Morocho
 * Curso: Pimero E1 - Grupo 2
 */
package prod.controllers;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import prod.views.*;

/**
 *
 * @author Desarrollador
 */
public class ListControlador implements ListSelectionListener {
    
    viewDoctores viewDoctores;
    viewPacientes viewPacientes;
    viewCitasMedicas viewCitasMedicas;
    MainControlador ControladorMain;

    public ListControlador() {
        this.viewDoctores = new viewDoctores();
        this.viewPacientes = new viewPacientes();
        this.viewCitasMedicas = new viewCitasMedicas();
        
        this.viewPacientes.viewPacientes.addListSelectionListener(this);
        this.viewDoctores.lstViewDoctores.addListSelectionListener(this);
        this.viewCitasMedicas.listCitasCreadas.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object sel = e.getSource();
        if (sel == viewPacientes.viewPacientes) {
            int selectedIndex = viewPacientes.viewPacientes.getSelectedIndex();
            ControladorMain.showPaciente(selectedIndex);
        }
    }
    
}
