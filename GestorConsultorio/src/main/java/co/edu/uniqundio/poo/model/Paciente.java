package co.edu.uniqundio.poo.model;

public record Paciente(String numeroHistoriaClinica, String nombre, int edad,
                       String telefono, String direccion, String fechaUltimaConsulta,
                       int cantidadTratamientosRealizados) {

    @Override
    public String numeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int edad() {
        return edad;
    }

    @Override
    public String telefono() {
        return telefono;
    }

    @Override
    public String direccion() {
        return direccion;
    }

    @Override
    public String fechaUltimaConsulta() {
        return fechaUltimaConsulta;
    }

    @Override
    public int cantidadTratamientosRealizados() {
        return cantidadTratamientosRealizados;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | Historia Clínica: " + numeroHistoriaClinica + " | Edad: " + edad + " | Teléfono: " + telefono +
                " | Dirección: " + direccion + " | Última Consulta: " + fechaUltimaConsulta + " | Tratamientos: " + cantidadTratamientosRealizados;
    }
}
