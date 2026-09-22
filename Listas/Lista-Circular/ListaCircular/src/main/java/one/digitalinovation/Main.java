package one.digitalinovation;

public class Main {
    static void main(String[] args) {
      ListaCircular<String> minhaListaCircular = new ListaCircular<>();

      minhaListaCircular.add("c0");
      System.out.println(minhaListaCircular);

        minhaListaCircular.remove(1);

        minhaListaCircular.add("C1");
        minhaListaCircular.add("C2");
        minhaListaCircular.add("C3");
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));

    }
}
