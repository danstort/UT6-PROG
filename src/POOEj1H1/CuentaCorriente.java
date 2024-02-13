/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H1;

/**
 *
 * @author danielsotoortiz
 */
public class CuentaCorriente {

    String nombre;
    String numeroCuenta;
    double tipoInteres;
    double saldo;

    void ingresoccc(double importe) {

        this.saldo = this.saldo + importe + (tipoInteres * saldo);

    }

    void reintegroCcc(double importe) {

        if (this.saldo - importe >= 0) {

            this.saldo = this.saldo - importe;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

// void transferenciaCCC(double cantidad, CuentaCorriente c1)
//
//Incluye en la clase un constructor por defecto, un constructor con todos los  parámetros, y con tres parametros (numero de cuenta, tipo de interés y saldo) , y los métodos getters y setters. También añade método constructor que permita hacer una copia de los datos de la CuentaCorriente. (Constructor copia)
//    

}
