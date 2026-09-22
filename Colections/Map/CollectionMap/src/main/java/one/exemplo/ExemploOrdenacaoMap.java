package one.exemplo;

import java.util.*;

public class ExemploOrdenacaoMap {
    static void main(String[] args) {

        System.out.println("--\tOrdem aleatoria\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Autor Harry Poter", new Livro("Harry Poter", 300));
            put("Autor Eu Robo", new Livro("Eu Robo", 170));
            put("Robert Kyrosaki", new Livro("Pai Rico Pai Pobre", 159));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
          System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Autor Harry Poter", new Livro("Harry Poter", 300));
            put("Autor Eu Robo", new Livro("Eu Robo", 170));
            put("Robert Kyrosaki", new Livro("Pai Rico Pai Pobre", 159));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        System.out.println("--\tOrdem alfabetica autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }

    }
}


class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
