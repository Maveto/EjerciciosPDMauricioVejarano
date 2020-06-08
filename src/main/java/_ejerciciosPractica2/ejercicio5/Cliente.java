package _ejerciciosPractica2.ejercicio5;

public class Cliente {
    public static void main(String[] args) {
        Canal c = new Canal();

        c.suscribir(new Suscriptor(Categorias.ANYCATEGORY, "Juna1"));
        c.suscribir(new Suscriptor(Categorias.COCINA, "Juan2"));
        c.suscribir(new Suscriptor(Categorias.MANUALIDADES, "Juan3"));
        c.suscribir(new Suscriptor(Categorias.MUSICA, "Juan4"));
        c.suscribir(new Suscriptor(Categorias.VIDEOJUEGOS, "Juan5"));

        c.addVideo(new Video("terror", "5 VIDEOS ATERRADORES EN CEMENTRIOS", 15, Categorias.VIDEOJUEGOS));
        c.addVideo(new Video("cocina", "Receta de pollo agridulce", 15, Categorias.COCINA));
        c.addVideo(new Video("manualidades", "como hacer mascaras de papel", 15, Categorias.MANUALIDADES));
        c.addVideo(new Video("musica", "1 hora de musica sad", 15, Categorias.MUSICA));

    }
}
