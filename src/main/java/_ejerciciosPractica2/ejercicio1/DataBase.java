package _ejerciciosPractica2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Persona> personas = new ArrayList<>();

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void add(Persona p){
        personas.add(p);
    }

    public void remove(Persona p){
        personas.remove(p);
    }
    public void showData(){
        for(Persona p : personas){
            System.out.println(p.getName());
        }
    }
}
