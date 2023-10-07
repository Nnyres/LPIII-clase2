package funcional;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, String> function = (Integer integer) -> integer.toString() + ", este es el número";

        String string = function.apply(8);
        MiInterfazFuncional<String, Integer> miInterfazFuncional = (String stringParam1, String stringParam2) -> {
            System.out.println("Valor de entrada: " + stringParam1 + stringParam2);
            return 50;
        };
       // System.out.println(string);
        System.out.println(miInterfazFuncional.aplicar("  100   ", "   200"));
    }
}
