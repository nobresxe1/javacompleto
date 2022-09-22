package corse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Maira");
        list.add("Paulo");
        list.add("Joana");

        list.add(3, "Marco");

        System.out.println(list.size());
        //remove tanto por comparação de valores quanto por posição dentro da LIST
        list.remove(1);
        //(remove por predicado) ou seja remove de acordo, com o parametro colocado dentro, da função
        list.removeIf(x -> x.charAt(0) == 'M');



        for (String x : list) {
            System.out.println(x);
        }

        //para encontrar a posição dentro do elemento
        System.out.println("Index of: " +list.indexOf("Paulo"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
        //para encontrar dentro da lista o elemento de acordo com seu predicado
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        System.out.println(name);
    }
}
