package collection;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hola");
        strings.add("Chao");

        System.out.println(strings);
        strings.add("Mundo"); //Insertar
       // System.out.println(strings);
        //strings.remove("Mundo");
        strings.remove("   Mundo   ".trim()); //para borrar espacios
        //System.out.println(strings);
        strings.remove(0);
       // System.out.println(strings);

        //Iniciar una lista rapida y agregarla a otra
        strings.addAll(List.of("Saludo", "Despedida"));
       // System.out.println(strings);

        //Agregar datos en en medio de otros
        strings.add(2, "Entre");
        //System.out.println(strings);

        //Recorrer la lista
        //FORMA 1
        //for (int i=0; 1 <strings.size(); i++);

        //FORMA 2
        System.out.println(">>>Enhanced for");
        for (String string : strings){
            System.out.println(string);
        }
        System.out.println("  ");
        System.out.println(">>>For Each");
        strings.forEach(string -> System.out.println(string));



    }

}
