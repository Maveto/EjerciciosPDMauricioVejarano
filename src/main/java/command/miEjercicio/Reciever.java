package command.miEjercicio;

public class Reciever {

    private Computadora c;

    public Reciever(Computadora c){
        this.c = c;
    }

    public void reiniciar(){
        if(c.isEncendida()){
            System.out.println("SYSTEM> Reiniciando el sistema...");
            apagar();
            encender();
        }else{
            System.out.println("SYSTEM> La computadora no esta encendida");
        }
    }

    public void apagar(){
        if(c.isEncendida()){
            System.out.println("SYSTEM> Apagando el sistema...");
            c.setEncendida(false);
        }else{
            System.out.println("SYSTEM> La computadora ya esta apagada");
        }
    }

    public void encender(){
        if(!c.isEncendida()){
            System.out.println("SYSTEM> Encendiendo el sistema...");
            c.setEncendida(true);
        }else{
            System.out.println("SYSTEM> La computadora ya esta encendidaa.");
        }
    }

    public void suspender(){
        if(c.isEncendida()) {
            System.out.println("SYSTEM> Entrando en modo suspension...");
        }else {
            System.out.println("SYSTEM> La computadora esta apagada");
        }
    }

    public void iniciarSesion(String usuario){
        if(c.isEncendida() && c.getUsusario().equals("")){
            System.out.println("SYSTEM> Iniciando sesion de " + usuario + "...");
            c.setUsusario(usuario);
        }else{
            System.out.println("SYSTEM> La computadora esta apagada o ya hay una sesion iniciada");
        }
    }

    public void cerrarSesion(){
        if(c.isEncendida() && !(c.getUsusario().equals(""))){
            System.out.println("SYSTEM> Cerrando sesion de " + c.getUsusario() + "...");
            c.setUsusario("");
        }else{
            System.out.println("SYSTEM> La computadora esta apagada o no hay ningun usuario conectado");
        }
    }
}
