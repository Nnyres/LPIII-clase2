package src.factorymethod;

public class PizzaHawaiana implements Pizza{

    @Override
    public String getTipoMasa() {
        return "Delgada";
    }

    @Override
    public String getTipoQueso() {
        return "Mozzarella";
    }

    @Override
    public String getTippings() {
        return "Jamon y Piña";
    }

    public String toString () {
        return getTipoMasa() + getTipoQueso() + getTippings();
    }
}
