interface Mediator {
    void enviarMensaje(String mensaje, Usuario usuario);
}

class MediadorConcreto implements Mediator {
    private Usuario usuario1;
    private Usuario usuario2;

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario usuario) {
        if (usuario == usuario1) {
            usuario2.recibirMensaje(mensaje);
        } else if (usuario == usuario2) {
            usuario1.recibirMensaje(mensaje);
        }
    }
}

// Definición de la interfaz Usuario
interface Usuario {
    void enviar(String mensaje);
    void recibirMensaje(String mensaje);
}

// Implementación concreta del Usuario
class UsuarioConcreto implements Usuario {
    private Mediator mediator;
    private String nombre;

    public UsuarioConcreto(Mediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    @Override
    public void enviar(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " ha recibido el mensaje: " + mensaje);
    }
}

// Ejemplo de uso
public class prueba {
    public static void main(String[] args) {
        MediadorConcreto mediador = new MediadorConcreto();

        Usuario usuario1 = new UsuarioConcreto(mediador, "Usuario 1");
        Usuario usuario2 = new UsuarioConcreto(mediador, "Usuario 2");

        mediador.setUsuario1(usuario1);
        mediador.setUsuario2(usuario2);

        usuario1.enviar("¡Hola! ¿Cómo estás?");
        usuario2.enviar("¡Bien, gracias! ¿Y tú?");
    }
}
