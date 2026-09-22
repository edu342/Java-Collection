package one.digitalInovation;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Aston Martin"));
        hashSetCarros.add(new Carro("Ferrari"));
        hashSetCarros.add(new Carro("Lamborghini"));
        hashSetCarros.add(new Carro("Alfa Romeu"));
        hashSetCarros.add(new Carro("Chevrolet"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Aston Martin"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Lamborghini"));
        treeSetCarros.add(new Carro("Alfa Romeu"));
        treeSetCarros.add(new Carro("Chevrolet"));

        System.out.println("Lista por ordem alfabetica: " + treeSetCarros);


    }
}