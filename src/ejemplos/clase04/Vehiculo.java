package ejemplos.clase04;

public abstract class Vehiculo {

    private String patente;

    public Vehiculo(String patente) {
        super();
        this.patente = patente;
    }

    public void acelerar() {
    }

    public String getPatente() {
        return this.patente;
    }
}
