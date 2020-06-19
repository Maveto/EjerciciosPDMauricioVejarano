package Bridge.miEjercicio;

public class Ahorro implements ICuenta {

    private double monto;
    private double interes = 2;
    private IMoneda moneda;

    public Ahorro(double monto){
        this.monto = monto;
    }

    @Override
    public void agregarInteres(IMoneda m) {
        System.out.println("Agregando interes a la cuenta de ahorro");
        this.moneda = m;
        moneda.agregarInteres(monto, interes);
    }
}
