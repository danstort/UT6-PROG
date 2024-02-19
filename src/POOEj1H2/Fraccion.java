/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H2;

import POOEj1H1.*;

/**
 *
 * @author danielsotoortiz
 */
class Fraccion {

    private int numerador;

    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion suma(Fraccion f) {

        int numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        int denominador = this.denominador * f.denominador;
        Fraccion s = new Fraccion(numerador, denominador);
        return s;
        
    }

    public Fraccion resta(Fraccion f) {

        int numerador = (this.denominador * f.numerador)-(this.numerador * f.denominador);
        int denominador = this.denominador*f.denominador;
        Fraccion sr = new Fraccion(numerador, denominador);
        return sr;

    }

    public Fraccion multiplicacion(Fraccion f1) {

        int numerador = f1.numerador * this.getNumerador();
        int denominador = f1.denominador * this.getDenominador();
        Fraccion sm = new Fraccion(numerador, denominador);
        return sm;
        
    }

    public Fraccion division(Fraccion f1) {

        int numerador = f1.numerador * this.denominador;
        int denominador = f1.denominador * this.numerador;
        Fraccion sd = new Fraccion(numerador, denominador);
        return sd;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
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
        final Fraccion other = (Fraccion) obj;
        if (this.numerador != other.numerador) {
            return false;
        }
        return this.denominador == other.denominador;
    }
    
    

}   
