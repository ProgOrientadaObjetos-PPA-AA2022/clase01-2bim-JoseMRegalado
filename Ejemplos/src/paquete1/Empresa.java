/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private double costoBienesInmuebles;
    private Vehiculo[] vehiculos;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < obtenerEdificios().length; i++) {
            suma += edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    
    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }
    
    public void establecerCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma += vehiculos[i].obtenerCosto();
        }
        costoVehiculos = suma;
    }
    
    public void establecerCostoTotalBienes(){
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }
    
    
    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }
    
    public double obtenerCostoVehiculos() {
        return costoVehiculos;
    }
    
    public double obtenerCostoTotalBienes() {
        return costoTotalBienes;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\nLista de Edficios:\n",
                nombre);
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d %s (%.2f)\n",
                    reporte,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de inmuebles: %.2f\n\n"
                + "Lista Vehiculos\n",
                reporte,
                costoBienesInmuebles);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d %s, %s (%.2f)\n",
                    reporte,
                    i + 1,
                    vehiculos[i].obtenerTipo().toUpperCase(),
                    vehiculos[i].obtenerMatricula().toUpperCase(),
                    vehiculos[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de vehiculos: %.2f\n\n",
                reporte,
                costoVehiculos);
        reporte = String.format("%sTotal bienes: %.2f\n",
                reporte,
                costoTotalBienes);
        return reporte;
    }
}
