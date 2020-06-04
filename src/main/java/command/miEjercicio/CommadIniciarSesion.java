package command.miEjercicio;

public class CommadIniciarSesion implements ICommand {

    private Reciever reciever;
    private String usuario;

    public CommadIniciarSesion(Reciever reciever, String usuario){
        this.reciever = reciever;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        reciever.iniciarSesion(usuario);
    }
}
