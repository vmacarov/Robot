package Logica;
import lejos.nxt.SensorPort;
import Logica.VarCompart;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;
import Sensores.Motor;
import lejos.nxt.Button;

public class main {
	private static RobotThread sensor;
	private static MotorThread motores;
	static VarCompart medida;//La distancia de un objeto hasta el sensor.
	
	public static void main(String[] args){
		medida = new VarCompart();
		sensor = new RobotThread(medida);
		motores = new MotorThread(medida);
		//UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S1); //Inicializo el sensor de ultrasonido.
		sensor.start();
		motores.start();
		
		while(!Button.ENTER.isDown()){
			//Vacío.
		}
		System.exit(0);
	}
	
	
	
	
}
