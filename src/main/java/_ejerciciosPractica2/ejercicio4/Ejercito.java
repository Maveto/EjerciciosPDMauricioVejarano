package _ejerciciosPractica2.ejercicio4;

public class Ejercito implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler h) {
        next = h;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void evaluarOrden(Ordenes orden) {
        General g = new General();
        Teniente t = new Teniente();
        Coronel co = new Coronel();
        Cabo ca = new Cabo();

        this.setNext(g);
        g.setNext(t);
        t.setNext(co);
        co.setNext(ca);

        next.evaluarOrden(orden);
    }
}
