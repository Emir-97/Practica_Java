package ClaseNueve;

/**
 *
 * @author Emir
 */
public class VehiculoDeportivo extends Vehiculo{
        
    private int cilindrada;
    
    public VehiculoDeportivo(String matricula, String marca,
            String modelo, int cilindrada){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    public String mostrarDatos(){
        return "Matricula: "+matricula+" Marca: "+marca+
                " Modelo: "+modelo+" Cilindradas: "+
                cilindrada;
    }
}
