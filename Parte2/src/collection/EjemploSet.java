package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

    public static void main(String[] args) {
        //Set<Integer> integers = new HashSet<>(); //No tiene orden de insersión
        //Set<Integer> integers = new LinkedHashSet<>(); //Tiene orden de insersión
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(5);
       // System.out.println(integers);
        integers.add(1);
       // System.out.println(integers);
        integers.addAll(Set.of(1,2,4,3,8,10,30));
        integers.add(20);
       // System.out.println(integers);
        integers.remove(30);

        //Recorrer lista
        integers.forEach(integer -> System.out.println(integer));

    }
}
