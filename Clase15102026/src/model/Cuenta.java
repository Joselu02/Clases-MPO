package model;

public class Cuenta {

    private String nombreCliente,numeroCuenta;
    private double tipoInteres;
    private double saldo;


    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta() {}


    //getters
    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }

    public double getSaldo(){
        return saldo;
    }

    //setters
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }

}
