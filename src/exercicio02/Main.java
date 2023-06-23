package exercicio02;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        ContaCorrente contaCorrente = new ContaCorrente("Roberto Silva", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Roberta Souza", 5000);
        SeguroDeVida seguroDeVida = new SeguroDeVida("Robson Alves");

        System.out.printf("Tributo de conta corrente com saldo de R$ %s: R$ %s\n", df.format(contaCorrente.getSaldo()), df.format(contaCorrente.calcularTributos()));
        System.out.printf("Tributo de conta poupança com saldo de R$ %s: R$ %s\n", df.format(contaPoupanca.getSaldo()), df.format(contaPoupanca.calcularTributos()));
        System.out.printf("Tributo de seguro de vida: R$ %s\n", df.format(seguroDeVida.calcularTributos()));

    }
}
