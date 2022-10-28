package cuentas;

import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta cuenta;

    static Scanner sc = new Scanner(System.in);

    public Cliente(String nombre, String apellido, String dni, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuenta = cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    //retorno el saldo de la cuenta
    public double consultarSaldo(){
        return cuenta.getSaldo();
    }

    //Creamos el metodo para ingresar dinero
    public void ingresarDinero(double cantidad){
        cuenta.depositarDinero(cantidad);
    }

    //Creamos el metodo para retirar dinero
    public void retirarDinero(double cantidad){
        cuenta.retirarDinero(cantidad);
    }
}