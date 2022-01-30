package br.dio.com.collections.Map;

import java.util.Hashtable;
import java.util.Map;

public class ExampleHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        // Adiciona todos os estudantes
        estudantes.put("Carlos ", 21);
        estudantes.put("Marina ", 33);
        estudantes.put("Rafaela ", 18);
        estudantes.put("Pedro ", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro ", 55);

        System.out.println(estudantes);

        // Remove um estudante no indice 0
        estudantes.remove("Pedro ");

        System.out.println(estudantes);

        // Recupera um estudante no indice 2
        int idadeEstudante = estudantes.get("Marina ");

        System.out.println(estudantes);

        System.out.println(estudantes.size());

        // Navega em todos os registros do mapa
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println(estudantes);


    }
}
