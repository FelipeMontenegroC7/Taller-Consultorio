package co.edu.uniqundio.poo.model;

import java.util.ArrayList;

public class Registro {
    private String numeroHistoriaClinica;
    private ArrayList<Paciente> listaPacientes;

    public Registro(String numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.listaPacientes = new ArrayList<>();
    }

    public String getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(String numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(Paciente paciente) {
        listaPacientes.add(paciente);
    }
}
