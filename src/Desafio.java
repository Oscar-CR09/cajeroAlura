import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre ="Diana Llanos";
        String tipoDeCuenta = "Corriente";
        double saldo = 2599.99;

        System.out.println("*******************************************");
        System.out.println("\nNombre del Cliente: " + nombre );
        System.out.println("\nEl tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n*******************************************");

        String menu = """
                *** Escribe el numero de la opcion deseda ***
                1- Consultar saldo
                2- Retirar 
                3- Depositar
                9- Salir
                
                """;
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Saldo actualizado es: " + saldo + "$");
                    break;

                case 2:
                    System.out.println("¿Cual es el valor de retirar? ");
                    double valorRetirar = teclado.nextDouble();
                    if (valorRetirar > saldo){
                        System.out.println("Saldo insuficiente ");
                    }else {
                        saldo = saldo - valorRetirar;

                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor a depositar ? ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;

                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa gracias por utilizar nuestro servicio");

                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }

    }

}
