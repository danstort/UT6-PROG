/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosClase;

/**
 *
 * @author danielsotoortiz
 */
public class TrabajadorEventual extends Empleado{
    
    private int añoContratacion;
    @Override
    public int calculaSueldo() {

        int r=(int) (2000+(añoContratacion-2024)*30.5);
        return r;
    }
    
    
}
