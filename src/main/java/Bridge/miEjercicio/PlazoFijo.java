package Bridge.miEjercicio;

public class PlazoFijo implements ICuenta {

    private double monto;
    private double interes = 5;
    private IMoneda moneda;

    public PlazoFijo(double monto){
        this.monto = monto;
    }

    @Override
    public void agregarInteres(IMoneda m) {
        System.out.println("Agregando interes a la cuenta de plazo fijo");
        this.moneda = m;
        moneda.agregarInteres(monto, interes);
    }
}
