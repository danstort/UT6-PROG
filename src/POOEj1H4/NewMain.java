/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H4;

/**
 *
 * @author danielsotoortiz
 */
import java.util.Scanner;


class EEdadNoValida extends Exception{
    
    public EEdadNoValida (){}

    public EEdadNoValida(String message) {
        super(message);
    }

}

enum nIngles {
    Alto, bajo, medio
}

public class NewMain {

    public static void main(String[] args) throws EEdadNoValida {
	
        Scanner tec = new Scanner(System.in);

        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");

        char a = tec.nextLine().charAt(0);
        System.out.println("Introduce nombre administrativo");

        String b = tec.nextLine();

        System.out.println("¿Está casad@? s/n");

        char c = tec.nextLine().charAt(0);
        Boolean d = true;

        if (c == 's') {

            d = true;

        } else {

            d = false;

        }
        nIngles e = nIngles.Alto;
        
        
        if (a == 'a') {
            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");

            char ee = tec.nextLine().charAt(0);
            

            if (ee == 'a') {

                e = e.Alto;

            } else if (ee == 'm') {

                e = e.medio;
            } else if (ee == 'b') {

                e = e.bajo;
            }
        }
        int lincod = 0;
        if (a == 'p') {

            System.out.println("Lineas de código por hora");
            lincod = tec.nextInt();
        }

        System.out.println("Introduzca su edad");
        int ed = tec.nextInt();

        switch (a) {
            case 'a':

                Administrativo a1 = new Administrativo(e, b, ed, d);

                break;

            case 'p':

                Programador p1 = new Programador(lincod, b, ed, d);

                break;

            default:
                System.out.println("Introduzca un valor válido");
        }

    }

}



class Empleado {
   
    protected String nombre="";
    protected int edad=0;
    protected boolean casado=false;
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

class Administrativo extends Empleado {

    nIngles ni = nIngles.Alto;

    public Administrativo() {
    }

    public Administrativo(nIngles ni, String nombre, int edad, boolean casado) throws EEdadNoValida {
        super(nombre, edad, casado);
        this.ni = ni;
    }

    public double calcularSalario(int horasExtra) {

        double r;

        r = salario + (horasExtra * 20);

        return r;

    }

    public nIngles getNi() {
        return ni;
    }

    public void setNi(nIngles ni) {
        this.ni = ni;
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
        return "Administrativo{" + "ni=" + ni + '}';
    }
    
    

}



class Programador extends Empleado{

    
    int lineasDeCodigoPorHora=0;
    String lenguajeDominante="";

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

