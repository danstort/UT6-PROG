/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H4;

/**
 *
 * @author danielsotoortiz
 */
class Programador extends Empleado{

    
    int lineasDeCodigoPorHora;
    String lenguajeDominante;

    public Programador() {
    }

    public Programador(int lineasDeCodigoPorHora, String nombre, int edad, boolean casado) throws EEdadNoValida {
        super(nombre, edad, casado);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        
    }

    
    
     public double calcularSalario(int horasExtra) {

        double r = 0;
        if (lineasDeCodigoPorHora > 1500) {

            r = salario * 1.5 + (horasExtra * 20);

        } else {

            r = salario + (horasExtra * 20);

        }

        return r;

    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

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

    @Override
    public String toString() {
        return "Programador{" + "lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante=" + lenguajeDominante + '}';
    }
     
    
     
}
