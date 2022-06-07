package ejemplos.clase05.interfaces;

public class PalomaMensajera extends Ave implements Comunicador {
    
    public void volar() {
        System.out.println("Volando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Volando x los aires para lanzar un papelito que dice: " + mensaje);
    }
}
