package aula05b;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private boolean status;
	private double saldo;	
	
	public ContaBanco( ) {		
		this.setStatus(false);
		this.setSaldo(0);		
	}

	public void abrirConta(String tipo) {
		this.status = true;
		this.setTipo(tipo);
		
		if (tipo == "CC") {
			this.saldo = this.saldo + 50.0;
		} else if (tipo == "CP") {
			this.saldo = this.saldo + 150.0;
		} else {
			System.out.println("Tipo de conta incorreto !");
		}	
		
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
		
		if (this.getSaldo()>0) {
			System.out.println("Conta está com saldo, precisa retirar o dinheiro para fechar");
		}
		this.status = false;
		System.out.println("Conta fechada"); 
	}
	
	public void status() {
		this.status = false;
		System.out.println("----------------------");
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
