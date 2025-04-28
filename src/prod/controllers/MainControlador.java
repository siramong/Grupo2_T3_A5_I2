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
import javax.swing.DefaultComboBoxModel;
import prod.classes.*;

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
    viewPagos viewPagos;

    viewInfoDialog viewInfo;

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
        viewPagos = new viewPagos();

        viewInfo = new viewInfoDialog();

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
        this.VistaMain.itmPagos.addActionListener(this);

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
        this.viewPagos.btnCerrar.addActionListener(this);

        this.addPaciente.crearPaciente.addActionListener(this);
        this.addDoctor.btnCrearDoctor.addActionListener(this);

        this.addClinica.btnGuardarClinica.addActionListener(this);

        this.viewPagos.btnCalcular.addActionListener(this);
        this.viewPagos.btnCalcular.addActionListener(this);

        this.viewInfo.btnOk.addActionListener(this);

        this.addCitaMedica.btnCrear.addActionListener(this);
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
        } else if (btn == VistaMain.itmPagos) {
            this.viewPagos.setVisible(true);
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
        } else if (btn == viewInfo.btnOk) {
            viewInfo.setVisible(false);
        } else if (btn == viewPagos.btnCerrar) {
            viewPagos.setVisible(false);
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
            showInfoDialog("Paciente Registrado");
        } else if (btn == VistaMain.itmViewPacientes) {
            DefaultListModel<String> pacienteListModel = new DefaultListModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().pacientes.size(); i++) {
                pacienteListModel.add(i, ModeloMain.getPaciente(i).getNombres() + " " + ModeloMain.getPaciente(i).getApellidos());
            }
            viewPacientes.viewPacientes.setModel(pacienteListModel);
            this.viewPacientes.viewPacientes.addListSelectionListener(ev2 -> {
                int selectedIndex = viewPacientes.viewPacientes.getSelectedIndex();
                viewPaciente.setVisible(true);
                viewPaciente.LblNombrePaciente.setText(ModeloMain.getPaciente(selectedIndex).getNombres());
                viewPaciente.lblApellidos.setText(ModeloMain.getPaciente(selectedIndex).getApellidos());
                viewPaciente.lblCedulaPaciente.setText(ModeloMain.getPaciente(selectedIndex).getNumeroCedula());
                viewPaciente.lblEdadPaciente.setText(ModeloMain.getPaciente(selectedIndex).getEdad() + "");
                viewPaciente.lblTipoSaNGRE.setText(ModeloMain.getPaciente(selectedIndex).getTipoSangre());
                viewPaciente.lblFechaNacimiento.setText(ModeloMain.getPaciente(selectedIndex).getFechaNacimiento());
            });
        }

        // MAIN_DOCTORES_WORKLOAD
        if (btn == addDoctor.btnCrearDoctor) {
            String fechaActual = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            ModeloMain.addDoctor(addDoctor.TxtNombreDoc.getText(), addDoctor.TxtApellidoDoc.getText(), addDoctor.txtDepatamento.getText(), Double.parseDouble(addDoctor.txtSueldo.getText()), fechaActual);
            addDoctor.TxtNombreDoc.setText("");
            addDoctor.TxtApellidoDoc.setText("");
            addDoctor.txtDepatamento.setText("");
            addDoctor.txtSueldo.setText("");
            showInfoDialog("Doctor Contratado");
        } else if (btn == VistaMain.itmViewDoctores) {
            DefaultListModel<String> doctorListModel = new DefaultListModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().doctores.size(); i++) {
                doctorListModel.add(i, ModeloMain.getDoctor(i).getNombres() + " " + ModeloMain.getDoctor(i).getApellidos());
            }
            viewDoctores.lstViewDoctores.setModel(doctorListModel);
            this.viewDoctores.lstViewDoctores.addListSelectionListener(ev3 -> {
                int selectedIndex = viewDoctores.lstViewDoctores.getSelectedIndex();
                viewDoctor.setVisible(true);
                viewDoctor.nombreDoctorview.setText(ModeloMain.getDoctor(selectedIndex).getNombres() + " " + ModeloMain.getDoctor(selectedIndex).getApellidos());
                viewDoctor.departDoctorview1.setText(ModeloMain.getDoctor(selectedIndex).getDepartamento());
                viewDoctor.sueldoDoctorview.setText(ModeloMain.getDoctor(selectedIndex).getSueldoHora() + "");
            });
        }
        // MAIN_CITAS_WORKLOAD
        if (btn == addCitaMedica.btnCrear) {
            Doctor foundDoctor = null;
            for (Doctor d : ModeloMain.getClinicaMain().doctores) {
                if ((d.getNombres() + " " + d.getApellidos()).equals(addCitaMedica.boxDoctor.getSelectedItem().toString())) {
                    foundDoctor = d;
                    break;
                }
            }
            Paciente foundPaciente = null;
            for (Paciente p : ModeloMain.getClinicaMain().pacientes) {

                if ((p.getNombres() + " " + p.getApellidos()).equals(addCitaMedica.boxPaciente.getSelectedItem().toString())) {
                    foundPaciente = p;
                    break;
                }
            }

            ModeloMain.createCita(foundDoctor, foundPaciente, Double.parseDouble(addCitaMedica.txtCostoCita.getText()), addCitaMedica.txtFechaCita.getText(), addCitaMedica.txtHoraCita.getText());
            addCitaMedica.txtCostoCita.setText("");
            addCitaMedica.txtFechaCita.setText("");
            addCitaMedica.txtHoraCita.setText("");
            showInfoDialog("Cita Agendada");
        } else if (btn == VistaMain.itmAddCitaMedica) {
            DefaultComboBoxModel<String> boxDoctores = new DefaultComboBoxModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().doctores.size(); i++) {
                boxDoctores.addElement(ModeloMain.getDoctor(i).getNombres() + " " + ModeloMain.getDoctor(i).getApellidos());
            }
            addCitaMedica.boxDoctor.setModel(boxDoctores);

            DefaultComboBoxModel<String> boxPacientes = new DefaultComboBoxModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().pacientes.size(); i++) {
                boxPacientes.addElement(ModeloMain.getPaciente(i).getNombres() + " " + ModeloMain.getPaciente(i).getApellidos());
            }
            addCitaMedica.boxPaciente.setModel(boxPacientes);

        } else if (btn == VistaMain.itmViewCitasMedicas) {

            DefaultListModel<String> citasListModel = new DefaultListModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().citas.size(); i++) {
                citasListModel.add(i, ModeloMain.getCita(i).getDoctorAsignado().getDepartamento() + ": " + ModeloMain.getPaciente(i).getNombres() + " " + ModeloMain.getPaciente(i).getApellidos());
            }
            viewCitasMedicas.listCitasCreadas.setModel(citasListModel);

            this.viewCitasMedicas.listCitasCreadas.addListSelectionListener(ev4 -> {
                int selectedIndex = viewCitasMedicas.listCitasCreadas.getSelectedIndex();
                viewCita.setVisible(true);
                viewCita.lblFechaViewCita.setText(ModeloMain.getCita(selectedIndex).getFecha() + " " + ModeloMain.getCita(selectedIndex).getHora());
                viewCita.lblCostoViewCita.setText(ModeloMain.getCita(selectedIndex).getCostoCita() + "");
                viewCita.lblDoctorViewCita.setText(ModeloMain.getCita(selectedIndex).getDoctorAsignado().getNombres() + " " + ModeloMain.getCita(selectedIndex).getDoctorAsignado().getApellidos());
                viewCita.lblPacienteViewPaciente.setText(ModeloMain.getCita(selectedIndex).getPacienteAtendido().getNombres() + " " + ModeloMain.getCita(selectedIndex).getPacienteAtendido().getApellidos());
            });
        }

        //MAIN_CLINICA WORKLOAD
        if (btn == VistaMain.itmEditClinica) {
            this.addClinica.txtNombreCrearClinica.setText(ModeloMain.getClinicaMain().nombreClinica);
            this.addClinica.txtDireccionCrearClinica.setText(ModeloMain.getClinicaMain().direccionClinica);
        } else if (btn == addClinica.btnGuardarClinica) {
            ModeloMain.getClinicaMain().nombreClinica = addClinica.txtNombreCrearClinica.getText();
            ModeloMain.getClinicaMain().direccionClinica = addClinica.txtDireccionCrearClinica.getText();
            showInfoDialog("Datos Guardados");
        } else if (btn == VistaMain.itmViewClinica) {
            viewAdministracion.lblNombreViewAdministracion.setText(ModeloMain.getClinicaMain().nombreClinica);
            viewAdministracion.lblDireccionViewAdministracion.setText(ModeloMain.getClinicaMain().direccionClinica);
            viewAdministracion.lblPacientesRegistrados.setText(ModeloMain.getClinicaMain().pacientes.size() + "");
            viewAdministracion.lblDoctoresActivos.setText(ModeloMain.getClinicaMain().doctores.size() + "");
            viewAdministracion.lblCitasCreadas.setText(ModeloMain.getClinicaMain().citas.size() + "");
        }

        //PAGOS WORKLOAD
        if (btn == VistaMain.itmPagos) {
            DefaultComboBoxModel<String> boxDoctores = new DefaultComboBoxModel<>();
            for (int i = 0; i < ModeloMain.getClinicaMain().doctores.size(); i++) {
                boxDoctores.addElement(ModeloMain.getDoctor(i).getNombres() + " " + ModeloMain.getDoctor(i).getApellidos());
            }
            viewPagos.boxDoctor.setModel(boxDoctores);
        } else if (btn == viewPagos.btnCalcular) {

        }
    }

    public void showInfoDialog(String msg) {
        viewInfo.setVisible(true);
        viewInfo.lblMsg.setText(msg);
    }
}
