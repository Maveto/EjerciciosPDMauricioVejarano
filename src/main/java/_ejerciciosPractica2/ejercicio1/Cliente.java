package _ejerciciosPractica2.ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        CareTaker ct = new CareTaker();
        Originator o = new Originator();

        DataBase db = new DataBase();

        o.setDb(db);
        db.add(new Persona("Juan1", 1, 20));

        ct.addBackUp(o.createBackUp("Backup enero"));
        o.mostrarDatosActuales();

        db.add(new Persona("Juan2", 2, 20));

        ct.addBackUp(o.createBackUp("Backup febrero"));
        o.mostrarDatosActuales();

        db.add(new Persona("Juan3", 3, 20));

        ct.addBackUp(o.createBackUp("Backup marzo"));
        o.mostrarDatosActuales();

        db.add(new Persona("Juan4", 4, 20));

        ct.addBackUp(o.createBackUp("Backup abril"));
        o.mostrarDatosActuales();

        db.add(new Persona("Juan5", 5, 20));

        ct.addBackUp(o.createBackUp("Backup mayo"));
        o.mostrarDatosActuales();

        o.restoreBackUp(ct.getBackUp(1));
        o.mostrarDatosActuales();

        o.restoreBackUp(ct.getBackUp(0));
        o.mostrarDatosActuales();

        o.restoreBackUp(ct.getBackUp(4));
        o.mostrarDatosActuales();

    }
}
