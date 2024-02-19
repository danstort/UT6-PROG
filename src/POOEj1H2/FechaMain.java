/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H2;

import POOEj1H1.*;
import java.util.Scanner;

public class FechaMain {

    
    public static void main(String[] args) {
      
        Scanner tec = new Scanner(System.in);
        Fecha f1 = new Fecha(tec.nextInt(),tec.nextInt(),tec.nextInt());
        Fecha f2 = new Fecha(tec.nextInt(),tec.nextInt(),tec.nextInt());
        
        if(f1.equals(f2)){
            System.out.println("f y f2 son iguales");
        } else{
            System.out.println("f y f2 no son iguales");
        }
        
        
        f1.fechaCorrecta();
        
        if(f1.fechaCorrecta()==true){
        
            f1.diaSiguiente();
            System.out.println(f1.toString());
            
        } else {
        
            System.out.println("Fecha incorrecta");
        }
        
        
        
    }
    
}
