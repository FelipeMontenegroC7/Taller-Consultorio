package co.edu.uniqundio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private String nombre;
    private String direccion;
    private List<Paciente> listaPacientes;
    private List<Registro> listaRegistros;
    private List<Odontologo> listaOdontologos;

    public Consultorio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaPacientes = new ArrayList<>();
        this.listaRegistros = new ArrayList<>();
        this.listaOdontologos = new ArrayList<>();
    }

    public String agregarPaciente(String numeroHistoriaClinica, String nombre, int edad,
                                  String telefono, String direccion, String fechaUltimaConsulta,
                                  int cantidadTratamientosRealizados) {
        String mensaje = "";
        if (buscarPaciente(numeroHistoriaClinica) != null) {
            mensaje = "El paciente ya está registrado";
        }else{

        Paciente nuevoPaciente = new Paciente(numeroHistoriaClinica, nombre, edad,
                telefono, direccion, fechaUltimaConsulta, cantidadTratamientosRealizados);
        listaPacientes.add(nuevoPaciente);
        mensaje = "Paciente se ha agregado correctamente";
        }
        return mensaje;
    }
    public String editarPaciente(String numeroHistoriaClinica, String nombre, int edad,
                                 String telefono, String direccion, String fechaUltimaConsulta,
                                 int cantidadTratamientosRealizados) {
        String mensaje = "";
        Registro aux = null;
        for(Registro registroAux : listaRegistros){
            if(registroAux.getNumeroHistoriaClinica().equals(numeroHistoriaClinica)){
                aux =  registroAux;
            }
        }
        if(aux == null){
            mensaje = "Paciente no existe";
        }else{
            Paciente nuevoPaciente = new Paciente(numeroHistoriaClinica, nombre, edad, telefono,
            direccion, fechaUltimaConsulta, cantidadTratamientosRealizados);
            aux.setListaPacientes(nuevoPaciente);
            mensaje = "Paciente se ha editado correctamente";
        }
        return mensaje;
    }

    private Paciente buscarPaciente(String numeroHistoriaClinica) {
        Paciente pacienteEncontrado = null;
        for (Paciente pacienteAux : listaPacientes) {
            if (pacienteAux.numeroHistoriaClinica().equals(numeroHistoriaClinica)) {
                pacienteEncontrado = pacienteAux;
            }
        }
        return pacienteEncontrado;
    }

    public String agregarOdontologo(String nombre, String identificacion, String numeroDeLicencia, Especialidad especialidad) {
        String mensaje = "";
        if(buscarOdontologo(identificacion) != null){
            mensaje = "El Odontologo ya esta registrado";
        }else{
            Odontologo nuevoOdontologo = new Odontologo(nombre, identificacion, numeroDeLicencia, especialidad);
            listaOdontologos.add(nuevoOdontologo);
            mensaje = "El Odontologo se ha agregado correctamente";
        }
        return mensaje;
    }

    public String editarOdontologo(String nombre, String identificacion, String numeroDeLicencia, Especialidad especialidad){
        String mensaje = "";
        Odontologo odontologoEditar = buscarOdontologo(identificacion);
        if(odontologoEditar != null){
            odontologoEditar.setNombre(nombre);
            odontologoEditar.setIdentificacion(identificacion);
            odontologoEditar.setNumeroDeLicencia(numeroDeLicencia);
            odontologoEditar.setEspecialidad(especialidad);
            mensaje = "El Odontologo se ha editado correctamente";

        }else{
            mensaje = "el Odontologo no existe en la base de datos del Consultorio";
        }
        return mensaje;
    }

    public String eliminarOdontologo(String identificacion) {
        String mensaje = "";
        Odontologo odontologoEliminar = buscarOdontologo(identificacion);
        if(odontologoEliminar != null){
            listaOdontologos.remove(odontologoEliminar);
            mensaje = "El Odontologo se ha eliminado correctamente";
        }else{
            mensaje = "El odontologo no está en la base de datos del Consultorio";
        }
        return mensaje;
    }

    public ArrayList<Paciente> obtenerPacientes5Citas(){
        if(listaPacientes == null || listaPacientes.isEmpty()){
            return new ArrayList<>();
        }
        ArrayList<Paciente> resultado = new ArrayList<>();
        for(Paciente pacienteAux : listaPacientes){
            if (pacienteAux.cantidadTratamientosRealizados() > 5){
                resultado.add(pacienteAux);
            }
        }
        return  resultado;
    }
    public String mostrarListaPacientes5(){
        String pacientesResultado = "";
        listaPacientes = obtenerPacientes5Citas();
        for(Paciente pacienteAux : listaPacientes){
            pacientesResultado = pacienteAux.toString();
        }
        return pacientesResultado;
    }

    private Odontologo buscarOdontologo(String identificacion) {
        Odontologo odontologoEncontrado = null;
        for (Odontologo odontologoAux : listaOdontologos) {
            if (odontologoAux.getIdentificacion().equals(identificacion)) {
                odontologoEncontrado = odontologoAux;
            }
        }
        return odontologoEncontrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public List<Odontologo> getListaOdontologos() {
        return listaOdontologos;
    }

    public void setListaOdontologos(List<Odontologo> listaOdontologos) {
        this.listaOdontologos = listaOdontologos;
    }
}

