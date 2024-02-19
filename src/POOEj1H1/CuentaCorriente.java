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

        this.saldo = (this.saldo + importe)*(tipoInteres/100+1);

    }

    void reintegroCcc(double importe) {

        if (this.saldo - importe >= 0) {

            this.saldo = this.saldo - importe;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void transferenciaCCC(double cantidad, CuentaCorriente c1) {

        c1.ingresoccc(cantidad);
        this.saldo=this.saldo-cantidad;

    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public CuentaCorriente(String numeroCuenta, double tipoInteres, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cn) {

        cn.nombre = this.nombre;
        cn.numeroCuenta = this.numeroCuenta;
        cn.saldo = this.saldo;
        cn.tipoInteres = this.tipoInteres;
    }

    @Override
    public String toString() {
        return numeroCuenta + " " + saldo;
    }

    
    
    
}
