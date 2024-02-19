/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOEj1H1;

import java.util.Scanner;

public class CuentaCorrienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        
        CuentaCorriente ccc1 = new CuentaCorriente();
        CuentaCorriente ccc2 = new CuentaCorriente("ES182844328901234586891", 2, 3000);

        System.out.println("0. Crear cuenta\n"
                + "1. Ingresar en la CCC\n"
                + "2. Reintegro en la CCC\n"
                + "3. Transferencia en la CCC\n"
                + "4. Consultar saldos\n"
                + "5. Salir");

        int op = tec.nextInt();
        tec.nextLine();

        while (op != 5) {
            switch (op) {
                case 0:
                    ccc1.setNumeroCuenta(tec.nextLine());
                    ccc1.setTipoInteres(tec.nextDouble());
                    ccc1.setSaldo(tec.nextDouble());
                    break;

                case 1:
                    ccc1.ingresoccc(tec.nextDouble());
                    break;
                case 2:
                    
                    ccc1.reintegroCcc(tec.nextDouble());
                    break;
                case 3:
                    ccc2.transferenciaCCC(tec.nextDouble(), ccc2);
                    break;
                case 4:

                    System.out.print(ccc1.toString()+"\n");
                    System.out.print(ccc2.toString()+"\n");

                    break;
                case 5:

                    break;

                default:
                    throw new AssertionError();
            }

            System.out.println("0. Crear cuenta\n"
                    + "1. Ingresar en la CCC\n"
                    + "2. Reintegro en la CCC\n"
                    + "3. Transferencia en la CCC\n"
                    + "4. Consultar saldos\n"
                    + "5. Salir");

            op = tec.nextInt();
        }
    }

}
