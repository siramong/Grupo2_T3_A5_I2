# Sistema de Gestión de Clínicas - Documentación del Proyecto

## 1. Contexto de desarrollo: Organización del Proyecto con el Patrón MVC

**Patrón de diseño MVC (Modelo-Vista-Controlador):** El patrón MVC se utiliza para separar la lógica de negocio de la interfaz de usuario. Esto facilita la gestión y mantenimiento del código, además de mejorar la escalabilidad y reutilización. En el contexto del sistema de gestión de clínicas, cada componente del MVC tendrá un rol específico.

### Modelo (Model)
El **Modelo** es la capa encargada de gestionar la información y la lógica de negocio. En este caso, representará los datos de los pacientes, doctores, citas médicas, y las gestiones de la clínica (ingresos, egresos, recursos humanos). Además, en el modelo se gestionan las operaciones como registrar pacientes, generar historiales médicos, calcular costos de citas, etc.

**Recomendaciones para el Modelo:**

- **Clases como:**
  - Paciente: Atributos como nombre, edad, historialMedico, datosPersonales, etc.
  - Doctor: Atributos como nombre, departamento, horario, sueldo, etc.
  - CitaMedica: Atributos como fecha, costo, doctor, paciente, etc.
  - Clinica: Atributos como ingresos, egresos, recursosHumanos.

- **Métodos de negocio** como: registrarPaciente(), registrarDoctor(), calcularCostoCita(), actualizarHistorialMedico(), etc.

### Vista (View)
La **Vista** es la interfaz gráfica que interactúa con el usuario. Aquí se usan elementos visuales que muestran los datos y permiten al usuario ingresar información o consultar resultados. En Java, para esto se puede utilizar **Swing**. La vista no debe contener lógica de negocio; solo debe capturar la entrada del usuario y mostrar los resultados proporcionados por el controlador.

**Recomendaciones para la Vista:**

- **Controles a utilizar:**
  - **JFrame** para las ventanas principales.
  - **JPanel** para organizar las secciones de la interfaz.
  - **JTextField** para ingresar datos (como el nombre del paciente, doctor, etc.).
  - **JButton** para enviar o ejecutar acciones (registrar pacientes, doctor, realizar citas).
  - **JTable** para mostrar los registros de pacientes, citas y doctores.
  - **JComboBox** para seleccionar opciones como departamento de los doctores o tipo de cita médica.

**Interacción con el Usuario:** La vista captura la entrada del usuario y pasa esos datos al controlador, quien luego interactúa con el modelo. Después, el modelo devuelve la información al controlador, quien actualiza la vista.

### Controlador (Controller)
El **Controlador** maneja la interacción entre el Modelo y la Vista. Recibe las acciones del usuario desde la Vista (como un clic en un botón) y decide qué acción tomar, a menudo invocando métodos del Modelo. Después de realizar una acción, el controlador actualiza la Vista con los resultados.

**Recomendaciones para el Controlador:**

- El controlador debe gestionar las acciones de los botones y otros controles. Ejemplo: Si el usuario hace clic en "Registrar Paciente", el controlador recibe los datos de la Vista, valida la información y llama al método correspondiente en el Modelo para agregar el paciente.
- Los controladores no deberían contener lógica de negocio, solo la lógica para coordinar la interacción entre la Vista y el Modelo.

## 2. Diagrama UML

Un diagrama UML es esencial para entender la relación entre las clases y cómo interactúan. A continuación, describo una estructura básica para el sistema propuesto:

### Clases principales:

#### Clase Paciente
- **Atributos:**
  - nombre: String
  - edad: int
  - direccion: String
  - historialMedico: String
  - datosPersonales: String
- **Métodos:**
  - registrarPaciente()
  - actualizarHistorial()
  - consultarHistorial()

#### Clase Doctor
- **Atributos:**
  - nombre: String
  - departamento: String
  - horario: String
  - sueldo: double
- **Métodos:**
  - asignarHorario()
  - actualizarSueldo()
  - consultarDatosLaborales()

#### Clase CitaMedica
- **Atributos:**
  - fecha: Date
  - costo: double
  - doctor: Doctor
  - paciente: Paciente
- **Métodos:**
  - agendarCita()
  - calcularCosto()

#### Clase Clinica
- **Atributos:**
  - ingresos: double
  - egresos: double
  - recursosHumanos: List
- **Métodos:**
  - calcularIngresos()
  - calcularEgresos()
  - agregarRecursoHumano()

### Relación entre clases:
- **Paciente** puede tener muchas **CitaMedica**.
- **Doctor** puede tener muchas **CitaMedica**.
- **Clinica** gestiona varios **Doctor** (mediante recursos humanos).
- **CitaMedica** tiene un **Doctor** y un **Paciente**.

## 3. Planeación y Estructura

### Fase 1: Análisis y Diseño (Sesión 1 en clase)
- Explicar los conceptos de MVC, POO y UML.
- Crear un diagrama UML simple para guiar el desarrollo.
- Definir clases principales: Paciente, Doctor, CitaMedica, Clinica.

### Fase 2: Implementación de la Vista (Sesión 2 en clase)
- Desarrollar la interfaz gráfica utilizando JSwing.
- Crear formularios para registrar pacientes, doctores y citas médicas.
- Implementar botones y cuadros de texto para la interacción básica.

### Fase 3: Implementación del Modelo (Sesión 3 en clase)
- Desarrollar las clases de modelo con sus atributos y métodos.
- Implementar la lógica de negocio para registrar pacientes, doctores y citas médicas.

### Fase 4: Controlador y Conexión (Sesión 4 en casa)
- Implementar la lógica del controlador que maneja las interacciones entre la vista y el modelo.
- Conectar la vista con el modelo mediante el controlador.

### Fase 5: Funcionalidades adicionales y pruebas (Sesión 5 en casa)
- Añadir funcionalidades como el cálculo de ingresos y egresos.
- Probar la aplicación y corregir errores.

### Fase 6: Integración y presentación final (Sesión 6 en clase)
- Integrar todos los componentes.
- Realizar pruebas finales y corregir errores.
- Presentar el proyecto.

## 4. Desafíos adecuados

### Desafíos recomendados:
- Implementar la gestión de citas médicas con diferentes doctores y pacientes.
- Crear un sistema de cálculo de costos basado en el departamento del doctor.
- Implementar la gestión de ingresos y egresos de la clínica.

> Estos desafíos son alcanzables para estudiantes con un nivel medio en Java y refuerzan los conceptos clave de POO y MVC.

## 5. Cronograma

### Sesión 1 (En clase):
- Explicación del patrón MVC y cómo se aplicará en el proyecto.
- Creación del diagrama UML básico.
- Diseño de las clases principales.

### Sesión 2 (En clase):
- Implementación de la interfaz gráfica (JSwing).
- Diseño de formularios para ingresar datos (pacientes, doctores).

### Sesión 3 (En clase):
- Implementación de las clases de Modelo.
- Desarrollo de los métodos de negocio (registrar pacientes, doctores).

### Sesión 4 (En casa):
- Desarrollo del Controlador.
- Conexión de la Vista y el Modelo.

### Sesión 5 (En casa):
- Implementación de funcionalidades adicionales (cálculos de ingresos, egresos).
- Pruebas de la aplicación y depuración.

### Sesión 6 (En clase):
- Integración de la aplicación.
- Presentación final y revisión de posibles mejoras.

## 6. Enfoque didáctico

- **MVC**: Explicar cómo cada componente (Modelo, Vista, Controlador) tiene un propósito específico y cómo trabajan juntos para lograr la funcionalidad de la aplicación.
- **POO**: Reforzar la importancia de la organización del código a través de clases y objetos, destacando el uso de herencia y polimorfismo.
- **Buenas prácticas**: Fomentar el uso de nombres de variables claros, comentarios y la modularización del código.
