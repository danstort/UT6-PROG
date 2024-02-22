/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H3;

import POOEj1H2.*;
import POOEj1H1.*;
import java.util.Scanner;


public class LibroMain {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        Libro l1 = new Libro();
        l1.setTitulo(tec.nextLine());
        l1.setIsbn(tec.nextLine());
        l1.setAutor(tec.nextLine());
        
        System.out.println("--prestado--");
        l1.prestamo();
        System.out.println(l1.toString());
        
        System.out.println("--disponible--");
        l1.devolucion();
        System.out.println(l1.toString());
        
        System.out.println("--Libro l2--");
        Libro l2 = new Libro();
        l2.setTitulo(tec.nextLine());
        l2.setIsbn(tec.nextLine());
        l2.setAutor(tec.nextLine());
        l2.devolucion();
        System.out.println(l2.toString());
        
        Libro l3 = (Libro)l1.Clone();
        
        
        
        if(l1.equals(l3)){
        
            System.out.println("l y l3 son iguales");
            
        } else {
        
            System.out.println("l y l3 no son iguales");
            
        }

    }

}
