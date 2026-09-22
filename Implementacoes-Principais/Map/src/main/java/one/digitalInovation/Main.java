package one.digitalInovation;
import java.util.*;

public class Main {

 static void main(String[] args) {

   Map<String, String> aluno = new HashMap<>();

   aluno.put("Nome: ", "BRENO");
   aluno.put("Idade: ", "18");
   aluno.put("Media:", "8.5");
   aluno.put("Turma:", "2A");

   System.out.println(aluno);

     System.out.println(aluno.keySet());
     System.out.println(aluno.values());

   List<Map<String, String>> listaAlunos  = new ArrayList<>();

   listaAlunos.add(aluno);

     Map<String, String> aluno2 = new HashMap<>();

     aluno.put("Nome: ", "Carlos");
     aluno.put("Idade: ", "12");
     aluno.put("Media:", "8.0");
     aluno.put("Turma:", "1A");

     listaAlunos.add(aluno2);

     System.out.println(listaAlunos);
     

 }
}