package src.factorymethod;

public class PizzaSalami implements  Pizza{
    @Override
    public String getTipoMasa() {
        return "Gruesa";
    }

    @Override
    public String getTipoQueso() {
        return "Quesito";
    }

    @Override
    public String getTippings() {
        return "Salami";
    }
}
