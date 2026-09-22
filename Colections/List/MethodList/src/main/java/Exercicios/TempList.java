package Exercicios;

import one.collections.OrdenacaoList;

import java.util.ArrayList;
import java.util.List;

public class TempList {
    List<TempMedia> temp = new ArrayList<>(){{
        add(new TempMedia(30, "Janeiro"));
        add(new TempMedia(15, "Fevereiro"));
        add(new TempMedia(7, "Março"));
        add(new TempMedia(25, "Abril"));
        add(new TempMedia(16, "Maio"));
        add(new TempMedia(21, "Junho"));
    }};

    public void CalcularMedia(){
        double soma = 0.0;
        for (int i = 0; i < temp.size(); i++){
          soma = temp.get(i).getTemperatura() + soma;
        }
        double media = soma / temp.size();
        for (int i = 0; i < temp.size(); i++){
            if(temp.get(i).getTemperatura() > media){
                System.out.println("Mes: " + temp.get(i).getMeses() +
                        "Temperatura: " + temp.get(i).getTemperatura()
                );
            }
        }
    }

    public static void main(String[] args) {
        TempList exercicio = new TempList();
        exercicio.CalcularMedia();
    }


}
