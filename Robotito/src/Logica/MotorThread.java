package Logica;
import Sensores.Motor;
import lejos.nxt.SensorPort;
import lejos.util.Delay;
import lejos.nxt.UltrasonicSensor;


public class MotorThread extends Thread{
	
	
	private Motor motores;
	private VarCompart x;
	


	public MotorThread(VarCompart medida) {
		x=medida;
		motores= new Motor();
	}




	public void run(){ 
		while(true){
			
			if(x.getDistancia()>20){
				motores.Adelante(x);
				
			}
			else{
				motores.Parar();
				motores.Girar(500);
				
			}
		
		}
	}		
}
