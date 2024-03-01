package POOEj1H5;

import java.util.Scanner;

public class TestSIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Sim sim1 = new Sim(tec.nextLine(), tec.nextLine());

        System.out.println(sim1.encender(tec.nextLine()));
        

        System.out.println(sim1.encender(tec.nextLine()));
        
        System.out.println(sim1.encender(tec.nextLine()));
        
        System.out.println("Estado de la SIM:" + sim1.getEstado());

        if (sim1.encender(tec.nextLine())) {

            System.out.println("Se ha encendido");
        } else {
            System.out.println("No se ha encendido");
        }

        System.out.println("Estado de la SIM:" + sim1.getEstado());

        sim1.desbloquear(tec.nextLine());

        sim1.apagar();

        System.out.println("Estado de la SIM:" + sim1.getEstado());

        System.out.println("aquiu");
        
        sim1.desbloquear(tec.nextLine());

        System.out.println("Estado de la SIM:" + sim1.getEstado());

        sim1.apagar();

        System.out.println("Estado de la SIM:" + sim1.getEstado());

    }

}
