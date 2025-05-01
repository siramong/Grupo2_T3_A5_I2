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

    private MainModelo ModeloMain;
    private MainVista VistaMain;
    private ListControlador listControlador;

    private addCitaMedica addCitaMedica;
    private addClinica addClinica;
    private addDoctor addDoctor;
    private addPaciente addPaciente;
    private viewAdministracion viewAdministracion;
    private viewCita viewCita;
    private viewCitasMedicas viewCitasMedicas;
    private viewDoctor viewDoctor;
    private viewDoctores viewDoctores;
    private viewPaciente viewPaciente;
    private viewPacientes viewPacientes;
    private viewInstructivo viewInstructivo;
    private viewAcercaDe viewAcercaDe;
    private viewPagos viewPagos;
    private editPaciente editPaciente;
    private editDoctor editDoctor;
    private viewEditPacientes viewEditPacientes;
    private viewEditDoctores viewEditDoctores;

    private viewInfoDialog viewInfo;

    public MainControlador(MainModelo ModeloMain, MainVista VistaMain) {
        this.ModeloMain = ModeloMain;
        this.VistaMain = VistaMain;

        // Inicializar todas las vistas
        inicializarVistas();

        // Inicializar los event listeners para botones
        inicializarEventListeners();

        // Inicializar el controlador de listas DESPUÉS de tener todas las vistas listas
        // y pasar una referencia a este controlador y a las vistas necesarias
        this.listControlador = new ListControlador(this, viewDoctores, viewPacientes, viewCitasMedicas);
    }

    private void inicializarVistas() {
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
        editPaciente = new editPaciente();
        editDoctor = new editDoctor();
        viewEditDoctores = new viewEditDoctores();
        viewEditPacientes = new viewEditPacientes();
        viewInfo = new viewInfoDialog();
    }

    private void inicializarEventListeners() {
        // Main menu buttons
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
        this.VistaMain.editPacientes.addActionListener(this);
        this.VistaMain.editDoctores.addActionListener(this);

        // Close buttons for all forms
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
        this.viewEditDoctores.cerrarViewDoctores.addActionListener(this);
        this.viewEditPacientes.cerrarViewPacientes.addActionListener(this);

        // Creation buttons
        this.addPaciente.crearPaciente.addActionListener(this);
        this.addDoctor.btnCrearDoctor.addActionListener(this);
        this.addClinica.btnGuardarClinica.addActionListener(this);
        this.addCitaMedica.btnCrear.addActionListener(this);

        // Edit buttons
        this.editDoctor.btnEditarDoctor.addActionListener(this);
        this.editPaciente.btnEditarEditarPaciente.addActionListener(this);

        // Payment buttons
        this.viewPagos.btnCalcular.addActionListener(this);
        this.viewPagos.btnSeleccionar.addActionListener(this);

        // Info dialog
        this.viewInfo.btnOk.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btn = e.getSource();

        // MAIN_VIEW_CONTROL - Mostrar formularios
        handleMainViewControls(btn);

        // Manejar eventos de crear/editar pacientes
        handlePacientesEvents(btn);

        // Manejar eventos de doctores
        handleDoctoresEvents(btn);

        // Manejar eventos de citas médicas
        handleCitasEvents(btn);

        // Manejar eventos de clínica
        handleClinicaEvents(btn);

        // Manejar eventos de pagos
        handlePagosEvents(btn);
    }

    private void handleMainViewControls(Object btn) {
        // Abrir formularios desde el menú principal
        if (btn == VistaMain.itmAddCitaMedica) {
            prepararFormularioCita();
            this.addCitaMedica.setVisible(true);
        } else if (btn == VistaMain.itmAddPaciente) {
            this.addPaciente.setVisible(true);
        } else if (btn == VistaMain.itmContratar) {
            this.addDoctor.setVisible(true);
        } else if (btn == VistaMain.itmEditClinica) {
            prepararFormularioClinica();
            this.addClinica.setVisible(true);
        } else if (btn == VistaMain.itmViewCitasMedicas) {
            actualizarListaCitas();
            this.viewCitasMedicas.setVisible(true);
        } else if (btn == VistaMain.itmViewClinica) {
            actualizarVistaClinica();
            this.viewAdministracion.setVisible(true);
        } else if (btn == VistaMain.itmViewDoctores) {
            actualizarListaDoctores();
            this.viewDoctores.setVisible(true);
        } else if (btn == VistaMain.itmViewPacientes) {
            actualizarListaPacientes();
            this.viewPacientes.setVisible(true);
        } else if (btn == VistaMain.btnOpenInstructivo) {
            this.viewInstructivo.setVisible(true);
        } else if (btn == VistaMain.btnOpenAcrcaDe) {
            this.viewAcercaDe.setVisible(true);
        } else if (btn == VistaMain.itmPagos) {
            prepararFormularioPagos();
            this.viewPagos.setVisible(true);
        } else if (btn == VistaMain.editDoctores) {
            this.viewEditDoctores.setVisible(true);
        } else if (btn == VistaMain.editPacientes) {
            this.viewEditPacientes.setVisible(true);
        }

        // Cerrar formularios
        handleCloseButtons(btn);
    }

    private void handleCloseButtons(Object btn) {
        // Botones de cierre para todos los formularios
        if (btn == addCitaMedica.btnCerrar) {
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
        } else if (btn == viewEditDoctores.cerrarViewDoctores) {
            viewEditDoctores.setVisible(false);
        } else if (btn == viewEditPacientes.cerrarViewPacientes) {
            viewEditPacientes.setVisible(false);
        }
    }

    private void handlePacientesEvents(Object btn) {
        if (btn == addPaciente.crearPaciente) {
            // Crear un nuevo paciente
            ModeloMain.addPaciente(
                    addPaciente.txtNombres.getText(),
                    addPaciente.txtApellidos.getText(),
                    addPaciente.txtTipoSangre.getText(),
                    addPaciente.txtCedula.getText(),
                    Integer.parseInt(addPaciente.txtEdadPaciente.getText()),
                    addPaciente.txtFechaNacimiento.getText()
            );

            // Limpiar formulario
            addPaciente.txtNombres.setText("");
            addPaciente.txtApellidos.setText("");
            addPaciente.txtTipoSangre.setText("");
            addPaciente.txtCedula.setText("");
            addPaciente.txtEdadPaciente.setText("");
            addPaciente.txtFechaNacimiento.setText("");

            showInfoDialog("Paciente Registrado");
        } else if (btn == editPaciente.btnEditarEditarPaciente) {
            // Código para editar paciente
        }
    }

    private void handleDoctoresEvents(Object btn) {
        if (btn == addDoctor.btnCrearDoctor) {
            // Crear un nuevo doctor
            String fechaActual = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            ModeloMain.addDoctor(
                    addDoctor.TxtNombreDoc.getText(),
                    addDoctor.TxtApellidoDoc.getText(),
                    addDoctor.txtDepatamento.getText(),
                    Double.parseDouble(addDoctor.txtSueldo.getText()),
                    fechaActual
            );

            // Limpiar formulario
            addDoctor.TxtNombreDoc.setText("");
            addDoctor.TxtApellidoDoc.setText("");
            addDoctor.txtDepatamento.setText("");
            addDoctor.txtSueldo.setText("");

            showInfoDialog("Doctor Contratado");
        } else if (btn == editDoctor.btnEditarDoctor) {
            // Código para editar doctor
        }
    }

    private void handleCitasEvents(Object btn) {
        if (btn == addCitaMedica.btnCrear) {
            // Crear una nueva cita médica
            Doctor foundDoctor = ModeloMain.searchDoctor(addCitaMedica.boxDoctor.getSelectedItem().toString());
            Paciente foundPaciente = ModeloMain.searchPaciente(addCitaMedica.boxPaciente.getSelectedItem().toString());

            ModeloMain.createCita(
                    foundDoctor,
                    foundPaciente,
                    Double.parseDouble(addCitaMedica.txtCostoCita.getText()),
                    addCitaMedica.txtFechaCita.getText(),
                    addCitaMedica.txtHoraCita.getText()
            );

            // Limpiar formulario
            addCitaMedica.txtCostoCita.setText("");
            addCitaMedica.txtFechaCita.setText("");
            addCitaMedica.txtHoraCita.setText("");

            foundDoctor.addNumCitas();
            showInfoDialog("Cita Agendada");
        }
    }

    private void handleClinicaEvents(Object btn) {
        if (btn == addClinica.btnGuardarClinica) {
            // Guardar datos de la clínica
            ModeloMain.getClinicaMain().nombreClinica = addClinica.txtNombreCrearClinica.getText();
            ModeloMain.getClinicaMain().direccionClinica = addClinica.txtDireccionCrearClinica.getText();
            showInfoDialog("Datos Guardados");
        }
    }

    private void handlePagosEvents(Object btn) {
        if (btn == viewPagos.btnSeleccionar) {
            // Mostrar información del doctor seleccionado
            Doctor foundDoctor = ModeloMain.searchDoctor(viewPagos.boxDoctor.getSelectedItem().toString());
            viewPagos.lblNumCitas.setText(foundDoctor.getNumCitas() + "");
            viewPagos.lblSueldo.setText(foundDoctor.getSueldoHora() + "");
            viewPagos.lblPagoCitas.setText(foundDoctor.getBonoCitas() + "");
        } else if (btn == viewPagos.btnCalcular) {
            // Calcular pago del doctor
            Doctor foundDoctor = ModeloMain.searchDoctor(viewPagos.boxDoctor.getSelectedItem().toString());
            viewPagos.lblPago.setText(foundDoctor.calcularPago() + "");
        }
    }

    // Métodos para preparar formularios
    private void prepararFormularioCita() {
        // Preparar combobox de doctores
        DefaultComboBoxModel<String> boxDoctores = new DefaultComboBoxModel<>();
        for (int i = 0; i < ModeloMain.getClinicaMain().doctores.size(); i++) {
            boxDoctores.addElement(ModeloMain.getDoctor(i).getNombreCompleto());
        }
        addCitaMedica.boxDoctor.setModel(boxDoctores);

        // Preparar combobox de pacientes
        DefaultComboBoxModel<String> boxPacientes = new DefaultComboBoxModel<>();
        for (int i = 0; i < ModeloMain.getClinicaMain().pacientes.size(); i++) {
            boxPacientes.addElement(ModeloMain.getPaciente(i).getNombreCompleto());
        }
        addCitaMedica.boxPaciente.setModel(boxPacientes);
    }

    private void prepararFormularioClinica() {
        this.addClinica.txtNombreCrearClinica.setText(ModeloMain.getClinicaMain().nombreClinica);
        this.addClinica.txtDireccionCrearClinica.setText(ModeloMain.getClinicaMain().direccionClinica);
    }

    private void prepararFormularioPagos() {
        DefaultComboBoxModel<String> boxDoctores = new DefaultComboBoxModel<>();
        for (int i = 0; i < ModeloMain.getClinicaMain().doctores.size(); i++) {
            boxDoctores.addElement(ModeloMain.getDoctor(i).getNombreCompleto());
        }
        viewPagos.boxDoctor.setModel(boxDoctores);
    }

    // Métodos para actualizar listas
    private void actualizarListaPacientes() {
        DefaultListModel<String> pacienteListModel = new DefaultListModel<>();
        for (int i = 0; i < ModeloMain.getClinicaMain().pacientes.size(); i++) {
            pacienteListModel.add(i, ModeloMain.getPaciente(i).getNombreCompleto());
        }
        viewPacientes.viewPacientes.setModel(pacienteListModel);
    }

    private void actualizarListaDoctores() {
        DefaultListModel<String> doctorListModel = new DefaultListModel<>();
        for (int i = 0; i < ModeloMain.getClinicaMain().doctores.size(); i++) {
            doctorListModel.add(i, ModeloMain.getDoctor(i).getNombreCompleto());
        }
        viewDoctores.lstViewDoctores.setModel(doctorListModel);
    }

    private void actualizarListaCitas() {
        DefaultListModel<String> citasListModel = new DefaultListModel<>();
        for (int i = 0; i < ModeloMain.getClinicaMain().citas.size(); i++) {
            citasListModel.add(i, ModeloMain.getCita(i).getDoctorAsignado().getDepartamento() + ": "
                    + ModeloMain.getPaciente(i).getNombres() + " "
                    + ModeloMain.getPaciente(i).getApellidos());
        }
        viewCitasMedicas.listCitasCreadas.setModel(citasListModel);
    }

    private void actualizarVistaClinica() {
        viewAdministracion.lblNombreViewAdministracion.setText(ModeloMain.getClinicaMain().nombreClinica);
        viewAdministracion.lblDireccionViewAdministracion.setText(ModeloMain.getClinicaMain().direccionClinica);
        viewAdministracion.lblPacientesRegistrados.setText(ModeloMain.getClinicaMain().pacientes.size() + "");
        viewAdministracion.lblDoctoresActivos.setText(ModeloMain.getClinicaMain().doctores.size() + "");
        viewAdministracion.lblCitasCreadas.setText(ModeloMain.getClinicaMain().citas.size() + "");
    }

    // Métodos públicos para comunicación con ListControlador
    public void showPaciente(int index) {
        viewPaciente.setVisible(true);
        viewPaciente.LblNombrePaciente.setText(ModeloMain.getPaciente(index).getNombres());
        viewPaciente.lblApellidos.setText(ModeloMain.getPaciente(index).getApellidos());
        viewPaciente.lblCedulaPaciente.setText(ModeloMain.getPaciente(index).getNumeroCedula());
        viewPaciente.lblEdadPaciente.setText(ModeloMain.getPaciente(index).getEdad() + "");
        viewPaciente.lblTipoSaNGRE.setText(ModeloMain.getPaciente(index).getTipoSangre());
        viewPaciente.lblFechaNacimiento.setText(ModeloMain.getPaciente(index).getFechaNacimiento());
    }

    public void showDoctor(int index) {
        viewDoctor.setVisible(true);
        viewDoctor.nombreDoctorview.setText(ModeloMain.getDoctor(index).getNombreCompleto());
        viewDoctor.departDoctorview1.setText(ModeloMain.getDoctor(index).getDepartamento());
        viewDoctor.sueldoDoctorview.setText(ModeloMain.getDoctor(index).getSueldoHora() + "");
    }

    public void showCita(int index) {
        viewCita.setVisible(true);
        viewCita.lblFechaViewCita.setText(ModeloMain.getCita(index).getFecha() + " " + ModeloMain.getCita(index).getHora());
        viewCita.lblCostoViewCita.setText(ModeloMain.getCita(index).getCostoCita() + "");
        viewCita.lblDoctorViewCita.setText(ModeloMain.getCita(index).getDoctorAsignado().getNombreCompleto());
        viewCita.lblPacienteViewPaciente.setText(ModeloMain.getCita(index).getPacienteAtendido().getNombreCompleto());
    }

    public void showInfoDialog(String msg) {
        viewInfo.setVisible(true);
        viewInfo.lblMsg.setText(msg);
    }
}
