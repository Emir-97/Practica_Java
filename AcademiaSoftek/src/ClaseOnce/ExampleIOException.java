package ClaseOnce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleIOException {
    
    public void readFile() throws FileNotFoundException, IOException{
        
        //se crea un object file que representa la ubicacion del file en el file system 
        File file1 = new File("C:\\Users\\Emir\\Desktop\\SOFTEK - ACADEMIA - JAVA - SPRINGBOOT\\file.txt");
        
        //iniciamos un try-catch para manejar exeptions que puedan aparecer en file1
        try(FileReader fr = new FileReader(file1)){
            int c;
            while((c = fr.read()) != -1){
                System.out.println((char) c);
            }
        } catch(FileNotFoundException e){
            System.out.println("Error: We can't find the file");
        }
    }
    public void readFile2() throws IOException{
            readFile();
        }
    
    public static void main(String args[]){
        
        ExampleIOException file = new ExampleIOException();
        
        try{
            file.readFile();
        } catch(IOException e){
            System.out.println("Read Error: "+ e.getMessage());
        }
    }
}
