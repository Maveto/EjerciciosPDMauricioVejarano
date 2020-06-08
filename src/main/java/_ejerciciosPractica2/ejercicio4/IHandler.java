package _ejerciciosPractica2.ejercicio4;

public interface IHandler {
    void setNext(IHandler h);
    IHandler next();
    void evaluarOrden(Ordenes orden);
}
