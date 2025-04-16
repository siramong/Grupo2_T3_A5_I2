/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.classes;

import java.util.ArrayList;

/**
 *
 * @author PC_12
 */
public class Clinica {

    public ArrayList<Paciente> pacientes = new ArrayList<>();
    public ArrayList<Doctor> doctores = new ArrayList<>();
    private ArrayList<CitaMedica> citas = new ArrayList<>();
    
    String nombreClinica;
    String direccionClinica;

    public Clinica(String nombreClinica, String direccionClinica) {
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
    }

    public ArrayList<CitaMedica> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<CitaMedica> citas) {
        this.citas = citas;
    }
    
    
    
}
