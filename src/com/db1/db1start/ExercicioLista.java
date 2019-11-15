package com.db1.db1start;

import java.util.*;


public class ExercicioLista {
    //Método que retorne os nomes das cores que você mais gosta
    //Método que dado uma lista retorne a quantidade de itens
    //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
    //Método que imprima a lista de cores do primeiro método
    //Método que imprima as cores do primeiro método em ordem alfabética
    //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
    //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
    //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares

    private static void separar() {
        System.out.println("------------------");
    }

    private static List<String> coresPref() {
        List<String> coresPref = new ArrayList<> ();
        coresPref.addAll(Arrays.asList("Azul", "Vermelho", "Verde", "Preto")) ;
        return coresPref;
    }

    private static void item() {
        List<String> itens = new ArrayList<>();

        itens.add("Item1");
        itens.add("Item2");
        itens.add("Item3");

        System.out.println(itens);
        System.out.println("Quantidade de itens: " + itens.size());
    }

    private static void string() {
        List<String> string = new ArrayList<>();

        string.addAll(Arrays.asList("String1", "String2", "String3"));

        System.out.println(string);
        string.remove(1);
        System.out.println("Removendo a segunda opção: ");
        System.out.println(string);
    }

    private static void imprimirCoresPref() {
        System.out.println("Cores preferida: " + coresPref());
    }

    private static void imprimirCoresPrefOrdem() {
        List<String> ordemAlfabetica = coresPref();
        System.out.println("Ordem alfabética.");
        Collections.sort(ordemAlfabetica);
        System.out.println(ordemAlfabetica);
    }

    private static void removerCor() {
        List <String> cor = coresPref();
        cor.remove("Verde");
        System.out.println("Removendo a cor Verde.");
        System.out.println(cor);
    }

    private static void corDecrescente() {
        List<String> decrescente = coresPref();
        System.out.println("Ordem decrescente.");
        Collections.sort(decrescente, Collections.reverseOrder());
        System.out.println(decrescente);
    }

    private static Map<String, List<Integer>> numeroParEImpar() {
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        Map<String, List<Integer>> num = new HashMap<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        num.put("Par", pares);
        num.put("Impar", impares);

        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        coresPref();
        separar();

        item();
        separar();

        string();
        separar();

        imprimirCoresPref();
        separar();

        imprimirCoresPrefOrdem();
        separar();

        removerCor();
        separar();

        corDecrescente();
        separar();

        numeroParEImpar();
    }
}

