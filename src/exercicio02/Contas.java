package exercicio02;

abstract class Contas implements Tributos {
    private String nomeTitular;
    private double saldo;

    public Contas(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public Contas(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
