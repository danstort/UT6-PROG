package POOEj1H5;

import java.util.Scanner;


public class CerrojoMain {

    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner (System.in);
        
        Cerrojo micerrojo= new Cerrojo(tec.nextLine());
        
        if(micerrojo.abrir(tec.nextLine())){
                    
            System.out.println("El cerrojo está abierto");
            
        } else{
        
            System.out.println("No se puede abrir");
            
        }
        
        micerrojo.cerrar();
        
        if(micerrojo.abrir(tec.nextLine())){
                    
            System.out.println("El cerrojo está abierto");
            
        } else{
        
            System.out.println("No se puede abrir");
            
        }
        
    }

}
