package exercicio02;

public class SeguroDeVida implements Tributos{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SeguroDeVida(String nome) {
        this.nome = nome;
    }

    @Override
    public double calcularTributos() {
        return 42;
    }
}
