package src.strategy;

public class AccionBuscar implements Accion{

    @Override
    public void aplicar() {
        System.out.println("Estoy Buscando");

    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
