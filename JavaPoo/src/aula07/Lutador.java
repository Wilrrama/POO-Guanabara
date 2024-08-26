package aula07;

public class Lutador {
	private	String nome, nacionalidade, categoria;	
	private	float altura, peso;	
	private	int idade, vitorias , derrotas, empates;
	
	
	
	public Lutador(String nome, String nacionalidade,  float altura, float peso, int idade,
			int vitorias, int derrotas, int empates) {		
		this.nome = nome;
		this.nacionalidade = nacionalidade;		
		this.altura = altura;
		this.setPeso(peso);
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
	    if (this.peso < 52.2) {
	        this.categoria = "Inválido";
	    } else if (this.peso <= 70.3) {
	        this.categoria = "Leve";
	    } else if (this.peso <= 83.9) {
	        this.categoria = "Médio";
	    } else if (this.peso <= 120.2) {
	        this.categoria = "Pesado";
	    } else {
	        this.categoria = "Inválido";
	    }
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("---------------------------------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Diretamente de(a): " + getNacionalidade());
		System.out.println(getIdade() +" anos");
		System.out.println(getAltura() + "m de altura");
		System.out.println("Pesando " + getPeso()+ " kg");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
		
	}
	
	public void status() {
		System.out.println(getNome());
		System.out.println("é um peso " + getCategoria());
		System.out.println( getVitorias() + " vitórias");
		System.out.println( getDerrotas()+ " derrotas");
		System.out.println( getEmpates()+ " empates");
	}

	public void ganharLuta() {
		setVitorias(getVitorias()+1);
	
	}

	public void perderLuta() {
		setDerrotas(getDerrotas()+1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates()+1);
	}
	
	
		
	
}
