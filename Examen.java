//@author Fabian Perez Pascal Olguin
import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
    
    private ArrayList<Pregunta> listaPreguntas;

    public Examen() {
        this.listaPreguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta nuevaPregunta) {
        listaPreguntas.add(nuevaPregunta);
    }

    public void darExamen() {
        Scanner teclado = new Scanner(System.in);
        int puntosObtenidos = 0;
        int puntosTotales = 0;
        
        System.out.println("      INICIANDO EL EXAMEN        ");
       
        for (int i = 0; i < listaPreguntas.size(); i++) {
            Pregunta actual = listaPreguntas.get(i);
            
            System.out.println("\n--- Pregunta " + (i + 1) + " (Vale " + actual.getPeso() + " pts) ---");
            
            puntosTotales = puntosTotales + actual.getPeso();

            boolean acerto = actual.buscar(teclado);
            if (acerto) {
                puntosObtenidos = puntosObtenidos + actual.getPeso();
            }
        }

        System.out.println("        EXAMEN FINALIZADO        ");
        System.out.println("Puntaje obtenido: " + puntosObtenidos + " de " + puntosTotales + " puntos.");
        
        if (puntosTotales > 0) {
            int porcentaje = (puntosObtenidos * 100) / puntosTotales;
            System.out.println("Porcentaje de logro: " + porcentaje + "%");
        }
        }
    }
