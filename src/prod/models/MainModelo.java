/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.models;

// Importa las clases que definen la estructura de los datos.
import prod.classes.*;
// Importa la clase ArrayList ya que es utilizada explícitamente por el Controlador.

/**
 * Clase Principal del Modelo. Responsable de almacenar y gestionar los datos de
 * la aplicación, encapsulados principalmente dentro de un objeto Clinica.
 * Proporciona métodos públicos para que el Controlador pueda acceder y
 * manipular estos datos (añadir, obtener, buscar). No tiene conocimiento de la
 * interfaz de usuario (Vistas).
 *
 * @author PC_12
 */
public class MainModelo {

    /**
     * El objeto ClinicaMain contiene toda la información relevante: el nombre y
     * dirección de la clínica, y las listas internas donde se almacenan los
     * objetos Doctor, Paciente y CitaMedica. Se inicializa al crear el
     * MainModelo con valores por defecto.
     */
    Clinica ClinicaMain = new Clinica("Tu clinica", "Una dirección sumamente real, 123");

    /**
     * Añade un nuevo objeto Doctor a la lista de doctores de la clínica. Es
     * llamado por el Controlador cuando se requiere registrar un nuevo doctor.
     *
     * @param nombres: Nombres del doctor a añadir.
     * @param apellidos: Apellidos del doctor a añadir.
     * @param departamento: Departamento del doctor.
     * @param sueldoHora: Sueldo por hora del doctor.
     * @param fechaIngreso: Fecha de ingreso del doctor.
     */
    public void addDoctor(String nombres, String apellidos, String departamento, double sueldoHora, String fechaIngreso) {
        // 1. Crea una nueva instancia (objeto) de la clase Doctor usando los datos recibidos.
        // 2. Accede a la lista doctores que se encuentra dentro del objeto ClinicaMain.
        // 3. Utiliza el método add de la lista para agregar el nuevo objeto Doctor.
        ClinicaMain.doctores.add(new Doctor(nombres, apellidos, departamento, sueldoHora, fechaIngreso));
    }

    /**
     * Añade un nuevo objeto Paciente a la lista de pacientes de la clínica. Es
     * llamado por el Controlador cuando se registra un nuevo paciente.
     *
     * @param nombres: Nombres del paciente.
     * @param apellidos: Apellidos del paciente.
     * @param tipoSangre: Tipo de sangre del paciente.
     * @param numeroCedula: Número de cédula del paciente.
     * @param edad: Edad del paciente.
     * @param fechaNacimiento: Fecha de nacimiento del paciente.
     */
    public void addPaciente(String nombres, String apellidos, String tipoSangre, String numeroCedula, int edad, String fechaNacimiento) {
        // 1. Crea un nuevo objeto Paciente con los datos proporcionados.
        // 2. Accede a la lista 'pacientes' dentro de 'ClinicaMain'.
        // 3. Añade el nuevo Paciente a la lista.
        ClinicaMain.pacientes.add(new Paciente(nombres, apellidos, tipoSangre, numeroCedula, edad, fechaNacimiento));
    }

    /**
     * Crea y añade una nueva Cita Médica a la lista de citas de la clínica. Es
     * llamado por el Controlador al agendar una nueva cita.
     *
     * @param doctorAsignado: El objeto Doctor que atenderá la cita.
     * @param pacienteAtendido: El objeto Paciente que será atendido.
     * @param costoCita: Costo monetario de la cita.
     * @param fecha: Fecha de la cita.
     * @param hora: Hora de la cita.
     */
    public void createCita(Doctor doctorAsignado, Paciente pacienteAtendido, double costoCita, String fecha, String hora) {
        // 1. Crea un nuevo objeto CitaMedica, pasando las referencias al Doctor y Paciente, y los demás datos.
        // 2. Accede a la lista citas dentro de ClinicaMain.
        // 3. Añade la nueva CitaMedica a la lista.
        ClinicaMain.citas.add(new CitaMedica(doctorAsignado, pacienteAtendido, costoCita, fecha, hora));
    }

    /**
     * Obtiene un objeto Doctor específico de la lista, basado en su posición.
     * Permite al Controlador obtener los datos de un doctor para mostrarlos o
     * usarlos.
     *
     * @param pos: El índice (posición numérica) del doctor en la lista interna.
     * @return Objeto Doctor en la posición indicada.
     */
    public Doctor getDoctor(int pos) {
        // Verifica si el índice 'pos' está dentro de los límites válidos de la lista de doctores.
        if (pos >= 0 && pos < ClinicaMain.doctores.size()) {
            // Si es válido, devuelve el objeto Doctor de esa posición usando el método 'get' de la lista.
            return ClinicaMain.doctores.get(pos);
        } else {
            // Si el índice no es válido ya sea negativo o demasiado grande, devuelve null para indicar que no se encontró.
            return null;
        }
    }

    /**
     * Obtiene un objeto Paciente específico de la lista, basado en su posición.
     *
     * @param pos: El índice del paciente en la lista interna.
     * @return Objeto Paciente en la posición indicada.
     */
    public Paciente getPaciente(int pos) {
        // Verifica si el índice 'pos' es válido para la lista de pacientes.
        if (pos >= 0 && pos < ClinicaMain.pacientes.size()) {
            // Devuelve el objeto Paciente de esa posición.
            return ClinicaMain.pacientes.get(pos);
        } else {
            // Devuelve null si el índice no es válido.
            return null;
        }
    }

    /**
     * Obtiene un objeto CitaMedica específico de la lista, basado en su
     * posición.
     *
     * @param pos: El índice de la cita en la lista interna.
     * @return Objeto CitaMedica en la posición indicada.
     */
    public CitaMedica getCita(int pos) {
        // Devuelve directamente la cita de la posición 'pos' de la lista 'citas' en ClinicaMain.
        return ClinicaMain.citas.get(pos);
    }

    /**
     * Devuelve la referencia al objeto Clinica principal completo. Permite al
     * Controlador acceder a todos los datos gestionados por el Modelo
     * (incluyendo el nombre/dirección de la clínica y las listas completas).
     *
     * @return Variable ClinicaMain que contiene todos los datos.
     */
    public Clinica getClinicaMain() {
        // Simplemente devuelve la variable ClinicaMain que contiene todos los datos.
        return ClinicaMain;
    }

    /**
     * Busca un Doctor en la lista comparando el nombre completo con una cadena
     * de texto dada. Es útil para encontrar el objeto Doctor correspondiente a
     * un nombre seleccionado por el usuario.
     *
     * @param query: El nombre completo a buscar, Ejemplo: "Juan Perez".
     * @return Objeto Doctor Encontrado
     */
    public Doctor searchDoctor(String query) {
        Doctor foundDoctor = null; // Variable para guardar el doctor si se encuentra, inicia en null.
        // Bucle que recorre cada objeto 'd' de tipo Doctor en la lista ClinicaMain.doctores.
        for (Doctor d : this.getClinicaMain().doctores) {
            // Concatena los nombres y apellidos del doctor actual 'd' con un espacio.
            // Compara esta cadena resultante con la cadena 'query' usando equals()
            if ((d.getNombres() + " " + d.getApellidos()).equals(query)) {
                // Si la comparación es verdadera , guarda el objeto doctor en 'foundDoctor'.
                foundDoctor = d;
                // Termina el bucle porque ya se encontró el doctor buscado.
                break;
            }
        }
        // Devuelve el contenido de foundDoctor.
        return foundDoctor;
    }

    /**
     * Busca un Paciente en la lista comparando el nombre completo con una
     * cadena de texto dada.
     *
     * @param query: El nombre completo del paciente a buscar.
     * @return Objeto Paciente Encontrado
     */
    public Paciente searchPaciente(String query) {
        Paciente foundPaciente = null; // Variable para guardar el paciente encontrado, inicia en null.
        // Recorre cada objeto 'p' de tipo Paciente en la lista ClinicaMain.pacientes.
        for (Paciente p : this.getClinicaMain().pacientes) {
            // Compara el nombre completo del paciente actual con la cadena query.
            if ((p.getNombres() + " " + p.getApellidos()).equals(query)) {
                // Si coinciden, guarda el objeto paciente en foundPaciente.
                foundPaciente = p;
                // Termina el bucle.
                break;
            }
        }
        // Devuelve el paciente encontrado o null.
        return foundPaciente;
    }

    // --- Métodos para Actualizar (Edición) ---
    // Estos métodos serían necesarios para que la funcionalidad de edición del Controlador funcione.
    /**
     * Actualiza los datos de un Doctor existente en la lista.
     *
     * @param index: Índice del doctor a actualizar.
     * @param nombre: Nuevo nombre.
     * @param apellido: Nuevo apellido.
     * @param departamento: Nuevo departamento.
     * @param sueldo: Nuevo sueldo.
     * @return Operación exitosa o no
     */
    public boolean updateDoctor(int index, String nombre, String apellido, String departamento, double sueldo) {
        if (index >= 0 && index < ClinicaMain.doctores.size()) { // Valida índice
            Doctor doctorToUpdate = ClinicaMain.doctores.get(index); // Obtiene el doctor
            // Actualiza sus atributos usando métodos set.
            doctorToUpdate.setNombres(nombre);
            doctorToUpdate.setApellidos(apellido);
            doctorToUpdate.setDepartamento(departamento);
            doctorToUpdate.setSueldoHora(sueldo);
            return true; // Éxito
        }
        return false; // Fallo (índice inválido)
    }

    /**
     * Actualiza los datos de un Paciente existente en la lista.
     *
     * @param index: Índice del paciente a actualizar.
     * @param nombres: Nuevos nombres.
     * @param apellidos: Nuevos apellidos.
     * @param tipoSangre: Nuevo tipo de sangre.
     * @param numeroCedula: Nueva cédula.
     * @param edad: Nueva edad.
     * @param fechaNacimiento: Nueva fecha de nacimiento.
     * @return Operación exitosa o no
     */
    public boolean updatePaciente(int index, String nombres, String apellidos, String tipoSangre, String numeroCedula, int edad, String fechaNacimiento) {
        if (index >= 0 && index < ClinicaMain.pacientes.size()) { // Valida índice
            Paciente pacienteToUpdate = ClinicaMain.pacientes.get(index); // Obtiene el paciente
            // Actualiza sus atributos usando métodos set.
            pacienteToUpdate.setNombres(nombres);
            pacienteToUpdate.setApellidos(apellidos);
            pacienteToUpdate.setTipoSangre(tipoSangre);
            pacienteToUpdate.setNumeroCedula(numeroCedula);
            pacienteToUpdate.setEdad(edad);
            pacienteToUpdate.setFechaNacimiento(fechaNacimiento);
            return true; // Éxito
        }
        return false; // Fallo (índice inválido)
    }

} // Fin de la clase MainModelo
