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
public class FraccionMain {

    
    public static void main(String[] args) {
      
        Scanner tec = new Scanner(System.in);
        
        Fraccion f1 = new Fraccion(tec.nextInt(),tec.nextInt());
        
        
        Fraccion f2 = new Fraccion(tec.nextInt(),tec.nextInt());
        
        Fraccion fD = f2.division(f1);
        System.out.println("División "+fD.getNumerador()+"/"+fD.getDenominador());
        
        
        Fraccion f3=f2.suma(f1);
        System.out.println("Suma "+f3.getNumerador()+"/"+f3.getDenominador());
        
        
        Fraccion fR = f2.resta(f1);
        System.out.println("Resta "+fR.getNumerador()+"/"+fR.getDenominador());
        
        
        Fraccion fM =f2.multiplicacion(f1);
        System.out.println("Multiplicación "+fM.getNumerador()+"/"+fM.getDenominador());
       
    }
    
}
