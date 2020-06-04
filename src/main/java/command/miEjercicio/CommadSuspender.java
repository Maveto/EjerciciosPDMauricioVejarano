package command.miEjercicio;

public class CommadSuspender implements ICommand {

    private Reciever reciever;

    public CommadSuspender(Reciever reciever){
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.suspender();
    }
}
