package _ejerciciosPractica2.ejercicio5;

public class Suscriptor implements ISuscriptor {

    private Categorias cat;
    private String nombre;

    public Suscriptor(Categorias c, String nombre){
        cat = c;
        this.nombre = nombre;
    }

    @Override
    public void update(Video v) {
        if(v.getCategoria().equals(cat) || cat.equals(Categorias.ANYCATEGORY)){
            System.out.println(nombre + " se acaba de subir un nuevo video: " + v.getTiulo());
        }
    }
}
