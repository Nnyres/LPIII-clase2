package funcional;

@FunctionalInterface
public interface MiInterfazFuncional<T, R> {

    R aplicar(T param1, T param2);


}
