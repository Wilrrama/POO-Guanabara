package aula07;

public class Aula07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador[] lutadores = new Lutador[5];
		
		// Nome, nacionalidade, altura, peso, idade, vitorias, derrotas, empates	
		lutadores[0] = new Lutador("Pretty Boy", "França", 1.75f, 82.75f, 24, 11, 3, 1);
		lutadores[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 1.93f, 81.6f, 35, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 1.70f, 69.9f, 28, 13, 4, 2);
        lutadores[4] = new Lutador("UFOCobol", "Canadá", 1.82f, 85.4f, 30, 9, 5, 0);			

		        
		//lutadores[0].apresentar();
        
        lutadores[0].ganharLuta();
        lutadores[0].status();
        
      //  for (int i =0; i < lutadores.length; i++) {
      //  	lutadores[i].apresentar();
      //  }
		
	}

}
