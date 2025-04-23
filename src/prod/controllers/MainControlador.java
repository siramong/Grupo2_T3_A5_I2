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
        
        this.VistaMain.itmAddCitaMedica.addActionListener(this);
        this.VistaMain.itmAddPaciente.addActionListener(this);
        this.VistaMain.itmContratar.addActionListener(this);
        this.VistaMain.itmEditClinica.addActionListener(this);
        this.VistaMain.itmViewCitasMedicas.addActionListener(this);
        this.VistaMain.itmViewClinica.addActionListener(this);
        this.VistaMain.itmViewDoctores.addActionListener(this);
        this.VistaMain.itmViewPacientes.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object btn = e.getSource();
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
        }
    }
    
}
