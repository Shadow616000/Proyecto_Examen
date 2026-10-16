//@author Fabian Perez Pascal Olguin
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ExamDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Examen miExamen = new Examen();
        ArrayList<Pregunta> lista = new ArrayList<>();

        // Pregunta 1
        lista.add(new TFpregunta(1," La habilidad definitiva (R) de Karthus, 'Réquiem', golpea a todos los\ncampeones enemigos sin importar en qué parte del mapa se encuentren.", 
            true));
        //pregunta 2
        lista.add(new TFpregunta(1,"la habilidad definitiva de Nocturnem Paranoia bloquea por completo la vision del equipo enemigo",true));
 
        // Pregunta 3
        lista.add(new TFpregunta(1,"El campeón Jhin está completamente obsesionado con el número 5,\nreflejado en la cantidad de balas de su arma y sus habilidades.", 
            false));

        // Pregunta 4
        lista.add(new Sel_Mul_Pregunta(1," ¿Qué campeón tiene una habilidad pasiva que le permite convertirse en un\nhuevo al morir y revivir si no lo destruyen en unos segundos?", 
            new String[]{"Phoenix", "Anivia", "Azir", "Aurelion Sol"}, 
            1));

        // Pregunta 5
        lista.add(new Sel_Mul_Pregunta(1," ¿Cuál es el nombre de la habilidad definitiva (R) de Yasuo,\nla cual solo se puede activar si un enemigo está por los aires?", 
            new String[]{"Tempestad de acero", "Muro de viento", "Último aliento", "Hoja ágil"}, 
            2));

        // Pregunta 6
        lista.add(new Sel_Mul_Pregunta(1, " ¿Qué monstruo épico de la Grieta del Invocador otorga un heraldo o mejoras\nacumulables de estadísticas elementales al ser derrotado en su fosa?", 
            new String[]{"Barón Nashor", "Dragón", "Escurridizo de la Grieta", "Guardián Azul"}, 
            1));

        // Pregunta 7
        lista.add(new Resp_Cortas_Pregunta(1," ¿Cuántas partidas oficiales de League of Legends ha ganado el legendario\nequipo 'Coca Cola Waska'?", 
            "0"));

        // Pregunta 8
        lista.add(new Resp_Cortas_Pregunta(1," En una partida promedio de Coca Cola con Waska en el torneo que se va directo\nal fracaso porque alguien decide abandonar el juego, ¿Cual fue el rol del miembro del equipo el cual se fue afk",
            "Mid"));
 
        //Pregunta 9
        lista.add(new Resp_Cortas_Pregunta(2,"Cómo se llama el personaje principal de la saga The Legend of Zelda", "Link"));
                
        for (Pregunta p : lista) {
            miExamen.agregarPregunta(p);
        }

        miExamen.darExamen();
    }
}