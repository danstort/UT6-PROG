/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H5;

class Sim {

    private String pin;
    private String puk;

    //los atributos enumerados se forman como una clase "Estado"
    private enum Estado {
        bloqueada, activa, apagada
    }
//creo el obejeto estado de la clase Estado
    Estado estado = Estado.apagada;

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

    public Estado getEstado() {
        return estado;
    }

    int numIntentos = 1;
    //creamos metodo booleano encender.

    public boolean encender(String pin) {
        //creamos un booleano intermedio en el que alamcenamos el 
//valor del condicional.    
        boolean r = false;

        if (numIntentos < 3) {
            if (this.pin.equals(pin) && estado == Estado.apagada) {
                estado = Estado.activa;
                this.numIntentos = 0;
                r = true;

            } else {
                numIntentos++;

            }
        } else if (numIntentos == 3) {
            estado = Estado.bloqueada;
        }

        return r;

    }

    public boolean desbloquear(String puk) {
        boolean desbloquear = false;

        if (this.puk.equals(puk) && this.estado == Estado.bloqueada) {
            this.estado = Estado.activa;
            desbloquear=true;
        }
        return desbloquear;
    }

    public void apagar() {
        if (this.estado == Estado.activa) {
            estado = Estado.apagada;
        }
    }

    public int getNumIntentos() {
        return numIntentos;
    }

}
