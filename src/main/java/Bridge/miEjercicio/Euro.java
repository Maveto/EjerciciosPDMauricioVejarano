package Bridge.miEjercicio;

import java.text.DecimalFormat;

public class Euro implements IMoneda {

    private double tipoDeCambio = 7.76;
    private DecimalFormat df = new DecimalFormat("#.00");

    @Override
    public void agregarInteres(double monto, double interes) {
        double bol = monto*tipoDeCambio;
        System.out.println("Cambiando de E a Bs: " + df.format(monto) + "E ---> " + df.format(bol) + "Bs");
        System.out.println("Al monto de " + df.format(bol) + "Bs se le agrega un " + df.format(interes) + "% de interes");
        System.out.println("Total: " + df.format(bol + ((interes*bol)/100)) + "Bs");
    }
}
