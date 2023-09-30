package src.factorymethod;

public class CreadorPizzaHawuaiana implements CreadorPizza {
    @Override
    public Pizza crear() {
        return new PizzaHawaiana();
    }
}
