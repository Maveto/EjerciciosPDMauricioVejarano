package command.miEjercicio;

public class CommadCerrarSesion implements ICommand {

    private Reciever reciever;

    public CommadCerrarSesion(Reciever reciever){
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.cerrarSesion();
    }
}
