package _ejerciciosPractica2.ejercicio5;

public interface ICanal {
    void suscribir(ISuscriptor s);
    void desuscribir(ISuscriptor s);
    void enviarNotificacion(Video v);
}
