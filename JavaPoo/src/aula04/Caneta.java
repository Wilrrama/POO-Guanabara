package aula04;

public class Caneta {
	public String modelo;
	public float ponta;
	
	public Caneta() {
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
	}

}
