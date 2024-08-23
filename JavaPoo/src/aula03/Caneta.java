package aula03;

//Visibilidade

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta modelo " + modelo + " tem a ponta " + ponta + " e é da cor " + cor);
		System.out.println("Tampada? " + tampada);
	}
	
	public void escrever() {
		if (tampada == true) {
			System.out.println("Caneta Tampada, não será possivel escrever");
		} else {
			System.out.println("Contrato assinado, minha primeira vaga como dev!");
		}		
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada =  false;
	}
}
