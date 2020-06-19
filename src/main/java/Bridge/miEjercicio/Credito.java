package Bridge.miEjercicio;

public class Credito implements ICuenta {

    private double monto;
    private double interes = 0;
    private IMoneda moneda;

    public Credito(double monto){
        this.monto = monto;
    }

    @Override
    public void agregarInteres(IMoneda m) {
        System.out.println("Agregando interes a la cuenta de credito");
        this.moneda = m;
        moneda.agregarInteres(monto, interes);
    }
}
