package one.collections;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MethodList {
    static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();

        notas.add(10.0);
        notas.add(7.8);
        notas.add(8.5);
        notas.add(7.9);
        notas.add(8.0);
        notas.add(9.5);
        System.out.println(notas.toString());

        System.out.println("exiba Posicao 3: " + notas.indexOf(3d));

        System.out.println("adiciona a nota na posicao selecionada: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibe a soma: " + soma);

        System.out.println("apaga tudo da lista");
        notas.clear();
        System.out.println(notas);


    }
}
