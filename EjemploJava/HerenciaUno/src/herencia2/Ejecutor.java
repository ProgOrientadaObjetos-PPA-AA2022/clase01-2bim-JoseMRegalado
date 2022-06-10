
package herencia2;

import herencia1.EstudiantePresencial;


public class Ejecutor {
    public static void main(String[] args) {
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Jose Miguel");
        e1.establecerApellidoEstudiante("Regalado Valarezo");
        e1.establecerIdentificacionEstudiante("1104857071");
        e1.establecerEdadEstudiante(19);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de creditos: %d\n"
                + "Costo credito: %.1f\n"
                + "Costo matricula: %.1f\n", 
                e1.obtenerNombresEstudiante(),e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
    }
}
