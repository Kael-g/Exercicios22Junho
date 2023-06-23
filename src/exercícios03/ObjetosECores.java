package exercícios03;

import java.util.HashMap;

public class ObjetosECores {
    private HashMap<String,String> objetosECores;

    public ObjetosECores() {
        objetosECores = new HashMap<>();
    }

    public void addObject(String objeto, String cor){
        objetosECores.put(objeto,cor);
    }

    public void showObjects(){
        for (String objeto : objetosECores.keySet()){
            System.out.println(objeto+" : "+objetosECores.get(objeto));
        }
    }

}
