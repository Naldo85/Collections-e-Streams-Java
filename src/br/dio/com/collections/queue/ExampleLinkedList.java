package br.dio.com.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client : filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorfilaBanco = filaBanco.iterator();

        while (iteratorfilaBanco.hasNext()){
            System.out.println("-->" + iteratorfilaBanco.next());

        }

    }

}
