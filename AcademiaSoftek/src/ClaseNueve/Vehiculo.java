package ClaseNueve;


/**
 *
 * @author Emir
 */
public class Vehiculo {
    
    //protected: puede ser accedido solamente por la clase o sus clases hijas
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String mostrarDatos(){
        return "Matricula: "+matricula+" Marca: "+marca+
                " Modelo: "+modelo;
    }
}
