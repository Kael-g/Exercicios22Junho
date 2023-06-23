package exercicio01;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, long numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento){
        setSaldo(getSaldo()+getSaldo()*(taxaRendimento/100)*diaRendimento);
    }


}
