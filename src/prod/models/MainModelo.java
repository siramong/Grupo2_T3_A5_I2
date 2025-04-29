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

    Clinica ClinicaMain = new Clinica("Tu clinica", "Una dirección sumamente real, 123");

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
        if (pos >= 0) {
            return ClinicaMain.doctores.get(pos);
        } else {
            return null;
        }
    }

    public Paciente getPaciente(int pos) {
        if (pos >= 0) {
            return ClinicaMain.pacientes.get(pos);
        } else {
            return null;
        }
    }

    public CitaMedica getCita(int pos) {
        return ClinicaMain.citas.get(pos);
    }

    public Clinica getClinicaMain() {
        return ClinicaMain;
    }

    public Doctor searchDoctor(String query) {
        Doctor foundDoctor = null;
        for (Doctor d : this.getClinicaMain().doctores) {
            if ((d.getNombres() + " " + d.getApellidos()).equals(query)) {
                foundDoctor = d;
                break;
            }
        }
        return foundDoctor;
    }

    public Paciente searchPaciente(String query) {
        Paciente foundPaciente = null;
        for (Paciente p : this.getClinicaMain().pacientes) {

            if ((p.getNombres() + " " + p.getApellidos()).equals(query)) {
                foundPaciente = p;
                break;
            }
        }
        return foundPaciente;
    }
}
