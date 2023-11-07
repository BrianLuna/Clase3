package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Padre homero = new Padre("Homero", "Simpson", LocalDate.of(1956, 5, 12));
        Persona bart = new Persona("Bartolomeo", "Simpson", LocalDate.of(1981, 12, 13));
        Persona lisa = new Persona("Lisa", "Simpson", LocalDate.of(1982, 5, 9));
        Persona maggie = new Persona("Margaret", "Simpson", LocalDate.of(1988, 4, 19));

        homero.agregarHijo(bart);
        homero.agregarHijo(lisa);
        homero.agregarHijo(maggie);

//        for (Persona hijo : homero.getHijos()){
//            System.out.println(hijo.getNombre());
//        }

//        homero.getHijos().forEach(hijo -> System.out.println(hijo.getNombre()));

//        boolean res = homero.getHijos().stream().anyMatch(hijo -> hijo.getNombre().equalsIgnoreCase("bartolomeo"));
//        System.out.println(res);

//        boolean res2 = homero.getHijos().stream().allMatch(hijo -> hijo.getFechaDeNacimiento().isAfter(homero.getFechaDeNacimiento()));
//        System.out.println(res2);

//        List<String> nombres = homero.getHijos().stream().map(hijo -> hijo.getNombre()).collect(Collectors.toList());
//        nombres.forEach(n -> System.out.println(n));

//        List<Persona> hijosQueCumplen = homero.getHijos().stream().filter(hijo -> hijo.getFechaDeNacimiento().isBefore(LocalDate.of(1983, 1, 1)) && hijo.getNombre().equals("Bartolomeo")).toList();
//        hijosQueCumplen.forEach(hijo -> System.out.println(hijo.getNombre()));
//
//        List<String> numerosString = new ArrayList<>();
//        numerosString.add("1");
//        numerosString.add("2");
//        numerosString.add("3");
//
//
//        List<Integer> numeros = numerosString.stream().mapToInt(numero -> Integer.valueOf(numero)).boxed().toList();
//
//        List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4);
//
//        List<String> listaStrings = listaEnteros.stream().map(n -> n.toString()).toList();
//
//        List<String> textos = new ArrayList<>();
//        textos.add("Hola");
//        textos.add(1);

//        List<Integer> numeros = new ArrayList<>();
//        numeros.add(4);
//        numeros.add(1);
//        numeros.add(8);
//        Integer resultado = Collections.max(numeros);
//        System.out.println(resultado);

//        homero.getHijos().forEach(hijo -> System.out.println(hijo));

//        List<Integer> numeros = new ArrayList<>();
//        numeros.add(4);
//        numeros.add(1);
//        numeros.add(8);
//        int suma = numeros.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(suma);

//        //int, float, double, char
//        //Integer, Float, Double, Char, Boolean
//        Integer numero = 1;
//        int otroNumero = numero.intValue();

//        List<String> textos = new ArrayList<>();
//        textos.add("Primero");
//        textos.add("Segundo");
//        textos.add("Tercero");
//        String textoResultante = String.join(", ", textos);
//        System.out.println(textoResultante);
    }
}