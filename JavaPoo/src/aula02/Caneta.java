package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta modelo " + modelo + " tem a ponta " + ponta + " e é da cor " + cor);
		System.out.println("Tampada? " + tampada);
	}
	
	void escrever() {
		if (tampada == true) {
			System.out.println("Caneta Tampada, não será possivel escrever");
		} else {
			System.out.println("Contrato assinado, meu primeira vaga como dev!");
		}
		
		
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada =  false;
	}
}
