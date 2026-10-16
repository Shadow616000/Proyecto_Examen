//@author Fabian Perez Pascal Olguin
import java.util.Scanner;

public class Sel_Mul_Pregunta extends Pregunta {
    private String[] opciones;
    private int respuestacorrecta;

    public Sel_Mul_Pregunta(int peso, String text, String[] opciones, int respuestacorrecta) {
        super(peso, text);
        this.opciones = opciones;
        this.respuestacorrecta = respuestacorrecta;
    }

    @Override
    public boolean buscar(Scanner teclado) {
        int indiceElegido = -1;

        while (true) {
            System.out.println(getText());
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((char)('a' + i) + ") " + opciones[i]);
            }

            System.out.print("Ingresa la letra de tu respuesta: ");
            String resp = teclado.nextLine().trim().toLowerCase();

            if (resp.length() == 1) {
                indiceElegido = resp.charAt(0) - 'a';
                if (indiceElegido >= 0 && indiceElegido < opciones.length) {
                    break;
                }
            }
            System.out.println("Respuesta inválida. Inténtalo otra vez.");
        }

        if (indiceElegido == respuestacorrecta) {
            System.out.println("La respuesta es correcta");
            return true;
        } else {
            System.out.println("La respuesta es incorrecta");
            return false;
        }
    }
}