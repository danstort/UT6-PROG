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
public class LibroMain {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        Libro l1 = new Libro();
        l1.setTitulo(tec.nextLine());
        l1.setIsbn(tec.nextLine());
        l1.setAutor(tec.nextLine());

        l1.prestamo();
        System.out.println(l1.toString());

        l1.devolucion();
        System.out.println(l1.toString());

    }

}
