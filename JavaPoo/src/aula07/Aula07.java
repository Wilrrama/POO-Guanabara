package aula07;

public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador[] lutadores = new Lutador[5];
		
		// Nome, nacionalidade, altura, peso, idade		
		lutadores [0] = new Lutador("Pretty Boy", "França", 1.75f, 82.75f, 24, 11, 3, 1);
		lutadores [1] = new Lutador(null, null, 31, 1.75f, 68, 0, 0, 0);
		lutadores [2] = new Lutador(null, null, 0, 0, 0, 0, 0, 0);
		lutadores [3] = new Lutador(null, null, 0, 0, 0, 0, 0, 0);
		lutadores [4] = new Lutador(null, null, 0, 0, 0, 0, 0, 0);			

		//lutadores[0].status();
		lutadores[0].apresentar();
		
	}

}
