
package paquete1;


public class Vehiculo {
    private String tipo;
    private String matricula;
    private double costo;
    public Vehiculo(String t, String m, double c){
        tipo = t;
        matricula = m;
        costo = c;
    }
    public void establecerTipo(String m){
        tipo = m;
    }
    
    public void establecerMatricula(String m){
        matricula = m;
    }

    public void establecerCosto(Double m){
        costo = m;
    }
    
    public String obtenerTipo(){
        return tipo;
    }  
    
    public String obtenerMatricula(){
        return matricula;
    }
   
    public double obtenerCosto(){
        return costo;
    }
    @Override
    public String toString(){
        String cadena = String.format("Tipo de vehiculo: %s\n"
                + "Matricula del vehiculo: %s\n"
                + "Costo del vehiculo: %.2f",
                tipo,matricula,obtenerCosto());
        return cadena;
    }
}
