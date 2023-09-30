package collection;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "AccionEliminar");
        map.put(3, "AccionMostrar");
        System.out.println(map);
    }
}
