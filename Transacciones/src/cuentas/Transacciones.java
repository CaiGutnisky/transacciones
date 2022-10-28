package cuentas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transacciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre,apellido,dni;
        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        cuentas.Cliente cliente;
        int numeroCuenta,opcion,indiceNumeroCuenta;
        double saldo,cantidadDinero;

        //Pedimos los datos del cliente
        System.out.print("Digite el nombre del cliente : ");
        nombre = teclado.next();

        System.out.print("Digite el apellido del cliente : ");
        apellido = teclado.next();

        System.out.print("Digite el dni del cliente : ");
        dni = teclado.next();

            System.out.print("Digite el numero de cuenta : ");
            numeroCuenta = teclado.nextInt();

            System.out.print("Digite el saldo de la cuenta : ");
            saldo = teclado.nextDouble();
            System.out.println("");

        Cuenta cuenta = (Cuenta) new Cuenta(numeroCuenta, saldo);
            cliente = (Cliente) new Cliente(nombre, apellido, dni, cuentas );
            

        do{
            System.out.println("\n\tMENU");
            System.out.println("1 . Ingresar saldo a la cuenta");
            System.out.println("2 . Retirar saldo de la cuenta");
            System.out.println("3 . Consultar saldo de la cuenta");
            System.out.println("4 . Salir");
            System.out.print("Digite una opcion : ");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscar(cuentas, numeroCuenta);

                    if(indiceNumeroCuenta == -1){
                        System.out.println("\nCuenta no encontrado , verifique su número de cuenta");
                        System.out.println("");
                    }else{
                        System.out.print("Digite la cantidad de dinero a depositar : ");
                        cantidadDinero = teclado.nextDouble();

                        cliente.ingresarDinero(indiceNumeroCuenta, cantidadDinero);
                        System.out.println("\nDeposito con exito ");
                        System.out.print("Saldo disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
                        System.out.println("");
                    }

                    break;

                case 2:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscar(cuentas, numeroCuenta);

                    if(indiceNumeroCuenta == -1){
                        System.out.println("\nNo existe una cuenta con ese número");
                        System.out.println("");
                    }
                    else{
                        System.out.print("\nDigite la cantidad de dinero a retirar : ");
                        cantidadDinero = teclado.nextDouble();

                        if(cliente.consultarSaldo(indiceNumeroCuenta) < cantidadDinero){
                            System.out.print("Saldo insuficiente");
                            System.out.println("");
                        }else{
                            cliente.retirarDinero(indiceNumeroCuenta, cantidadDinero);
                            System.out.println("");
                            System.out.println("Retiro con exito");
                            System.out.println("Saldo disponible de la cuenta : " + cliente.consultarSaldo(indiceNumeroCuenta));
                            System.out.println("");
                        }
                    }

                    break;

                case 3:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscar(cuentas, numeroCuenta);

                    if(indiceNumeroCuenta == -1){
                        System.out.println("\nNo existe una cuenta con ese número");
                        System.out.println("");
                    }else{
                        System.out.println("Saldo disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por elegirnos");
                    opcion = 4;
                    break;

                default:
                    System.out.println("\nOpcion no disponible , vuelva a digitar");
                    break;
            }
        }while(opcion != 4);
    }

    private static int buscar(List<Cuenta> cuentas, int numeroCuenta) {
        return numeroCuenta;
    }
}
