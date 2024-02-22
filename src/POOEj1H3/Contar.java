/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H3;

import POOEj1H2.*;
import POOEj1H1.*;

class Contar {
    
    private int contador;

    public Contar() {
    }

    public Contar(int contador) {
        this.contador = contador;
    }

    void incrementar(int incremento){
        
        this.contador=this.contador+incremento;
    }
    
    void decrementar (int decremento){
    
        this.contador=this.contador-decremento;
    }
    
    int suma (Contar cont1){
    
        int s=this.contador+cont1.contador;
        return s;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Contar{" + "contador=" + contador + '}';
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
        final Contar other = (Contar) obj;
        return this.contador == other.contador;
    }
    
    
    
}
