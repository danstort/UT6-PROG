package POOEj1H6;

import java.util.Scanner;

public class Persona {

    Scanner tec = new Scanner(System.in);
    int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona() {

    }

    public String lee() {

        String t = tec.nextLine();
        return t;
    }

    public int divide(int a, int b){

        return a/b;
    }


}
