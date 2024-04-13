package AT012;

import java.util.Scanner;

public class CaixaEletronico {
    private double saldo;
    private double valorSolicitado;
    private double valorDeposito;

    public CaixaEletronico() {
        this.saldo = 0.0;
        this.valorSolicitado = 0.0;
        this.valorDeposito = 0.0;
    }

    public void depositar(double valor) {
        this.valorDeposito = valor;
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        this.valorSolicitado = valor;
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo inicial: R$" + caixa.getSaldo());

        caixa.depositar(500.0);
        System.out.println("Novo saldo após depósito: R$" + caixa.getSaldo());

        System.out.print("Digite o valor para saque: R$");
        double valorSaque = scanner.nextDouble();
        caixa.sacar(valorSaque);
        System.out.println("Novo saldo após saque: R$" + caixa.getSaldo());

    }
}
