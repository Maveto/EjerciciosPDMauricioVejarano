package _ejerciciosPractica2.ejercicio5;

public class Video {
    private String tipo;
    private String tiulo;
    private int tiempo;
    private Categorias categoria;

    public Video(String tipo, String tiulo, int tiempo, Categorias categoria) {
        this.tipo = tipo;
        this.tiulo = tiulo;
        this.tiempo = tiempo;
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTiulo() {
        return tiulo;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}
