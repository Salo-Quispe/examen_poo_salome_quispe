import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class prueba {

        public static void main (String args []) {
                Scanner sc = new Scanner(System.in);
                boolean terminar = false;
                int op, cuenta, CI;
                double cant;
                String nombre, apellido;
                final int MAX = 3;
                registro banco[] = new registro[MAX];

                while (terminar) {
                        System.out.println("Banco XXXXX");
                        System.out.println("1.- Retiros");
                        System.out.println("2.- Depositos");
                        System.out.println("3.- Finalizar");

                        try {
                                System.out.print("Elija una opción: ");
                                op = sc.nextInt();
                                switch (op) {
                                        case 1:
                                                System.out.println("**|RETIROS|**");

                                                System.out.println("Ingrese su nombre: ");
                                                nombre= sc.next();
                                                System.out.println("Ingrese su apellido: ");
                                                apellido= sc.next();
                                                System.out.println("Ingrese su número de cedula: ");
                                                CI= sc.nextInt();
                                                System.out.println("¿Qué cantidad de dinero desea retirar?");
                                                cant = sc.nextDouble();
                                                break;
                                        case 2:
                                                System.out.println("**|DEPOSITOS|**");
                                                System.out.println("Ingrese su nombre: ");
                                                nombre= sc.next();
                                                System.out.println("Ingrese su apellido: ");
                                                apellido= sc.next();
                                                System.out.println("Ingrese su número de cedula: ");
                                                CI= sc.nextInt();
                                                System.out.println("¿Qué cantidad de dinero desea depositar?");
                                                cant = sc.nextDouble();
                                                System.out.println("Numero de cuenta a la que desea realizar el deposito");
                                                cuenta = sc.nextInt();
                                                break;
                                        case 3:
                                                terminar = true;
                                                System.out.println("Fue un placer ser de ayuda :)");
                                                break;
                                }
                        } catch (InputMismatchException e){
                                System.out.println("Opción invalida, por favor intentelo de nuevo");
                                sc.next();
                        }
                }
        }
}
