package digitalinovation;

public class Main {
    public static void main(String[] args) {
        
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("PRIMEIRO");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("TERCEIRO");
        minhaFila.enqueue("QUARTO");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("ULTIMO");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
    }
}