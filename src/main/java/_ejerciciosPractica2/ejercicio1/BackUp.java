package _ejerciciosPractica2.ejercicio1;

public class BackUp {

    private DataBase db;
    private String alias;

        public BackUp (DataBase db, String alias){
        this.db = db;
        this.alias = alias;
    }

    public DataBase getDb() {
        return db;
    }

    public void setDb(DataBase db) {
        this.db = db;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
