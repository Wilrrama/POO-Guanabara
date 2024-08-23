package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private boolean status;
	private double saldo;	
	
	
	public ContaBanco(int numConta, String tipo, String dono ) {		
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		;
	}

	public void abrirConta() {
		this.status = true;
		this.saldo = this.saldo + 50.0;
		System.out.println("Conta aberta");
		System.out.println("Numero da Conta " + this.numConta +  " Proprietário " + this.dono);
		System.out.println("Saldo "+ saldo + " Status " + this.status);	
	}
	
	public void sacar() {
		this.status = true;
		if ( this.saldo >= 10.0) {
			this.saldo = this.saldo - 10.0;		
			System.out.println("Saque Realizado: valor R$ 10,00 " + " Novo Saldo: " + this.saldo +
			" Status " + this.status);
		} else {
			System.out.println("Saldo Insuficiente " + " Status " + this.status);
		}		 
	}
	
	public void depositar() {
		this.status = true;
		this.saldo = this.saldo + 10.0;	
		System.out.println("Deposito Realizado : valor R$ 10,00 " + " Novo Saldo: " + this.saldo); 
	}
	
	public void fecharConta() {
		this.status = false;
		System.out.println("Conta fechada"); 
	}
	
	public void status() {
		this.status = false;
		System.out.println("Proprietário(a): " + this.dono);
		System.out.println("Numero Conta: " + this.numConta);
		System.out.println("Saldo Atual: " + this.saldo);
	}
	

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}		

}
