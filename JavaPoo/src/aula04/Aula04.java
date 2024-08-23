package aula04;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta caneta1 = new Caneta();
		caneta1.setModelo("BIC BLUE");		
		caneta1.setPonta(0.5f);
		caneta1.status();

		Caneta caneta2 = new Caneta();
		caneta2.setModelo("BIC RED");
		caneta2.setPonta(0.7f);
		caneta2.status();
	}

}
