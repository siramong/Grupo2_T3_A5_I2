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
    public ArrayList<CitaMedica> citas = new ArrayList<>();
    
    public String nombreClinica;
    public String direccionClinica;

    public Clinica(String nombreClinica, String direccionClinica) {
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
        // this.pacientes.add(new Paciente("Ariel Esteban","Morocho Calle","O+","0107065484",16,"21/10/2008")); // LINEA DEBUG, NO AÑADIR
    }

    public ArrayList<CitaMedica> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<CitaMedica> citas) {
        this.citas = citas;
    }
    
    
    
}
