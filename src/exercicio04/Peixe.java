package exercicio04;

public class Peixe extends Animal{
    private String caracteristicas = "barbatana e cauda";

    public Peixe(String nome, String cor, double comprimento, String ambiente, double velocidade) {
        super(nome, cor, comprimento, 0, ambiente, velocidade);
    }
    public Peixe(String nome, double comprimento, String ambiente, double velocidade) {
        super(nome, "cinzenta", comprimento, 0, ambiente, velocidade);
    }
    public Peixe(String nome, String cor, double comprimento, double velocidade) {
        super(nome, cor, comprimento, 0, "mar", velocidade);
    }
    public Peixe(String nome, double comprimento, double velocidade) {
        super(nome, "cinzenta", comprimento, 0, "mar", velocidade);
    }

    @Override
    public String toString() {
        return "\n"+getNome().toUpperCase()+
                "\nComprimento: "+getComprimento()+"cm"+
                "\nNúmero de patas: "+getNumPatas()+
                "\nCor: "+getCor().toLowerCase()+
                "\nAmbiente: "+getAmbiente().toLowerCase()+
                "\nVelocidade: "+getVelocidade()+"m/s"+
                "\nCaracterísticas: "+caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
