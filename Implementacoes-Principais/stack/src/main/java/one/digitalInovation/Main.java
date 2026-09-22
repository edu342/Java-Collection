package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Bmw"));
        stackCarros.push(new Carro("Mercedes"));
        stackCarros.push(new Carro("Audi"));

        System.out.println("pilha inicial: " + stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println("elemento removido: " +stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println("pilha apos Peek: " + stackCarros);


    }
}
