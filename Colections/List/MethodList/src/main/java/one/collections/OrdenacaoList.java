package one.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList implements Comparable<OrdenacaoList> {
    private String nome;
    private Integer idade;
    private String cor;

    public OrdenacaoList(String nome, Integer idade, String cor) {
        this.cor = cor;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }
    public String getCor() { return cor; }

    @Override
    public String toString() {
        return "OrdenacaoList{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(OrdenacaoList o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }

    public static void main(String[] args) {
        List<OrdenacaoList> pessoa1 = new ArrayList<>(){{
            add(new OrdenacaoList("Bruno", 19, "preto"));
            add(new OrdenacaoList("Carla", 39, "Rosa"));
            add(new OrdenacaoList("Pedro", 11, "branco"));
        }};

        System.out.println("---\tOrdem de Insercao\t---");
        System.out.println(pessoa1);

        System.out.println("---\tOrdem Aleatoria\t---");
        Collections.shuffle(pessoa1);
        System.out.println(pessoa1);

        System.out.println("---\tOrdem natural (Nome)\t---");
        Collections.sort(pessoa1);
        System.out.println(pessoa1);

        System.out.println("---\tOrdem por Idade\t---");
        Collections.sort(pessoa1, new ComparetorIdade());
        System.out.println(pessoa1);

        System.out.println("---\tOrdem por Cor\t---");
        Collections.sort(pessoa1, new ComparetorCor());
        System.out.println(pessoa1);
    }
}

class ComparetorIdade implements Comparator<OrdenacaoList> {
    @Override
    public int compare(OrdenacaoList p1, OrdenacaoList p2) {
        return Integer.compare(p1.getIdade(), p2.getIdade());
    }
}

class ComparetorCor implements Comparator<OrdenacaoList> {
    @Override
    public int compare(OrdenacaoList p1, OrdenacaoList p2) {
        return p1.getCor().compareToIgnoreCase(p2.getCor());
    }
}