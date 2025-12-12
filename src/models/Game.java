package models;

public class Game {
	private String nome;
	private int annoUscita;
	private int livelloDifficoltà;
	
	
	public Game(String nome, int annoNascita, int livelloDifficoltà) {
		super();
		this.nome = nome;
		this.annoUscita = annoNascita;
		this.livelloDifficoltà = livelloDifficoltà;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnnoNascita() {
		return annoUscita;
	}


	public void setAnnoNascita(int annoNascita) {
		this.annoUscita = annoNascita;
	}


	public int getLivelloDifficoltà() {
		return livelloDifficoltà;
	}


	public void setLivelloDifficoltà(int livelloDifficoltà) {
		this.livelloDifficoltà = livelloDifficoltà;
	}
	
	
	
}
