package Strategy.miEjercico1;

import java.util.Random;

public class Cliente {
    public static void main(String[] args) {
        Colegio c = new Colegio(10);
        Random r = new Random();

        c.addEstudiante(new Estudiante("Juan1", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan2", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan3", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan4", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan5", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan6", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan7", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan8", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan9", r.nextInt(100)));
        c.addEstudiante(new Estudiante("Juan10", r.nextInt(100)));


        if(c.getEstudiantes().length <= 3){
            c.showEstudiantes();
            c.setAlgoritmo(new BubbleSort());
            c.ordenar();
            c.showEstudiantes();
        }else if(c.getEstudiantes().length <= 5) {
            c.showEstudiantes();
            c.setAlgoritmo(new InsertionSort());
            c.ordenar();
            c.showEstudiantes();
        }else {
            c.showEstudiantes();
            c.setAlgoritmo(new SelectionSort());
            c.ordenar();
            c.showEstudiantes();
        }
    }
}
