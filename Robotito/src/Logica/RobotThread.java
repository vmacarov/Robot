package Logica;


import Sensores.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;
import lejos.nxt.addon.OpticalDistanceSensor;


public class RobotThread extends Thread{
	//Hace un hilo para los sensores.
	
	
	private VarCompart x;
	private OpticalDistanceSensor sonar;
	
	
	
	
	public RobotThread(VarCompart medida) {
		
		x=medida;
		sonar = new OpticalDistanceSensor(SensorPort.S1);//Inicializo el sensor de ultrasonido.
	}

	public void run(){
		while(true){
			x.setDistancia(sonar.getDistance());
		
			//ImprimirDistancia(x);
		}
	}
	
	public void ImprimirDistancia(int y){
		//Imprime la distancia tomada por el sensor.
	
		System.out.println("Objeto a "+y+" cm");
		Delay.msDelay(500);

	}
	
	/*public int ActualizarDistancia(){
		distancia=sonar.getDistance();
		return distancia;
	}*/
	
	
	
}


/*public void robot(UltrasonicSensor sonar){
		//Lo que va a hacer el robot
		Motor motor = new Motor();
		int distancia=sonar.getDistance();
		while(distancia<15){
			motor.Adelante(distancia);
			
		}
	}*/