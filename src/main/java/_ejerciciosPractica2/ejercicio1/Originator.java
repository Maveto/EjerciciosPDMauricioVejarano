package _ejerciciosPractica2.ejercicio1;

public class Originator {
    private DataBase db;

    public DataBase getDb(){
        return db;
    }

    public void setDb(DataBase d){
        db = d;
        System.out.println("Base de datos configurada");
    }

    public BackUp createBackUp(String alias){
        System.out.println("Creando BackUp: " + alias);
        DataBase d = new DataBase();
        for(Persona p : db.getPersonas()){
            d.add(p);
        }
        return new BackUp(d, alias);
    }

    public void restoreBackUp(BackUp b){
        db = b.getDb();
        System.out.println("Reataurando BackUp: " + b.getAlias());
    }

    public void mostrarDatosActuales(){
        db.showData();
    }
}
