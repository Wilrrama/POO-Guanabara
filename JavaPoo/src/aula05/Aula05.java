package aula05;

public class Aula05 {
	public static void main(String[] args) {
		ContaBanco conta1 = new ContaBanco(123, "CC", "Wilson");		
		conta1.abrirConta();
		conta1.sacar();
		conta1.sacar();
		conta1.sacar();
		conta1.sacar();
		conta1.sacar();
		conta1.sacar();
		conta1.sacar();
		conta1.depositar();
		conta1.setDono("Solange");
		conta1.status();
		System.out.println(conta1.getTipo());
		
		
	}
}
