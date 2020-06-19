package Bridge.miEjercicio;

import java.text.DecimalFormat;

public class Boliviano implements IMoneda {

    private DecimalFormat df = new DecimalFormat("#.00");

    @Override
    public void agregarInteres(double monto, double interes) {
        System.out.println("Al monto de " + df.format(monto) + "Bs se le agrega un " + df.format(interes) + "% de interes");
        System.out.println("Total: " + df.format(monto + ((interes*monto)/100)) + "Bs");
    }
}
