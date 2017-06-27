package Logica;

public class VarCompart {
	private int distancia;
	private enum colorType {
		
		   azul, rojo, amarillo, verde, negro, blanco
		
		
	}
	private colorType color;
	
	
	public VarCompart(){
		//constructor vacío.
	}
	
	public synchronized int getDistancia(){
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return distancia;
		
	}
	
	
	public synchronized void setDistancia(int nvoValor){
		
		distancia = nvoValor;
		this.notifyAll();
	}
	
	public synchronized void setColor(colorType nvoValor){
		color = nvoValor;
		this.notifyAll();
	}
	
	public synchronized colorType getColor(){
		return color;
	}
}
