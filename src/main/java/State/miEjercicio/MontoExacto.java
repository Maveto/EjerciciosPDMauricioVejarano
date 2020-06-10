package State.miEjercicio;

public class MontoExacto implements IState {
    @Override
    public void comprar(int precio, int monto) {
        System.out.println("--> Devuelve el producto");
    }
}
