package exercícios03;

public class Main {
    public static void main(String[] args) {
        ObjetosECores dicionario = new ObjetosECores();

        dicionario.addObject("bola","azul");
        dicionario.addObject("boneca","amarela");
        dicionario.addObject("dado","rosa");

        dicionario.showObjects();
    }
}
