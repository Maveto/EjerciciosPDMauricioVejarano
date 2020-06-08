package _ejerciciosPractica2.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Canal implements ICanal {

    private List<ISuscriptor> suscriptores = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public void addVideo(Video v){
        videos.add(v);
        enviarNotificacion(v);
    }

    @Override
    public void suscribir(ISuscriptor s) {
        suscriptores.add(s);
    }

    @Override
    public void desuscribir(ISuscriptor s) {
        suscriptores.remove(s);
    }

    @Override
    public void enviarNotificacion(Video v) {
        for(ISuscriptor s : suscriptores){
            s.update(v);
        }
    }
}
