/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.controllers;

import prod.models.MainModelo;
import prod.views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author PC_12
 */
public class MainControlador implements ActionListener {

    MainModelo ModeloMain;
    MainVista VistaMain;

    addCitaMedica addCitaMedica;
    addClinica addClinica;
    addDoctor addDoctor;
    addPaciente addPaciente;
    viewAdministracion viewAdministracion;
    viewCita viewCita;
    viewCitasMedicas viewCitasMedicas;
    viewDoctor viewDoctor;
    viewDoctores viewDoctores;
    viewPaciente viewPaciente;
    viewPacientes viewPacientes;
    viewInstructivo viewInstructivo;
    viewAcercaDe viewAcercaDe;

    public MainControlador(MainModelo ModeloMain, MainVista VistaMain) {
        this.ModeloMain = ModeloMain;
        this.VistaMain = VistaMain;

        addCitaMedica = new addCitaMedica();
        addClinica = new addClinica();
        addDoctor = new addDoctor();
        addPaciente = new addPaciente();
        viewAdministracion = new viewAdministracion();
        viewCita = new viewCita();
        viewCitasMedicas = new viewCitasMedicas();
        viewDoctor = new viewDoctor();
        viewDoctores = new viewDoctores();
        viewPaciente = new viewPaciente();
        viewPacientes = new viewPacientes();
        viewInstructivo = new viewInstructivo();
        viewAcercaDe = new viewAcercaDe();

        this.VistaMain.itmAddCitaMedica.addActionListener(this);
        this.VistaMain.itmAddPaciente.addActionListener(this);
        this.VistaMain.itmContratar.addActionListener(this);
        this.VistaMain.itmEditClinica.addActionListener(this);
        this.VistaMain.itmViewCitasMedicas.addActionListener(this);
        this.VistaMain.itmViewClinica.addActionListener(this);
        this.VistaMain.itmViewDoctores.addActionListener(this);
        this.VistaMain.itmViewPacientes.addActionListener(this);
        this.VistaMain.btnOpenInstructivo.addActionListener(this);
        this.VistaMain.btnOpenAcrcaDe.addActionListener(this);

        this.addCitaMedica.btnCerrar.addActionListener(this);
        this.addClinica.btnCerrarCrearClinica.addActionListener(this);
        this.addDoctor.cerraraddDoctor.addActionListener(this);
        this.addPaciente.cerrarAddPaciente.addActionListener(this);
        this.viewAdministracion.btnCerrarViewAdministracion.addActionListener(this);
        this.viewCita.btnCerrarViewCita.addActionListener(this);
        this.viewCitasMedicas.btnCerrarCitasCreadas.addActionListener(this);
        this.viewDoctor.cerrarVentanaviewDoctor.addActionListener(this);
        this.viewDoctores.cerrarViewDoctores.addActionListener(this);
        this.viewPaciente.btnCerrar.addActionListener(this);
        this.viewPacientes.cerrarViewPacientes.addActionListener(this);
        this.viewInstructivo.brnCerrarviewIstructivo.addActionListener(this);
        this.viewAcercaDe.btnCerrarViewAcercaDe.addActionListener(this);

        this.addPaciente.crearPaciente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btn = e.getSource();
        // MAIN_VIEW_CONTROL
        if (btn == VistaMain.itmAddCitaMedica) {
            this.addCitaMedica.setVisible(true);
        } else if (btn == VistaMain.itmAddPaciente) {
            this.addPaciente.setVisible(true);
        } else if (btn == VistaMain.itmContratar) {
            this.addDoctor.setVisible(true);
        } else if (btn == VistaMain.itmEditClinica) {
            this.addClinica.setVisible(true);
        } else if (btn == VistaMain.itmViewCitasMedicas) {
            this.viewCitasMedicas.setVisible(true);
        } else if (btn == VistaMain.itmViewClinica) {
            this.viewAdministracion.setVisible(true);
        } else if (btn == VistaMain.itmViewDoctores) {
            this.viewDoctores.setVisible(true);
        } else if (btn == VistaMain.itmViewPacientes) {
            this.viewPacientes.setVisible(true);
        } else if (btn == VistaMain.btnOpenInstructivo) {
            this.viewInstructivo.setVisible(true);
        } else if (btn == VistaMain.btnOpenAcrcaDe) {
            this.viewAcercaDe.setVisible(true);
        } else if (btn == addCitaMedica.btnCerrar) {
            addCitaMedica.setVisible(false);
        } else if (btn == addClinica.btnCerrarCrearClinica) {
            addClinica.setVisible(false);
        } else if (btn == addDoctor.cerraraddDoctor) {
            addDoctor.setVisible(false);
        } else if (btn == addPaciente.cerrarAddPaciente) {
            addPaciente.setVisible(false);
        } else if (btn == viewAdministracion.btnCerrarViewAdministracion) {
            viewAdministracion.setVisible(false);
        } else if (btn == viewCita.btnCerrarViewCita) {
            viewCita.setVisible(false);
        } else if (btn == viewCitasMedicas.btnCerrarCitasCreadas) {
            viewCitasMedicas.setVisible(false);
        } else if (btn == viewDoctor.cerrarVentanaviewDoctor) {
            viewDoctor.setVisible(false);
        } else if (btn == viewDoctores.cerrarViewDoctores) {
            viewDoctores.setVisible(false);
        } else if (btn == viewPaciente.btnCerrar) {
            viewPaciente.setVisible(false);
        } else if (btn == viewPacientes.cerrarViewPacientes) {
            viewPacientes.setVisible(false);
        } else if (btn == viewInstructivo.brnCerrarviewIstructivo) {
            viewInstructivo.setVisible(false);
        } else if (btn == viewAcercaDe.btnCerrarViewAcercaDe) {
            viewAcercaDe.setVisible(false);
        }
        // MAIN_PACIENTES_WORKLOAD
        if (btn == addPaciente.crearPaciente) {
            ModeloMain.addPaciente(addPaciente.txtNombres.getText(), addPaciente.txtApellidos.getText(), addPaciente.txtTipoSangre.getText(), addPaciente.txtCedula.getText(), Integer.parseInt(addPaciente.txtEdadPaciente.getText()), addPaciente.txtFechaNacimiento.getText());
            System.out.println(addPaciente.txtNombres.getText() + addPaciente.txtApellidos.getText() + addPaciente.txtTipoSangre.getText() + addPaciente.txtCedula.getText() + addPaciente.txtEdadPaciente.getText() + addPaciente.txtFechaNacimiento.getText());
            addPaciente.txtNombres.setText("");
            addPaciente.txtApellidos.setText("");
            addPaciente.txtTipoSangre.setText("");
            addPaciente.txtCedula.setText("");
            addPaciente.txtEdadPaciente.setText("");
            addPaciente.txtFechaNacimiento.setText("");
        } else if (btn == VistaMain.itmViewPacientes) {
            DefaultListModel<String> pacienteListModel = new DefaultListModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().pacientes.size(); i++) {
                pacienteListModel.add(i, ModeloMain.getPaciente(i).getNombres() + " " + ModeloMain.getPaciente(i).getApellidos());
            }
            viewPacientes.viewPacientes.setModel(pacienteListModel);
            this.viewPacientes.viewPacientes.addListSelectionListener(ev2 -> {
                if (!ev2.getValueIsAdjusting()) {
                    int selectedIndex = viewPacientes.viewPacientes.getSelectedIndex();
                    viewPaciente.setVisible(true);
                    viewPaciente.LblNombrePaciente.setText(ModeloMain.getPaciente(selectedIndex).getNombres() + " " + ModeloMain.getPaciente(selectedIndex).getApellidos());
                }
            });
        }
    }
}
