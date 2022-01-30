package br.dio.com.collections.Set;

import java.util.*;

public class ExampleList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        nomes.remove(4);
        System.out.println(nomes);
        int posicao = nomes.indexOf("Carlos");
        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nomes);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        for (String nomeDoItem: nomes){
            System.out.println("-->"+ nomes);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);




    }

}
