package br.dio.com.collections.optional;

import java.util.Optional;

public class ExampleOptionalEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor Optional que Está Presente ");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não Está Presente "));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor Optional Que Não Está Presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = Não Está Presente "));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor Optional Que Não Está Presente ");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = Não Está Presente "));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor Optional Que Lança Erro NullPointerException ");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = Não Está Presente "));

    }

}
