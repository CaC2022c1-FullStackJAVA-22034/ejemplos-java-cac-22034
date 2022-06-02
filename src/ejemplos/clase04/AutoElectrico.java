package ejemplos.clase04;

public class AutoElectrico extends Auto {

    private double potencia;

    public AutoElectrico(double potencia, boolean tieneAire, String patente) {
        super(tieneAire, patente);
        this.potencia = potencia;
    }
    
    

    public double getPotencia() {
        return potencia;
    }
}
