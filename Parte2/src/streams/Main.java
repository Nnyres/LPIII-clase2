package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L,20, "Andrés"));
        empleados.add(new Empleado(6L,18, "Fernando"));
        empleados.add(new Empleado(8L,17, "Andrey"));

        Set<String> nombres = empleados.stream()
                .map(empleado -> empleado.getNombre())
                .collect(Collectors.toSet());

        System.out.println(nombres);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Set<Character> iniciales = empleados.stream()
                .map(empleado -> empleado.getNombre())
                .map(nombre -> nombre.charAt(0))
                .collect(Collectors.toSet());

        System.out.println(iniciales);
        System.out.println(empleados);
        System.out.println("------------------------------------------");


        Set<Empleado> empleadosFiltrados = empleados.stream()
                .filter(empleado -> empleado.getEdad() >18)
                .collect(Collectors.toSet());

        System.out.println(empleadosFiltrados);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Set<Empleado> empleadosFiltrados1 = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) != 'A')//
                .collect(Collectors.toSet());

        System.out.println(empleadosFiltrados1);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Optional<Empleado> empleadosFiltrados2 = empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getEdad()));

        System.out.println(empleadosFiltrados2);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Optional<Empleado> empleadosFiltrados3 = empleados.stream()
                .min(Comparator.comparing(empleado -> empleado.getId()));

        System.out.println(empleadosFiltrados3);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Optional<Empleado> empleadosFiltrados4 = empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getNombre().length())); //Haya el maximo

        System.out.println(empleadosFiltrados4);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Optional<Empleado> empleadosFiltrados5 = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) == 'A')
                .findFirst(); //Trae el primero

        System.out.println(empleadosFiltrados5);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Optional<Empleado> empleadosFiltrados6 = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) == 'A')
                .findAny(); //Trae cualquira

        System.out.println(empleadosFiltrados6);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        Map<Long, Empleado> mapObjeto = empleados.stream()
                .collect(Collectors.toMap(empleado -> empleado.getId(), empleado -> empleado));

        System.out.println(mapObjeto);
        System.out.println(empleados);
        System.out.println("------------------------------------------");

        empleados
                .forEach(empleado -> System.out.println(empleado));
        System.out.println("------------------------------------------");

        empleados.stream()
                .filter(empleado -> empleado.getId()<5L)
                .forEach(empleado -> System.out.println(empleado));
        System.out.println("------------------------------------------");

        empleados.stream()
                .filter(empleado -> empleado.getId()<5L)
                .forEach(System.out::println);
        System.out.println("------------------------------------------");

        empleados.stream()
                .map(Empleado::getId)
                .forEach(System.out::println);
        System.out.println("------------------------------------------");

        empleados.stream()
                .filter(empleado -> empleado.getNombre().toUpperCase().charAt(0) == 'a')
                .forEach(System.out::println);
        System.out.println("------------------------------------------");

        Optional<Empleado> optionalEmpleado1 =
                Optional.of(new Empleado(5L, 10, "Alan Brito"));
        System.out.println(optionalEmpleado1);
        System.out.println("------------------------------------------");

        Optional<Empleado> optionalEmpleado2 =
                Optional.of(new Empleado(5L, 10, "Alan Brito"))
                        .filter(empleado -> empleado.getEdad()>18);
        optionalEmpleado2.orElse(null);
        System.out.println(optionalEmpleado2.isPresent());
        System.out.println("------------------------------------------");

        Optional<Empleado> optionalEmpleado3 =
                Optional.of(new Empleado(5L, 10, "Alan Brito"))
                        .filter(empleado -> empleado.getEdad()>18);
        optionalEmpleado2.orElseGet(() -> new Empleado(4L, 25, "Sebastian"));
        System.out.println(optionalEmpleado3.isPresent());
        System.out.println("------------------------------------------");
    }


}
