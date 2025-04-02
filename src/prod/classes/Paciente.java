/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.classes;

import java.util.ArrayList;

public class Paciente {

    String nombres;
    String apellidos;
    String tipoSangre;
    String numeroCedula;
    int edad;
    String fechaNacimiento;
    ArrayList<String> historialMedico = new ArrayList<>();
    ArrayList<String> alergias = new ArrayList<>();

    public Paciente(String nombres, String apellidos, String tipoSangre, String numeroCedula, int edad, String fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoSangre = tipoSangre;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(ArrayList historialMedico) {
        this.historialMedico = historialMedico;
    }

    public ArrayList getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList alergias) {
        this.alergias = alergias;
    }

}
