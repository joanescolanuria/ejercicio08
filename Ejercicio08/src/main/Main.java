package main;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface ReverseString {
    String reverse(String input);
}

public class Main {

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("joel", "luis", "joan", "janeth", "cielo");
        List<String> resultado = lista.stream().filter(s -> s.contains("o")).collect(Collectors.toList());
        System.out.println(resultado);

        List<String> lista2 = Arrays.asList("Holattt", "joel", "luis", "joan", "janeth", "cielo");
        List<String> resultado2 = lista2.stream().filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(resultado2);

        List<String> meses = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "setiembre", "octubre", "noviembre", "diciembre");
        meses.forEach(mes -> System.out.print(mes + " " + "\n"));

        meses.forEach(System.out::print);
        System.out.println();

        PiValue piValue = () -> 3.1415;
        System.out.println("Pi: " + piValue.getPiValue());

        List<String> listaNumerosCadenas = Arrays.asList("111", "22", "33333", "11", "33", "7777");
        listaNumerosCadenas.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Ordenado por longitud: " + listaNumerosCadenas);

        Collections.reverse(listaNumerosCadenas);
        System.out.println("Ordenado al revés: " + listaNumerosCadenas);

        ReverseString cadena = listas -> {
            StringBuilder reverso = new StringBuilder(listas);
            return reverso.reverse().toString();
        };
        System.out.println("Reverso usando lambda: " + cadena.reverse("Janeth"));

    }
}

interface PiValue {
    double getPiValue();
}
