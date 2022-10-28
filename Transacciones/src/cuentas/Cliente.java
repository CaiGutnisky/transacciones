package cuentas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    static List<Cuenta> cuentas = new ArrayList<Cuenta>();

    static Scanner sc = new Scanner(System.in);

    public Cliente(String nombre, String apellido, String dni, List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = (cuentas);
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
    public double consultarSaldo(int indice){
        return cuentas.get(indice).getSaldo();
    }

    //Creamos el metodo para ingresar dinero
    public void ingresarDinero(int indice,double cantidad){
        cuentas.get(indice).depositarDinero(cantidad);
    }

    //Creamos el metodo para retirar dinero
    public void retirarDinero(int indice,double cantidad){
        cuentas.get(indice). retirarDinero(cantidad);
    }
}