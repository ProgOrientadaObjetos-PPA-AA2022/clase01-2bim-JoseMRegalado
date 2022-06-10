package herencia2;

import herencia1.EstudiantePresencial;

import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //String ne; 
        //String ae;
        //String ie;
        //int ee;
        System.out.println("Que tipo de estudiante desea ingresar:\n"
                + "1. Estudiante a Distancia\n"
                + "2. Estudiante Presencial");
        int op = sc.nextInt();
        if (op == 1 || op == 2) {
            sc.nextLine();
            System.out.println("Ingrese nombres");
            String ne = sc.nextLine();
            System.out.println("Ingrese apellidos");
            String ae = sc.nextLine();
            System.out.println("Ingrese identificacion");
            String ie = sc.nextLine();
            System.out.println("Ingrese edad");
            int ee = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Estudiante Distancia");
                    EstudianteDistancia e1 = new EstudianteDistancia();

                    System.out.println("Ingrese el numero de asignaturas");
                    int nasig = sc.nextInt();
                    System.out.println("Ingrese el costo de las asignaturas");
                    double casig = sc.nextDouble();
                    e1.establecerNombresEstudiante(ne);
                    e1.establecerApellidoEstudiante(ae);
                    e1.establecerIdentificacionEstudiante(ie);
                    e1.establecerEdadEstudiante(ee);
                    e1.establecerNumeroAsginaturas(nasig);
                    e1.establecerCostoAsignatura(casig);
                    e1.calcularMatriculaDistancia();
                    System.out.println("Estudiante");
                    System.out.printf("%s", e1);
                    break;

                case 2:
                    System.out.println("Estudiante Presencial");
                    EstudiantePresencial e2 = new EstudiantePresencial();
                    e2.establecerNombresEstudiante(ne);
                    e2.establecerApellidoEstudiante(ae);
                    e2.establecerIdentificacionEstudiante(ie);
                    e2.establecerEdadEstudiante(ee);
                    System.out.println("Ingrese el numero de creditos");
                    int ncred = sc.nextInt();
                    System.out.println("Ingrese el costo del credito");
                    double ccred = sc.nextDouble();
                    e2.establecerNombresEstudiante(ne);
                    e2.establecerApellidoEstudiante(ae);
                    e2.establecerIdentificacionEstudiante(ie);
                    e2.establecerEdadEstudiante(ee);
                    e2.establecerNumeroCreditos(ncred);
                    e2.establecerCostoCredito(ccred);
                    e2.calcularMatriculaPresencial();
                    System.out.println("Estudiante");
                    System.out.printf("%s", e2);
                    break;

                default:
                    System.out.println("Opcion invalida, ingrese 1 o 2");
                    break;
            }
        } else {
            System.out.println("Opcion invalida, ingrese 1 o 2");
        }

    }
}
