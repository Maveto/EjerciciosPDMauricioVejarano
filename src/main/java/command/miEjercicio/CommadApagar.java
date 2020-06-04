package command.miEjercicio;

public class CommadApagar implements ICommand {

    private Reciever reciever;

    public CommadApagar(Reciever reciever){
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.apagar();
    }
}
