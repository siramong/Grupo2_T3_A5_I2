/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.models;

import prod.classes.*;

/**
 *
 * @author PC_12
 */
public class MainModelo {

    Clinica ClinicaMain = new Clinica ("Tu clinica", "Una dirección sumamente real, 123");

    public void addDoctor(String nombres, String apellidos, String departamento, double sueldoHora, String fechaIngreso) {
        ClinicaMain.doctores.add(new Doctor(nombres, apellidos, departamento, sueldoHora, fechaIngreso));
    }

    public void addPaciente(String nombres, String apellidos, String tipoSangre, String numeroCedula, int edad, String fechaNacimiento) {
        ClinicaMain.pacientes.add(new Paciente(nombres, apellidos, tipoSangre, numeroCedula, edad, fechaNacimiento));
    }

    public void createCita(Doctor doctorAsignado, Paciente pacienteAtendido, double costoCita, String fecha, String hora) {
        ClinicaMain.citas.add(new CitaMedica(doctorAsignado, pacienteAtendido, costoCita, fecha, hora));
    }

    public Doctor getDoctor(int pos) {
        return ClinicaMain.doctores.get(pos);
    }

    public Paciente getPaciente(int pos) {
        return ClinicaMain.pacientes.get(pos);
    }

    public CitaMedica getCita(int pos) {
        return ClinicaMain.citas.get(pos);
    }
    
    public Clinica getClinicaMain() {
        return ClinicaMain;
    }
    
    
}
