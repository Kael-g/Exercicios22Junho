package exercicio01;

import java.text.DecimalFormat;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, long numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        if (valor <= getSaldo()+limite){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque realizado. Limite atual: R$ "+df.format(getSaldo())+"\n");
        } else {
            System.out.println("Limite insuficiente\n");
        }
    }
}
