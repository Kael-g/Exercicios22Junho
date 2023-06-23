package exercicio04;

public class Mamifero extends Animal{
    private String alimento;
    public Mamifero(String nome, double comprimento, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "\n"+getNome().toUpperCase()+
                "\nComprimento: "+getComprimento()+"cm"+
                "\nNúmero de patas: "+getNumPatas()+
                "\nCor: "+getCor().toLowerCase()+
                "\nAmbiente: "+getAmbiente().toLowerCase()+
                "\nVelocidade: "+getVelocidade()+"m/s"+
                "\nAlimentação: "+alimento;
    }
}
