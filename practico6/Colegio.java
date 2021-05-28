package practico6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {

    public static void main(String args[]){
        List<String> listaNombres = new ArrayList<>();

        List<Persona> listaPersonas = new ArrayList<>();
        List<Alumno> listaAlumnos = new ArrayList<>();

        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Andres");

        for (String nombre: listaNombres){
            //System.out.println("El nombre es " + nombre);
        }


        Persona profe1 = new Profesor("Juan Lopez", 123, "Quimica");
        Persona profe2 = new Profesor("Ana Martinez", 333, "Fisica");
        Persona a1 = new Alumno("Ignacio Rodriguez", 6789, "Informatica");
        Persona a2 = new Alumno("Maria Jose Perez", 9876, "Administracion");

        System.out.println(profe1);
        System.out.println(profe2);
        System.out.println(a1);
        System.out.println(a2);

        Administrativo admin1 = new Administrativo("Joaquin Rodriguez", 222222);
        System.out.println(admin1);

        listaPersonas.add(profe1);
        listaPersonas.add(profe2);
        listaPersonas.add(a1);
        listaPersonas.add(a2);

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos a crear en el Sistema");
        int cantidad = input.nextInt();


        for (int i = 0; i < cantidad; i++){
            Alumno nuevoAlumno = crearAlumno();
            listaAlumnos.add(nuevoAlumno);
            System.out.println("Se ha ingresado un alumno a la lista de alumnos!!");
            System.out.println(nuevoAlumno);
        }

        if (listaAlumnos.isEmpty() == false) {

            mostrarAlumnos(listaAlumnos);

            System.out.println("Desea eliminar algun alumno de la lista? (SI/NO)");

            String respuesta = input.next();

            if (respuesta.toUpperCase().equals("SI")) {
                System.out.println("Ingrese el nro de estudiante a eliminar");
                int nro = input.nextInt();
                nro--;
                if (nro <= listaAlumnos.size()){
                    listaAlumnos.remove(nro);
                } else {
                    System.out.println("Posicion invalida. No se ha encontrado ese alumno");
                }
            }

            mostrarAlumnos(listaAlumnos);
        } else {
            System.out.println("No hay alumnos en el sistema!!");
        }
    }

    public static void mostrarAlumnos(List<Alumno> listaAlumnos){
        System.out.println("*****************");
        System.out.println("ALUMNOS DEL SISTEMA");
        int posicion = 1;
        for (Alumno alumno : listaAlumnos) {
            System.out.println(posicion + ":  " + alumno);
            posicion++;
        }
        System.out.println("*****************");
    }

    public static Alumno crearAlumno(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno");
        String nombre = input.next();

        System.out.println("Ingrese el DNI del alumno");
        int dni = input.nextInt();

        System.out.println("Ingrese el curso del alumno");
        String curso = input.next();

        Alumno alumno = new Alumno(nombre, dni, curso);
        return alumno;
    }


}
