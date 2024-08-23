package aula06;

public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {		
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean desligado) {
		this.tocando = desligado;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está Ligado? " + this.getLigado());
		System.out.println("Está tocando?" + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for(int i=0; i <= this.getVolume(); i++) {
			System.out.print("|");
		}
		
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+2);
		} else {
			System.out.println("Não consigou aumentar o volume");
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-2);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
			}		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume()==0) {
			this.setVolume(25);
		}		
	}

	@Override
	public void play() {
		if(this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado()&& this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
	}	

}
