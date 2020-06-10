package State.miEjercicio;

import java.util.Random;

public class Cliente {
    public static void main(String[] args) {
        Maquina m = new Maquina(10);
        Random r = new Random();

        int dineroIngresado = r.nextInt(20);

        System.out.println("--> Precio del producto: " + m.getPrecioProducto());
        System.out.println("--> Se ingresaron: " + dineroIngresado + "Bs");

        if(dineroIngresado < m.getPrecioProducto()){
            m.setState(new MontoInferior());
            m.comprarProducto(dineroIngresado);
        }else if(dineroIngresado > m.getPrecioProducto()){
            m.setState(new MontoSuperior());
            m.comprarProducto(dineroIngresado);
        }else {
            m.setState(new MontoExacto());
            m.comprarProducto(dineroIngresado);
        }
    }
}
