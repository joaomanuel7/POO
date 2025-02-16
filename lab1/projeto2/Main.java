package lab1.projeto2;

class ContaBancaria {

    private final String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, ContaBancaria destino) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Transferência falhou: saldo insuficiente!");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": R$" + saldo);
    }
}

public class Main {

    public static void main(String[] args) {
        ContaBancaria contaMaria = new ContaBancaria("Maria");
        ContaBancaria contaJoao = new ContaBancaria("João");

        contaMaria.depositar(100);
        contaMaria.sacar(30);

        contaMaria.transferir(20, contaJoao);

        contaMaria.mostrarSaldo();
        contaJoao.mostrarSaldo();
    }
}
