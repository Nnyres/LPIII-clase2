package src.package2;

import src.Builder.Empleado;
import src.singleton.Singleton;

public class main {

     public static void main(String[] args) {
         Empleado empleado = Empleado.builder()
                 .id(1234)
                 .nombre("Andrés")
                 .build();



         System.out.println(empleado);
     }
}
