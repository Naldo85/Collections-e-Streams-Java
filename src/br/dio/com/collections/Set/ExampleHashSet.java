package br.dio.com.collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {

    Set<Double> notaAlunos = new HashSet<>();

    // Adiciona as notas no Set
    notaAlunos.add(5.8);
    notaAlunos.add(9.3);
    notaAlunos.add(6.7);
    notaAlunos.add(10.0);
    notaAlunos.add(6.0);
    notaAlunos.add(7.0);
    notaAlunos.add(8.0);
    notaAlunos.add(9.0);

    System.out.println(notaAlunos);

    // Remove a nota do Set
    notaAlunos.remove(5.8);

    System.out.println(notaAlunos);

    // Remove a quantidader de itens do Set
     System.out.println(notaAlunos.size());

     // Navega em todos os itens do iterator
     Iterator<Double> iterator = notaAlunos.iterator();

     while (iterator.hasNext()){
         System.out.println(iterator.next());
     }

     for (Double nota: notaAlunos){
         System.out.println(nota);
     }

     notaAlunos.clear();

     // Retorna se o Set está vazio ouy não!
     System.out.println(notaAlunos.isEmpty());

    }

}
