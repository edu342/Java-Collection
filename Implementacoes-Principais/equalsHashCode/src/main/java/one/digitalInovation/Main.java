package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

       Carro carro1 = new Carro("bmw  ");
       Carro carro2 = new Carro("Audi ");
       Carro carro3 = new Carro("Mercedes ");

        System.out.println(listaCarros.contains(new Carro("Vosvagen")));
        System.out.println(carro1);


    }
}
