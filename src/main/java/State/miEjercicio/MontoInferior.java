package State.miEjercicio;

public class MontoInferior implements IState {
    @Override
    public void comprar(int precio, int monto) {
        System.out.println("--> El monto es insuficiente, se necesitan " + precio + "Bs");
        System.out.println("--> Devuelve el dinero: " + monto);
    }
}
