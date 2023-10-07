package generics;

public class Peluche implements Juguete, Cosa{

    public Peluche(){
        System.out.println("Estoy creando un Peluche");
    }

    @Override
    public Juguete getId() {
        return null;
    }
}
