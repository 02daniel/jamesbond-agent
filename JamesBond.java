/*
 * Practica #1
 * Programar agente con almenos un comportamiento
 * autores:
 * 	Alberto Cortes Blanco		1478824
 *  Daniel Ivan de Anda Becerra. 1612155
 */
import jade.core.Agent;
import jade.core.behaviours.*;
 
public class JamesBond extends Agent{
 
    protected void setup(){
    //llamada al comportamiento
        addBehaviour(new Comportamiento1());
        addBehaviour(new Comportamiento2());
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
    
    	 //Finalizacion del agente
	protected void takeDown(){
		System.out.println("La escala ha terminado");
	}
	
	//Definicion de un comportamiento
	private class Comportamiento2 extends Behaviour{
		private int estado = 0;
		
		public void action(){
			switch(estado){
			case 0: System.out.println("Estaba");
			break;
			case 1: System.out.println("una");
			break;
			case 2: System.out.println("rana");
			break;
			case 3: System.out.println("sentada");
			break;
			case 4: System.out.println("debajo");
			break;
			case 5: System.out.println("del agua");
			break;
			case 6:{
				System.out.println("Y cuando");
				myAgent.doDelete();
				break;
			}
			
			}
			estado++;
		}
			public boolean done(){
				return (estado > 7);
			
		}
	}

}
