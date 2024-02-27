/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H5;

public class Sim {

    private String pin;
    private String puk;

    //los atributos enumerados se forman como una clase "Estado"
    private enum Estado {
        bloqueada, activa, apagada
    }
//creo el obejeto estado de la clase Estado
    Estado estado;

    public Sim() {
    }

    public Sim(String pin, String puk) {
        this.pin = pin;
        this.puk = puk;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPuk() {
        return puk;
    }

    public void setPuk(String puk) {
        this.puk = puk;
    }

    int numIntentos = 0;
    //creamos metodo booleano encender.

    public boolean encender(String pin) {
        //creamos un booleano intermedio en el que alamcenamos el 
//valor del condicional.    
        boolean r = false;

        if (this.pin == pin && estado == estado.apagada) {
            estado = estado.activa;
            numIntentos = 0;
            r = true;

        } else if (this.pin != pin && estado == estado.apagada) {
            numIntentos = numIntentos++;

        } else if (numIntentos == 3) {
            estado = estado.bloqueada;
        }

        return r;

    }

    public boolean desbloquear(String puk) {
        boolean desbloquear = false;

        if (this.puk == puk && this.estado == estado.bloqueada) {
            this.estado = estado.activa;
        }
        return desbloquear;
    }

    public void apagar() {
        if (this.estado == estado.activa) {
            estado = estado.apagada;
        }
    }
}
