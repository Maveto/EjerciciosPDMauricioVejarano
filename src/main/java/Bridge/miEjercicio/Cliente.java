package Bridge.miEjercicio;

public class Cliente {
    public static void main(String[] args) {
        Boliviano bo = new Boliviano();
        Dolar d = new Dolar();
        Euro e = new Euro();

        Ahorro a = new Ahorro(45);
        PlazoFijo pf = new PlazoFijo(150);
        Credito c = new Credito(200.45);

        a.agregarInteres(bo);
        System.out.println("------------------------------------------------");
        pf.agregarInteres(d);
        System.out.println("------------------------------------------------");
        c.agregarInteres(e);
    }
}
