package command.miEjercicio;

public class CommadReiniciar implements ICommand {

    private Reciever reciever;

    public CommadReiniciar(Reciever reciever){
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.reiniciar();
    }
}
