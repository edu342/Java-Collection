package one.exercicios;
import java.util.*;

public class ExerciciosMap {
    static void main(String[] args) {
        System.out.println("--\tCriar Dicionario que relaciona os estados e suas populacoes\t--");
        Map<String, Double> estadosPopulacoes = new HashMap<>();
        estadosPopulacoes.put("PE", 9.616);
        estadosPopulacoes.put("AL", 3.351);
        estadosPopulacoes.put("CE", 9.187);
        estadosPopulacoes.put("RN", 3.541);

        System.out.println(estadosPopulacoes);

        estadosPopulacoes.put("RN", 3.534);
        System.out.println(estadosPopulacoes);

        System.out.println("--\tVerificar se PB esta no dicionario e Imprimir\t--");
        if (!estadosPopulacoes.containsKey("PB")) {
            estadosPopulacoes.put("PB", 4.039);
        }
        System.out.println(estadosPopulacoes);

        System.out.println("--\tExibir estados e populacao na ordem que foram informados\t--");
        Map<String, Double> estadosPopulacoes2 = new LinkedHashMap<>();
        estadosPopulacoes2.put("PE", 9.616);
        estadosPopulacoes2.put("AL", 3.351);
        estadosPopulacoes2.put("CE", 9.187);
        estadosPopulacoes2.put("RN", 3.541);

        System.out.println(estadosPopulacoes2);

        System.out.println("--\tOrdem alfabetica \t--");
        Map<String, Double> estadosPopulacoes3 = new TreeMap<>(estadosPopulacoes2);
        for(Map.Entry<String, Double> ordAlf : estadosPopulacoes3.entrySet()){
            System.out.println(ordAlf.getKey() + "-" + ordAlf.getValue());
        }
    }

    class EstadosPopulacoes {

        private String estado;
        private Integer populacao;

        public EstadosPopulacoes(String estado, Integer populacao) {
            this.estado = estado;
            this.populacao = populacao;
        }

        public String getEstado() {
            return estado;
        }

        public Integer getPopulacao() {
            return populacao;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            EstadosPopulacoes that = (EstadosPopulacoes) o;
            return Objects.equals(estado, that.estado) && Objects.equals(populacao, that.populacao);
        }

        @Override
        public int hashCode() {
            return Objects.hash(estado, populacao);
        }

        @Override
        public String toString() {
            return "EstadosPopulacoes{" +
                    "estado='" + estado + '\'' +
                    ", populacao=" + populacao +
                    '}';
        }
    }
}
