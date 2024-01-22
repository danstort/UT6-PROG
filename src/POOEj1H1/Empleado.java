/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H1;

/**
 *
 * @author danielsotoortiz
 */
public class Empleado {
    
    private String dni;
    private String nombre;
    private double sueldo;
    static int numEmpleados=0;

    public Empleado() {
        numEmpleados++;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }
    
    
}
