//@author Fabian Perez Pascal Olguin
import java.util.Scanner;

public class Resp_Cortas_Pregunta extends Pregunta {
    
    // Aquí la respuesta correcta es un texto (String), no un boolean
    private String respuestacorrecta;

    public Resp_Cortas_Pregunta(int peso, String text, String respuestacorrecta) {
        super(peso, text);
        this.respuestacorrecta = respuestacorrecta;
    }

    @Override
    public boolean buscar(Scanner teclado) {
        String respuestaUsuario = "";
        
        while (true) {
            System.out.println(getText() + " (Ingresa tu respuesta): ");
            respuestaUsuario = teclado.nextLine().trim(); 

            if (!respuestaUsuario.isEmpty()) {
                break; 
            } else {
                System.out.println("No puedes dejar la respuesta vacía. Inténtalo otra vez.");
            }
        }
        if (respuestaUsuario.equalsIgnoreCase(respuestacorrecta)) {
            System.out.println("La respuesta es correcta");
            return true;
        } else {
            System.out.println("La respuesta es incorrecta. La respuesta era: " + respuestacorrecta);
            return false;
        }
    }
}