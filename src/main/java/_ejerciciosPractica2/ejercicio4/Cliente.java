package _ejerciciosPractica2.ejercicio4;

public class Cliente {
    public static void main(String[] args) {
        Ejercito e = new Ejercito();

        e.evaluarOrden(Ordenes.DISCIPLINA);
        e.evaluarOrden(Ordenes.DESBLOQUEOS);
        e.evaluarOrden(Ordenes.ENTREVISTAS);
        e.evaluarOrden(Ordenes.LIMPIEZAS);
    }
}
