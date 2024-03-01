package POOEj1H5;

import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Persona p1 = new Persona(tec.nextLine(), tec.nextLine(), tec.nextLine(), tec.nextLine());

        Persona p2 = new Persona(tec.nextLine(), tec.nextLine(), tec.nextLine(), tec.nextLine());

        System.out.print("Datos: ");
        System.out.println(p1.toString());

        p1.setMadre(p2);

        System.out.println("Madre: " + p2.getNombre() + " " + p2.apellido1 + " " + p2.apellido2);
        System.out.println(p1.toString());

    }

}
