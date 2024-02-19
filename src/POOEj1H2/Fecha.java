/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H2;

import POOEj1H1.*;


class Fecha {

    private int dia;
    private int mes;
    private int anno;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean fechaCorrecta() {

        boolean fc = false;

        switch (this.mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (0 > dia | dia < 32) {
                    fc = true;

                } else {

                    fc = false;
                }

                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (0 > dia | dia < 31) {
                    fc = true;

                } else {

                    fc = false;
                }

                break;
            case 2:
                if (0 > dia | dia < 29) {
                    fc = true;

                } else {

                    fc = false;
                }

                break;
        }

        return fc;
    }

    public void diaSiguiente() {
        switch (this.mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:

                if (0 > dia || dia < 31) {
                    dia++;

                } else {
                    dia = 1;
                    mes++;

                }

                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 0 | dia < 3) {
                    dia++;

                } else {

                    dia = 1;
                    mes++;
                }

                break;
            case 2:
                if (0 > dia | dia < 28) {
                    dia++;
                } else {

                    dia = 1;
                    mes++;
                }

                break;
            case 12:
                if (0 > dia | dia < 31) {
                    dia++;

                } else {
                    dia = 1;
                    mes=1;
                    anno++;

                }
        }
        
        
    }

    @Override
    public String toString() {
        return "f día siguiente "+dia + " de " + mes + " de " + anno;
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
        final Fecha other = (Fecha) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return this.anno == other.anno;
    }

    
}
