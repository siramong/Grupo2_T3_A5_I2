/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.classes;

/**
 *
 * @author PC_12
 */
public class CitaMedica {

    Doctor doctorAsignado;
    Paciente pacienteAtendido;
    double costoCita;
    String fecha;
    String hora;

    public CitaMedica(Doctor doctorAsignado, Paciente pacienteAtendido, double costoCita, String fecha, String hora) {
        this.doctorAsignado = doctorAsignado;
        this.pacienteAtendido = pacienteAtendido;
        this.costoCita = costoCita;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Doctor getDoctorAsignado() {
        return doctorAsignado;
    }

    public void setDoctorAsignado(Doctor doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }

    public Paciente getPacienteAtendido() {
        return pacienteAtendido;
    }

    public void setPacienteAtendido(Paciente pacienteAtendido) {
        this.pacienteAtendido = pacienteAtendido;
    }

    public double getCostoCita() {
        return costoCita;
    }

    public void setCostoCita(double costoCita) {
        this.costoCita = costoCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
