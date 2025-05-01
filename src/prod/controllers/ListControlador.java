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

    private viewDoctores viewDoctores;
    private viewPacientes viewPacientes;
    private viewCitasMedicas viewCitasMedicas;
    private MainControlador controladorMain;

    /**
     * Constructor que recibe las vistas ya instanciadas y el controlador
     * principal para evitar duplicidad y asegurar una correcta comunicación
     * entre controladores
     */
    public ListControlador(MainControlador controladorMain, viewDoctores viewDoctores,
            viewPacientes viewPacientes, viewCitasMedicas viewCitasMedicas) {
        this.controladorMain = controladorMain;
        this.viewDoctores = viewDoctores;
        this.viewPacientes = viewPacientes;
        this.viewCitasMedicas = viewCitasMedicas;

        // Registrar este controlador como listener para todas las listas
        this.viewPacientes.viewPacientes.addListSelectionListener(this);
        this.viewDoctores.lstViewDoctores.addListSelectionListener(this);
        this.viewCitasMedicas.listCitasCreadas.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object sel = e.getSource();

        // Evitar eventos duplicados durante la selección
        if (e.getValueIsAdjusting()) {
            return;
        }

        if (sel == viewPacientes.viewPacientes) {
            int selectedIndex = viewPacientes.viewPacientes.getSelectedIndex();
            if (selectedIndex >= 0) {
                controladorMain.showPaciente(selectedIndex);
            }
        } else if (sel == viewDoctores.lstViewDoctores) {
            int selectedIndex = viewDoctores.lstViewDoctores.getSelectedIndex();
            if (selectedIndex >= 0) {
                controladorMain.showDoctor(selectedIndex);
            }
        } else if (sel == viewCitasMedicas.listCitasCreadas) {
            int selectedIndex = viewCitasMedicas.listCitasCreadas.getSelectedIndex();
            if (selectedIndex >= 0) {
                controladorMain.showCita(selectedIndex);
            }
        }
    }
}
