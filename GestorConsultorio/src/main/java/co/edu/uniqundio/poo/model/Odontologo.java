package co.edu.uniqundio.poo.model;

public class Odontologo {
    private String nombre;
    private String identificacion;
    private String numeroDeLicencia;
    private Especialidad especialidad;

    public Odontologo(String nombre, String identificacion, String numeroDeLicencia, Especialidad especialidad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numeroDeLicencia = numeroDeLicencia;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNumeroDeLicencia() {
        return numeroDeLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNumeroDeLicencia(String numeroDeLicencia) {
        this.numeroDeLicencia = numeroDeLicencia;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Odontólogo: " + nombre + " | ID: " + identificacion + " | Licencia: " + numeroDeLicencia + " | Especialidad: " + especialidad;
    }
}