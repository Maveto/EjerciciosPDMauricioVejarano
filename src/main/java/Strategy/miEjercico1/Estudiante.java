package Strategy.miEjercico1;

public class Estudiante {
    private String name;
    private int promedio;

    public Estudiante(String name, int promedio) {
        this.name = name;
        this.promedio = promedio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}
