package State.miEjercicio;

public class Maquina {
    private IState state;
    private int precioProducto;

    public Maquina(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void comprarProducto(int monto){
        state.comprar(precioProducto, monto);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
}
