//@author Fabian Perez Pascal Olguin
import java.util.Scanner;

public abstract class Pregunta {
  protected int peso;
  protected String text;
  
  //constructor
     public Pregunta(int peso, String text){
         this.peso = peso;
         this.text = text;
     }
     public int getPeso(){
     
         return peso;
     }
     public void setPeso(int peso){
         
         this.peso = peso;        
         
     }  
     public String getText(){
     
         return text;
     }
     public abstract boolean buscar(Scanner teclado);
     
                 }
     
 
 
