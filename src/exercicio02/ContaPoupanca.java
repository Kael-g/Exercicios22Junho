package exercicio02;

public class ContaPoupanca extends Contas implements Tributos {

    public ContaPoupanca(String nomeTitular, double saldo) {
        super(nomeTitular, saldo);
    }

    public ContaPoupanca(String nomeTitular) {
        super(nomeTitular);
    }

    @Override
    public double calcularTributos() {
        return 0;
    }
}
