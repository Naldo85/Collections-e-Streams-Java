package br.dio.com.collections.Set;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os numeros no Set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        // Remove o numero do Set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        // Retorna a quantidade de itnes do Set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }

        // Retorna se o Set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());





    }
}
