/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H1;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class FechaMain {

    
    public static void main(String[] args) {
      
        Scanner tec = new Scanner(System.in);
        Fecha f1 = new Fecha(tec.nextInt(),tec.nextInt(),tec.nextInt());
        
        f1.fechaCorrecta();
        
        if(f1.fechaCorrecta()==true){
        
            f1.diaSiguiente();
            System.out.println(f1.toString());
            
        } else {
        
            System.out.println("Fecha incorrecta");
        }
        
        
        
    }
    
}
