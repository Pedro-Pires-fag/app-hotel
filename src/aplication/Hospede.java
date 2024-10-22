package aplication;

import java.time.LocalDate;


public class Hospede {

	private String nome;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private int numQuarto;
	private String tipo;

	
	public Hospede(String nome, LocalDate checkIn, LocalDate checkOut, int numQuarto, String tipo) {
		this.nome = nome;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numQuarto = numQuarto;
		this.tipo = tipo;
	}
	
	
	public Hospede(String nome, LocalDate checkIn, LocalDate checkOut, String tipo) {
		this.nome = nome;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.tipo = tipo;
	}

	public Hospede(String nome, LocalDate checkIn, int numQuarto, String tipo) {
		this.nome = nome;
		this.checkIn = checkIn;
		this.numQuarto = numQuarto;
		this.tipo = tipo;
	}


	public Hospede() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
