/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H3;

import POOEj1H2.*;
import POOEj1H1.*;
import java.util.Objects;

class Empleado implements Cloneable{
    
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    public Object Clone() {

        Object objeto = null;

        try {

            objeto = super.clone();

        } catch (CloneNotSupportedException ex) {

            System.out.println("Error al duplicar");

        }

        return objeto;
    }
}
