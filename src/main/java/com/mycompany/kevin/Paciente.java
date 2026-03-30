package com.mycompany.kevin;

import java.util.Scanner;

public class Paciente {

    //datos perosnale
    public String nombrePaciente;
    public int idPaciente;
    public byte edadPaciente;
    // datos de hospitalitario
    public String alergiaPaciente;
    public String estadoSaludPaciente;
    public String seguroPaciente;
    public int fechaSeguro;
    public String histoPaciente;

    public void nuevoPaciente(String nombre, int cedula, byte edad, String alergia, String seguro, String fechaSe) {
        nombrePaciente = nombre;
        idPaciente = cedula;
        edadPaciente = edad;
        alergiaPaciente = alergia;
        seguroPaciente = seguro;

    }

}
