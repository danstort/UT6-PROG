/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H4;


class Empleado {
   
    protected String nombre;
    protected int edad;
    protected boolean casado;
    protected double salario = 1000;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(String nombre, int edad, boolean casado) throws EEdadNoValida{
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
        
        if (edad<18 | edad>65) {
            
            throw new EEdadNoValida("No se puede dar de alta. Edad inferior a 18 años");
            
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    
}
