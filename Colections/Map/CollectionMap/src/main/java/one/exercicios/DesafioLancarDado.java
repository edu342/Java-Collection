package one.exercicios;

import java.util.*;

public class DesafioLancarDado {
    static void main(String[] args) {
        List<Integer> jogadas = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            int numeroSorteado = random.nextInt(6) + 1;
            jogadas.add(numeroSorteado);
        }
        Map<Integer, Integer> contagem = new HashMap<>();
        for (Integer jogada : jogadas) {
            contagem.put(jogada, contagem.getOrDefault(jogada, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            System.out.println("Dado: " + entry.getKey() + " caiu: " + entry.getValue() + " vezes");
        }
    }
}
class Dado {

    private int valor;
    private int jogadas;

    public Dado(int valor, int jogadas) {
        this.valor = valor;
        this.jogadas = jogadas;
    }

    public int getValor() {
        return valor;
    }

    public int getJogadas() {
        return jogadas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dado dado = (Dado) o;
        return valor == dado.valor && jogadas == dado.jogadas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, jogadas);
    }

    @Override
    public String toString() {
        return "Dado{" +
                "valor=" + valor +
                ", jogadas=" + jogadas +
                '}';
    }
}
