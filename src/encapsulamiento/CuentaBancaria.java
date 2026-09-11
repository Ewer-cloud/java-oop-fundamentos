package encapsulamiento;

public class CuentaBancaria {
    //atributos
    private String titular;
    private double saldo;

    //constructor
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos
    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito realizado con exito!");
        } else {
            System.out.println("Monto invalido");
        }
    }

    public void retirar(double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Transacion realizada con exito");
        }else {
            System.out.println("Fondos insuficientes");
        }
    }

    //getters

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria("Pepe", 676767676);
        c1.depositar(3434343434343434.34);
        c1.retirar(-500.0);
        System.out.println("saldo final: " + c1.getSaldo());
    }
}
