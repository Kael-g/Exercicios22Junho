package exercicio02;

public class ContaCorrente extends Contas implements Tributos{
    public ContaCorrente(String nomeTitular, double saldo) {
        super(nomeTitular, saldo);
    }

    public ContaCorrente(String nomeTitular) {
        super(nomeTitular);
    }

    @Override
    public double calcularTributos() {
        return getSaldo()*0.01;
    }
}
