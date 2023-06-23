package exercicio01;

public class Teste {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("Leando Silva",193756395,500,10);
        ContaEspecial especial = new ContaEspecial("Roberta Silva", 985274,200,300);

        poupanca.mostraDados();
        especial.mostraDados();

        poupanca.sacar(600);
        poupanca.sacar(100);

        especial.sacar(1000);
        especial.sacar(300);

        poupanca.depositar(200);

        especial.depositar(500);

        poupanca.calcularNovoSaldo(0.2);

        poupanca.mostraDados();
        especial.mostraDados();
    }
}
