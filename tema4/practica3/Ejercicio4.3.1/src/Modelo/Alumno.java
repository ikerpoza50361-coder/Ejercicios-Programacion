package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona{
    private String DNI;
    private ArrayList<Libro> librosAlquilados;

    public Alumno(String paisNacimiento, LocalDate fechaNacimiento, String nombre, String DNI, ArrayList<Libro> librosAlquilados) {
        super(paisNacimiento, fechaNacimiento, nombre);
        this.DNI = DNI;
        this.librosAlquilados = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Libro> getLibrosAlquilados() {
        return librosAlquilados;
    }

    public void setLibrosAlquilados(ArrayList<Libro> librosAlquilados) {
        this.librosAlquilados = librosAlquilados;
    }

    public void alquilar(Libro libro){
        librosAlquilados.add(libro);
    }

    public void devolver (Libro libro){
        librosAlquilados.remove(libro);
    }
}
