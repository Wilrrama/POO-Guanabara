package aula05b;

public class Aula05 {
	public static void main(String[] args) {
		ContaBanco conta1 = new ContaBanco();		
		conta1.setDono("Wilson");
		conta1.setNumConta(111);
		conta1.abrirConta("CC");
		
		
		conta1.status();
	
		
		
	}
}
