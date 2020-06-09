package Strategy.miEjercico1;

public class Colegio {
    private Estudiante[] estudiantes;
    private int i = 0;
    private IStrategy algoritmo;

    public Colegio(int cantidadEstudiantes){
        estudiantes = new Estudiante[cantidadEstudiantes];
    }

    public IStrategy getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(IStrategy algoritmo) {
        this.algoritmo = algoritmo;
    }

    public Estudiante[] getEstudiantes(){
        return estudiantes;
    }

    public void ordenar(){
        algoritmo.ordenar(estudiantes);
    }

    public void addEstudiante(Estudiante e){
        if(i<estudiantes.length) {
            estudiantes[i] = e;
            i++;
        }/*else{
            System.out.println("Capacidad maximima de estudiantes alcanzada, no se puede inscribir a " + e.getName());
        }*/
    }


    public void showEstudiantes(){
        int j = 1;
        for (Estudiante e : estudiantes){
            System.out.print(e.getName() + ": " + e.getPromedio() + " | ");
            j++;
        }
        System.out.println();
    }
}
