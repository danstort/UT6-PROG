package POOEj1H4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EEdadNoValida {

        Scanner tec = new Scanner(System.in);

        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");

        char a = tec.nextLine().charAt(0);
        System.out.println("Introduce nombre administrativo");

        String b = tec.nextLine();

        System.out.println("¿Está casad@? s/n");

        char c = tec.nextLine().charAt(0);
        Boolean d = true;

        if (c == 's') {

            d = true;

        } else {

            d = false;

        }
        nIngles e = nIngles.Alto;

        if (a == 'a') {
            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");

            char ee = tec.nextLine().charAt(0);

            if (ee == 'a') {

                e = e.Alto;

            } else if (ee == 'm') {

                e = e.medio;
            } else if (ee == 'b') {

                e = e.bajo;
            }
        }
        int lincod = 0;
        if (a == 'p') {

            System.out.println("Lineas de código por hora");
            lincod = tec.nextInt();
        }

        System.out.println("Introduzca su edad");
        int ed = tec.nextInt();

        switch (a) {
            case 'a':
                
                try {
                    
                Administrativo a1 = new Administrativo(e, b, ed, d);
                
            } catch (EEdadNoValida ex) {
                    System.out.println("No se puede dar de alta. Edad inferior a 18 años");
            }

            break;

            case 'p':

                try {
                    
                Programador p1 = new Programador(lincod, b, ed, d);
                
            } catch (EEdadNoValida ex) {
                    System.out.println("No se puede dar de alta. Edad inferior a 18 años");
            }
                
                break;


            default:
                System.out.println("Introduzca un valor válido");
        }

    }

}
