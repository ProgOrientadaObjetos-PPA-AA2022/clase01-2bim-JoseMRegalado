
package herencia2;


import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudianteDistancia e1 = new EstudianteDistancia();
        System.out.println("Ingrese nombres");
        String ne = sc.nextLine();
        System.out.println("Ingrese apellidos");
        String ae = sc.nextLine();
        System.out.println("Ingrese identificacion");
        String ie = sc.nextLine();
        System.out.println("Ingrese edad");
        int ee = sc.nextInt();
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
        /*
        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de asignaturas: %d\n"
                + "Costo asignaturas: %.1f\n"
                + "Costo matricula: %.1f\n", 
                e1.obtenerNombresEstudiante(),e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroAsignaturas(),e1.obtenerCostoAsignatura(),
                e1.obtenerMatriculaDistancia());
        */
        System.out.printf("%s",e1);
    }
}
