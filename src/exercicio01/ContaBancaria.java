package exercicio01;

import java.text.DecimalFormat;

abstract class ContaBancaria {
    DecimalFormat df = new DecimalFormat("#,###.00");
    private String nomeCliente;
    private long numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, long numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public long getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$ "+df.format(saldo)+"\n");
        } else {
            System.out.println("Saldo insuficiente\n");
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atual: R$ "+df.format(saldo)+"\n");

    }

    public void mostraDados(){
        System.out.println("Nome do titular: "+nomeCliente+"\nNúmero da conta: "+numConta+"\nSaldo: R$ "+df.format(saldo)+"\n");
    }

}
