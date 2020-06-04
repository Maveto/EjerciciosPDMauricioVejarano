package command.miEjercicio;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<ICommand> comandos = new ArrayList<>();
    private String ususario = "";
    private boolean encendida = false;

    public void setUsusario(String ususario) {
        this.ususario = ususario;
    }

    public String getUsusario() {
        return ususario;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void addCommand(ICommand c){
        comandos.add(c);
    }

    public void runCommands(){
        for(ICommand c : comandos){
            c.execute();
        }
    }
}
