package command.miEjercicio;

public class Cliente {
    public static void main(String[] args) {
        Computadora c = new Computadora();
        Reciever r = new Reciever(c);

        CommadEncender c1 = new CommadEncender(r);
        CommadIniciarSesion c2 = new CommadIniciarSesion(r,"Mauricio");
        CommadReiniciar c3 = new CommadReiniciar(r);
        CommadSuspender c4 = new CommadSuspender(r);
        CommadCerrarSesion c5 = new CommadCerrarSesion(r);
        CommadApagar c6 = new CommadApagar(r);

        c.addCommand(c1);
        c.addCommand(c2);
        c.addCommand(c3);
        c.addCommand(c4);
        c.addCommand(c5);
        c.addCommand(c6);

        c.runCommands();
    }
}
