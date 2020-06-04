package command.miEjercicio;

public class CommadEncender implements ICommand {

    private Reciever reciever;

    public CommadEncender(Reciever reciever){
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.encender();
    }
}
