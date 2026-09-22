package one.exemplo;


import java.util.*;

public class ExemploMap {
    static void main(String[] args) {
       System.out.println("Crie um dicionario que relacione os modelos com o consumo");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 12.4);
            put("Palio", 15.4);
            put("Chevette", 9.7);
            put("Parati", 8.4);
            put("Corrola", 13.4);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substituir o consumo do Gol: ");
        carrosPopulares.put("Gol", 14.2);
        System.out.println(carrosPopulares);

        System.out.println("Confirir se o modelo tucson esta no dicionario: " +
                carrosPopulares.containsKey("tucson"));
        System.out.println("Exibir o consumo do Palio: " + carrosPopulares.get("Palio"));
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo com o menor consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
          if(entry.getValue().equals(consumoMaisEficiente)){
              modeloMaisEficiente = entry.getKey();
              System.out.println(" Modelo mais eficiente : " + modeloMaisEficiente + "-" + consumoMaisEficiente);
          }
        }
        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(" Modelo mais eficiente : " + modeloMenosEficiente+ "-" + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(" Soma dos consumos : " + soma);

        System.out.println("Exiba os carros na Ordem que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("Gol", 12.4);
            put("Palio", 15.4);
            put("Chevette", 9.7);
            put("Parati", 8.4);
            put("Corrola", 13.4);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado por modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carro");
        carrosPopulares.clear();
    }
}
