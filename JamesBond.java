/*
 * Practica #1
 * Programar agente con almenos un comportamiento
 * autores:
 * 	Alberto Cortes Blanco		1478824
 */
import jade.core.Agent;
import jade.core.behaviours.*;
 
public class JamesBond extends Agent{
 
    protected void setup(){
    //llamada al comportamiento
        addBehaviour(new Comportamiento1());
    }
    
    
    //Codigo del comportamiento
    private class Comportamiento1 extends Behaviour{
        
    	public void action(){
        System.out.println("Mi nombre es: "+getName() );
            System.out.println("Soy el comportamiento del agente");
 
    }
        public boolean done(){
            return true;
        }
    }
}
