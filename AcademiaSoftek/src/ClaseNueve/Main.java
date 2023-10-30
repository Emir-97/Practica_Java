package ClaseNueve;

/**
 *
 * @author Emir
 */
public class Main {
    
    public static void main(String []args){
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("AF128", "Ferrari", "A8");
        
        misVehiculos[1] = new VehiculoTurismo(4,"RST123", "Peugeot", "504");
        
        misVehiculos[2] = new VehiculoDeportivo("ABC145", "GolGTI", "3", 500);
        
        misVehiculos[3] = new VehiculoFurgoneta(300, "MNO654", "Fiat", "Fiorino");
        
        for(Vehiculo Vehiculos:misVehiculos){
            System.out.println(Vehiculos.mostrarDatos());
        }
    }
}
