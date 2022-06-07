package ejemplos.clase05.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Campania {

    private ArrayList<Comunicador> comunicadores;
    
    public Campania () {
        comunicadores = new ArrayList<>();
    }
    
    public void agregarComunicador (Comunicador c) {
        this.comunicadores.add(c);        
        Collections.shuffle(comunicadores); // Mezcla los elementos
    }

    public void hacerCampania() {
        for (Comunicador c : comunicadores) {
            c.enviarMensaje("Voten x mi");
        }
    }
}
