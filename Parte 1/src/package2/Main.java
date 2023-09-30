package src.package2;

import src.factorymethod.CreadorPizza;
import src.factorymethod.CreadorPizzaHawuaiana;
import src.factorymethod.Pizza;
import src.prototype.Estudiante;

import java.sql.SQLOutput;

public class Main {

     public static void main(String[] args) {


//         Estudiante estudiante = new Estudiante("Andrés", 1035l, 8);
//         Estudiante estudiante2 = estudiante.clone();
//
//         System.out.println(estudiante == estudiante2);
//         System.out.println("Estudiante 1: " + estudiante);
//         System.out.println("Estudiante 2: " + estudiante2);

         CreadorPizza creadorPizza = new CreadorPizzaHawuaiana();
         Pizza pizza = creadorPizza.crear();

         Pizza pizza1 = crearPizza(creadorPizza);
         System.out.println(pizza1);




     }

     public static Pizza crearPizza (CreadorPizza creadorPizza){
         return creadorPizza.crear();
     }
}
