package ClaseOnce;

/**
 *
 * @author Emir
 */
public class ErrorUno {
    
    public static void main(String []args){
        
        //ejemplo 1
//        int result = 5 / 0;
//        
//        System.out.println(result);
        
//        ejemplo 2
//        int age = -5;
//        if(age<0){
//            throw new IllegalArgumentException("The age can't be negative");
//        }

        try{
            int result = 5/0;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir por cero");
        }
    }
}
