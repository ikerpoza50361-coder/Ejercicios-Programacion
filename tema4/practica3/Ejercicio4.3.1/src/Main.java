import Modelo.Alumno;
import Modelo.Autor;
import Modelo.Libro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        generarDatos();
        menu();
    }
    public static void generarDatos(){
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(new Autor("España", LocalDate.of(1999,10,12),"Autor1"));
        autores.add(new Autor("España", LocalDate.of(1999,10,12),"Autor2"));
        autores.add(new Autor("España", LocalDate.of(1999,10,12),"Autor3"));
        autores.add(new Autor("España", LocalDate.of(1999,10,12),"Autor4"));

        libros.add(new Libro("Libro1","Editorial", 90, autores.get(0)));
        libros.add(new Libro("Libro2","Editorial", 90, autores.get(1)));
        libros.add(new Libro("Libro3","Editorial", 90, autores.get(2)));
        libros.add(new Libro("Libro4","Editorial", 90, autores.get(3)));

        ArrayList<Libro> librosA1 = new ArrayList<>();
        alumnos.add(new Alumno("España",LocalDate.of(2004,12,1),"Alumno1","123A", librosA1));

        ArrayList<Libro> librosA2 = new ArrayList<>();
        alumnos.add(new Alumno("España",LocalDate.of(2004,12,1),"Alumno2","123A", librosA2));

        ArrayList<Libro> librosA3 = new ArrayList<>();
        alumnos.add(new Alumno("España",LocalDate.of(2004,12,1),"Alumno3","123A", librosA3));

        ArrayList<Libro> librosA4 = new ArrayList<>();
        alumnos.add(new Alumno("España",LocalDate.of(2004,12,1),"Alumno4","123A", librosA4));
    }
    public static void menu(){
        System.out.print("""
               --- Menu Biblioteca ---
               1. Alquiler Libro
               2. Devolver Libro
               3. Ver datos disponibles
               4. Salir""");
        int respuesta = sc.nextInt();
        switch(respuesta){
            case 1:
                alquilarLibro();
            break;
            case 2:
                devolverLibro();
            break;
            case 3:
                datos();
            break;
            case 4:
                finalizar();
            break;
        }
    }
    public static void alquilarLibro(){
        System.out.println("Dime el nombre del alumno:");
        String nombre = sc.nextLine();
        System.out.println("Dime el libro que quieres alquilar:");
        String libro = sc.nextLine();

    }
}