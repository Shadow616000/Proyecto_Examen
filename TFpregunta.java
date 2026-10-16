//@author Fabian Perez Pascal Olguin
import java.util.Scanner;

public class TFpregunta extends Pregunta{
    private boolean respuestacorrecta;
    
    public TFpregunta(int peso,String text, boolean respuestacorrecta ){
        super(peso, text);
        this.respuestacorrecta = respuestacorrecta;
    }
    
    @Override
    public boolean buscar (Scanner teclado){
      
        String respuestaUsuario = ""; 
        
        while (true) {
            System.out.println(getText() + " (Ingresa T o F): ");
            
            respuestaUsuario = teclado.nextLine();
            
            if (respuestaUsuario.equalsIgnoreCase("T") || respuestaUsuario.equalsIgnoreCase("F")) {
                break;
            } else {
                System.out.println("Respuesta incorrecta. Inténtalo denuevo.");
            }
        }
       
        boolean opcionDelUsuario = respuestaUsuario.equalsIgnoreCase("T");
        
        if (opcionDelUsuario == respuestacorrecta) {
            System.out.println("La respuesta es correcta");
            return true;
        } else {
            System.out.println("La respuesta es incorrecta");
            return false;
        }
    }
}