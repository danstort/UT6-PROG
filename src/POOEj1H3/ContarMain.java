/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H3;

import POOEj1H2.*;
import java.util.Scanner;


public class ContarMain {

    
    public static void main(String[] args) {
       
        Scanner tec = new Scanner(System.in);
        Contar c1 = new Contar();
        c1.incrementar(tec.nextInt());
        c1.decrementar(tec.nextInt());
        System.out.println("c1 "+c1.toString());
        
        Contar c2 = new Contar();
        c2.incrementar(tec.nextInt());
        c2.decrementar(tec.nextInt());
        System.out.println("c2 "+c2.toString());
        
        System.out.println("suma: "+c2.suma(c1));
        
        Contar c3 =(Contar)c1.Clone();
        
        if (c1.equals(c3)){
        
            System.out.println("c1 y c3 son iguales");
        } else {
        
            System.out.println("c1 y c3 no son iguales");
            
        }
        
       
    }
    
}
