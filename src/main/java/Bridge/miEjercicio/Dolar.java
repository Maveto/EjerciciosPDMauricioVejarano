package Bridge.miEjercicio;

import java.text.DecimalFormat;

public class Dolar implements IMoneda {

    private double tipoDeCambio = 6.96;
    private DecimalFormat df = new DecimalFormat("#.00");

    @Override
    public void agregarInteres(double monto, double interes) {
        double bol = monto*tipoDeCambio;
        System.out.println("Cambiando de $ a Bs: " + df.format(monto) + "$ ---> " + df.format(bol) + "Bs");
        System.out.println("Al monto de " + df.format(bol) + "Bs se le agrega un " + df.format(interes) + "% de interes");
        System.out.println("Total: " + df.format(bol + ((interes*bol)/100)) + "Bs");
    }
}
