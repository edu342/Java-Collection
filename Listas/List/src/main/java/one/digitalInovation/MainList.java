package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    static void main(String[] args) {

        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("BMW"));
        listaCarro.add(new Carro("Audi"));
        System.out.println(listaCarro);

        System.out.println("Carro do indice requirido: " + listaCarro.get(2));

        System.out.println(listaCarro.get(2));
    }
}
