/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H4;

/**
 *
 * @author danielsotoortiz
 */
public class Programador {

    String nombre;
    int edad;
    boolean casado;
    double salario = 1000;
    int lineasDeCodigoPorHora;
    String lenguajeDominante;

    public Programador() {
    }

    public Programador(String nombre, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) throws EEdadNoValida{

        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;

        if (edad < 18 | edad > 65) {

            throw new EEdadNoValida("Edad incorrecta");
        }

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
}
