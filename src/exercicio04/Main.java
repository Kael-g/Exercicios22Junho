package exercicio04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoologico = new ArrayList<>();
        zoologico.add(new Mamifero("Camelo",315,"caramelo","terra",18,"herbívoro"));
        zoologico.add(new Peixe("Tubarão-branco", "cinzento e branco",370, 16));
        zoologico.add(new Mamifero("Urso do Canadá",210,"pardo","terra",16,"Onívoro"));
        zoologico.add(new Animal("Iguana",37,"verde","terra",10));
        zoologico.add(new Mamifero("Leão",195,"caramelo","terra",22,"carnívoro"));
        zoologico.add(new Mamifero("Mico-leão-dourado",26,"dourado","terra",12,"onívoro"));

        System.out.println("---------- ANIMAIS DO JARDIM ZOOLÓGICO ----------");
        for (Animal a : zoologico){
            System.out.println(a);
        }

    }
}
