
package ClaseOncebis;

import java.util.ArrayList;
import java.util.List;

public class StreamAPP {
    private List<String> list1;
    private List<String> nums;
    
    public StreamAPP(){
        
        //Constructor de la clase StreamAoo
        list1 = new ArrayList<>();
        
        //Agregamos cadena a la lista "list1"
        list1.add("Emir");
        list1.add("Naim");
        list1.add("Monica");
        list1.add("Malak");
        
        //Creamos una lista llamada numeros para almacenar cadenas
        nums = new ArrayList<>();
        
        nums.add("1");
        nums.add("2");
    }
    
        public void filtrar(){
            list1.stream().filter(x-> x.startsWith("M")).forEach(System.out::println);
        }
        
        public void ordenar(){
            
            list1.stream().sorted().forEach(System.out::println);
        }
        
        public void transformar(){
            list1.stream().map(String::toUpperCase).forEach(System.out::println);
        }
        
        public void limitar(){
            list1.stream().limit(2).forEach(System.out::println);
        }
        
        public void contar(){
            long x = list1.stream().count();
            System.out.println(x);
        }
        
        public static void main(String args[]){
            StreamAPP app = new StreamAPP();
//            app.filtrar();
//            app.ordenar();
//            app.transformar();
//            app.limitar();
            app.contar();
        }
}
