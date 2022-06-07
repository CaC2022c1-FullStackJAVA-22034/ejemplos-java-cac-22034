package ejemplos.clase05.interfaces;

public class TelefonoMovil extends Dispositivo implements Comunicador {
    
    public void prender() {
        System.out.println("Prendiendo...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Conectando con la API de WhatsApp para enviar un mensaje que dice: " + mensaje);
    }
}
