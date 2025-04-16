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
public class Doctor {

    String nombres;
    String apellidos;
    String departamento;
    double sueldoHora;
    double horasRegistradas;
    double bonoCitas;
    String fechaIngreso;

    public Doctor(String nombres, String apellidos, String departamento, double sueldoHora, String fechaIngreso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.sueldoHora = sueldoHora;
        this.fechaIngreso = fechaIngreso;
        
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public double getHorasRegistradas() {
        return horasRegistradas;
    }

    public void setHorasRegistradas(double horasRegistradas) {
        this.horasRegistradas = horasRegistradas;
    }

    public double getBonoCitas() {
        return bonoCitas;
    }

    public void setBonoCitas(double bonoCitas) {
        this.bonoCitas = bonoCitas;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
