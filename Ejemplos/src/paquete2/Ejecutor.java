
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000.00);
        
        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCostos(30000.00);
        
        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCostos(10000.00);
        
        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(5000.00);
        
        Edificio [] listaEdificios = {edf1,edf2,edf3,edf4};
        
        Vehiculo v1 = new Vehiculo("Auto","lbb0011",10000);
        Vehiculo v2 = new Vehiculo("Camioneta","lcb0011",20000);
        Vehiculo v3 = new Vehiculo("Auto","lbd0012",6000);
        Vehiculo v4 = new Vehiculo("Camioneta","lcc0011",10000);
        Vehiculo v5 = new Vehiculo("Camioneta","ldc0011",25000);
        
        Vehiculo [] listaVehiculos = {v1,v2,v3,v4,v5};
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa(); 
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerCostoBienesInmuebles();
        miempresa.establecerVehiculos(listaVehiculos);
        miempresa.establecerCostoVehiculos();
        miempresa.establecerCostoTotalBienes();
        miempresa.obtenerCostoTotalBienes();
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("%.2f\n",miempresa.obtenerCostoBienesInmuebles());
        System.out.printf("%s\n",miempresa);
    }
}
