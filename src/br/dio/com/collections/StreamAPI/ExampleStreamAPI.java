package br.dio.com.collections.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ExampleStreamAPI {
    public static void main(String[] args) {

        // Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona 7 estudantes para a coleção
        estudantes.add("Pedro ");
        estudantes.add("Tayse ");
        estudantes.add("Marcelo ");
        estudantes.add("Carla ");
        estudantes.add("Juliana ");
        estudantes.add("Thiago ");
        estudantes.add("Rafael ");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com maior numero de letras
        System.out.println("Maior Numero de Letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor numero de letras
        System.out.println("Menor Numero de Letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        System.out.println("Com a Letra R no Nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("R ")).collect(Collectors.toList()));

        // Retorna uma coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna Uma Nova Coleção Com a Quantidade de Letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 Primeiros Elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os Elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os Elementos Novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Tem Algum Elemento com W no Nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elementos possuem a letra A maiuscula no nome
        System.out.println("Tem Algum Elemento Com a Letra a Maiuscula no Nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna true se nenhum elemento possuem a letra a minuscula no nome
        System.out.println("Tem Algum Elemento Com a Letra a Minuscula no Nome? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.print("Retorna o Primeiro Elemento da Coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.print("Operação Encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
        //            .collect(Collectors.joining(", ")));
        //            .collect(Collectors.toSet()));
        //            .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") +1)));

       }
    }

