package State.miEjercicio;

public class MontoSuperior implements IState {
    @Override
    public void comprar(int precio, int monto) {
        System.out.println("--> Devuelve el producto");
        System.out.println("--> Devuelve el cambio: " + (monto - precio));
    }
}
