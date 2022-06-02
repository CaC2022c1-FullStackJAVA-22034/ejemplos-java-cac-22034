package ejemplos.clase04;

public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(boolean tieneAire, String patente) {
        super(patente);
        this.tieneAire = tieneAire;
    }
    
    

    public boolean tieneAire() {
        return tieneAire;
    }
}
