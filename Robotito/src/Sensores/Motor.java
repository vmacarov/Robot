package Sensores;

import Logica.VarCompart;
import lejos.nxt.LCD;
import lejos.util.Delay;

public class Motor {
	public void Adelante(VarCompart x){
	//Gira ambas ruedas para mover el robot hacia adelante.	
	
		LCD.drawString(String.valueOf(x.getDistancia()), 0, 1);
		Delay.msDelay(200);
		lejos.nxt.Motor.A.forward();
		lejos.nxt.Motor.C.forward();
	}
	
	public void Parar(){
	//Para ambas ruedas.
		lejos.nxt.Motor.A.stop();
		lejos.nxt.Motor.C.stop();
		
	}
	
	public void Girar(int x){
	//Gira la rueda izquierda hacia adelante y la derecha hacia atrás hasta girar x milisegundos.	
		lejos.nxt.Motor.A.forward();
		lejos.nxt.Motor.C.backward();
		Delay.msDelay(500);
		lejos.nxt.Motor.A.stop();
		lejos.nxt.Motor.C.stop();
	}
 
	
	
}
