package _ejerciciosPractica2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<BackUp> backUps = new ArrayList<>();

    public void addBackUp(BackUp b){
        backUps.add(b);
    }

    public BackUp getBackUp(int i){
        return backUps.get(i);
    }
}
