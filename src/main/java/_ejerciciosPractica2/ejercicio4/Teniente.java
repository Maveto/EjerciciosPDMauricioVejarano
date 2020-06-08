package _ejerciciosPractica2.ejercicio4;

public class Teniente implements IHandler {

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
        switch (orden){
            case DISCIPLINA:
                System.out.println(this.getClass().getSimpleName() + " se encarga de esta orden: " + orden);
                break;
            default:
                next.evaluarOrden(orden);
        }
    }
}
