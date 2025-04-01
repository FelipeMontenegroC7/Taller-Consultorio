package co.edu.uniqundio.poo.app;
import co.edu.uniqundio.poo.model.Consultorio;
import javax.swing.*;
import co.edu.uniqundio.poo.model.Especialidad;
public class Main {
    public static void main(String[] args) {

        String nombreConsultorio = JOptionPane.showInputDialog("Ingrese el nombre de consultorio");
        String direccionConsultorio =  JOptionPane.showInputDialog("Ingrese el direccion de consultorio");
        Consultorio consultorio = new Consultorio(nombreConsultorio, direccionConsultorio);

        JOptionPane.showMessageDialog(null, "Bienvendio al consultorio " + nombreConsultorio);

        while (true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción:\n" +
                            "1. Agregar Paciente\n" +
                            "2. Editar Paciente\n" +
                            "3. Agregar Odontólogo\n" +
                            "4. Editar Odontólogo\n" +
                            "5. Eliminar Odontólogo\n" +
                            "6. Mostarar Pacientes mas de 5 citas\n" +
                            "7. Salir", "Menú", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null || opcion.equals("7")) {
                break;
            }

            switch (opcion) {
                case "1":
                    String numeroHistoria = JOptionPane.showInputDialog("Número de historia clínica:");
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    String telefono = JOptionPane.showInputDialog("Teléfono:");
                    String direccion = JOptionPane.showInputDialog("Dirección:");
                    String fechaUltimaConsulta = JOptionPane.showInputDialog("Fecha última consulta:");
                    int tratamientos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de tratamientos realizados:"));
                    String mensaje = consultorio.agregarPaciente(numeroHistoria, nombre, edad, telefono, direccion, fechaUltimaConsulta, tratamientos);
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;

                case "2":
                    String numeroHistoria1 = JOptionPane.showInputDialog("Número de historia clínica del paciente a editar:");
                    String nombre1 = JOptionPane.showInputDialog("Nuevo nombre:");
                    int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Nueva edad:"));
                    String telefono1 = JOptionPane.showInputDialog("Nuevo teléfono:");
                    String direccion1 = JOptionPane.showInputDialog("Nueva dirección:");
                    String fechaUltimaConsulta1 = JOptionPane.showInputDialog("Nueva fecha de última consulta:");
                    int tratamientos1 = Integer.parseInt(JOptionPane.showInputDialog("Nueva cantidad de tratamientos realizados:"));

                    String mensaje1 = consultorio.editarPaciente(numeroHistoria1, nombre1, edad1, telefono1, direccion1, fechaUltimaConsulta1, tratamientos1);
                    JOptionPane.showMessageDialog(null, mensaje1);
                    break;

                case "3":
                    String nombre2 = JOptionPane.showInputDialog("Nombre del odontólogo:");
                    String identificacion2 = JOptionPane.showInputDialog("Identificación:");
                    String numeroLicencia2 = JOptionPane.showInputDialog("Número de licencia:");
                    Especialidad especialidad2 = Especialidad.valueOf(JOptionPane.showInputDialog("Especialidad (ODONTOLOGIA_GENERAL, ORTODONCIA, ENDODONCIA, CIRUGIA_ORAL):"));

                    String mensaje2 = consultorio.agregarOdontologo(nombre2, identificacion2, numeroLicencia2, especialidad2);
                    JOptionPane.showMessageDialog(null, mensaje2);
                    break;

                case "4":
                    String identificacion3 = JOptionPane.showInputDialog("Identificación del odontólogo a editar:");
                    String nombre3 = JOptionPane.showInputDialog("Nuevo nombre:");
                    String numeroLicencia3 = JOptionPane.showInputDialog("Nuevo número de licencia:");
                    Especialidad especialidad3 = Especialidad.valueOf(JOptionPane.showInputDialog("Nueva especialidad (ODONTOLOGIA_GENERAL, ORTODONCIA, ENDODONCIA, CIRUGIA_ORAL):"));
                    String mensaje3 = consultorio.editarOdontologo(nombre3, identificacion3, numeroLicencia3, especialidad3);
                    JOptionPane.showMessageDialog(null, mensaje3);
                    break;

                case "5":
                    String identificacion4 = JOptionPane.showInputDialog("Identificación del odontólogo a eliminar:");
                    String mensaje4 = consultorio.eliminarOdontologo(identificacion4);
                    JOptionPane.showMessageDialog(null, mensaje4);
                    break;

                case "6":
                    String mensaje5 = consultorio.mostrarListaPacientes5();
                    JOptionPane.showMessageDialog(null, mensaje5);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

}
