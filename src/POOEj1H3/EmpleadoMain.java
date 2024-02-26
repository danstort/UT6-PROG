/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H3;

import POOEj1H2.*;
import POOEj1H1.*;

/**
 *
 * @author danielsotoortiz
 */
public class EmpleadoMain {

   
    public static void main(String[] args) {
        
      Empleado e1 = new Empleado();
        System.out.println("Número empleados:"+Empleado.numEmpleados);
        
        Empleado e2 = new Empleado();
        Empleado e3 = new Empleado();
        System.out.println("Número empleados:"+Empleado.numEmpleados);
        
        Empleado e4 = (Empleado)e1.Clone();
        
        if (e1.equals(e4)) {
            System.out.println("Empleados iguales");
        }
    }
    
}
