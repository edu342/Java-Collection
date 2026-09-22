package one.exemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

       /* System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream()
                .forEach(System.out::println);
       numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de String em lista de numeros inteiros: ");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque na lista: ");
       List<Integer> ListParesMaiores2 =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i %2 == 0 && i >2) {
                            return true;
                        }
                        return false;
                    }
                }).collect(Collectors.toList());
       System.out.println(ListParesMaiores2);


        System.out.println("Mostre a media dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt( Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        */
        System.out.println("remova os numeros impares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf( integer -> (integer %2 !=0));
        System.out.println(numerosAleatoriosInteger);

    }
}
