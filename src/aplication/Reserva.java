package aplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
	
	List <Reserva> reservas = new ArrayList<>();
	
	private Hospede hospede = new Hospede();
	private int diarias;

	
	public Reserva(Hospede hospede, int diarias) {
		this.hospede = hospede;
		this.diarias = diarias;
	}

	public Reserva(Hospede hospede) {
		this.hospede = hospede;
	}

	public Reserva() {
	
	}
	
	
	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

	public void adicionaReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public boolean buscaReservaCheckIn(String nome, LocalDate data) {
		boolean resultado = false;
		for (Reserva reserva : reservas) {
			if (reserva.getHospede().getNome().equals(nome) && reserva.getHospede().getCheckIn().equals(data)) {
				resultado = true;
			}
			else
				resultado = false;
		}
		
		return resultado;
	}
	
	public void setQuartoCheckIn(String nome, int numero, LocalDate data) {
		for (Reserva reserva : reservas) {
			if (reserva.getHospede().getNome().equals(nome) && reserva.getHospede().getCheckIn().equals(data))
				reserva.getHospede().setNumQuarto(numero);
		}	
	}
	
	public void setCheckOut(int numero) {
		for (Reserva reserva : reservas) {
			if(reserva.getHospede().getNumQuarto() == numero) {
				reserva.getHospede().setCheckOut(LocalDate.now());
			}
		}
	}
	
	public String toString() {
		System.out.println("Reservas\n");
		return
	"Nome: " + getHospede().getNome() +
	 "\nCheckIn: "+ getHospede().getCheckIn() + 
	 "\nCheckOut: " + getHospede().getCheckOut() +
	 "\nQuarto: " + getHospede().getNumQuarto() +
	 "\nTipo: " + getHospede().getTipo() +
	 "\nDiarias: " + getDiarias() + "\n";
	} 

	public void listarReservas() {
		for (Reserva reserva : reservas) {
			System.out.println(reserva.toString());
		}
	}

}
