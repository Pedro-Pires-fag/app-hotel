package aplication;

import java.util.ArrayList;
import java.util.List;

public class Quarto {

	List<Quarto> listaDeQuartos = new ArrayList<>();
	private int numero;
	private String tipo;
	private int diaria;
	private boolean disponibilidade = true;

	public Quarto(int numero, String tipo, int diaria, boolean disponibilidade) {

		this.numero = numero;
		this.tipo = tipo;
		this.diaria = diaria;
		this.disponibilidade = disponibilidade;
	}

	public Quarto(int numero, String tipo, int diaria) {
		this.numero = numero;
		this.tipo = tipo;
		this.diaria = diaria;
	}

	public Quarto() {

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDiaria() {
		return diaria;
	}

	public void setDiaria(int diaria) {
		this.diaria = diaria;
	}

	public boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String toString() {
		return "Numero: " + numero + "\nTipo: " + tipo + "\nValor: " + diaria + "\nDisponibilidade: " + disponibilidade
				+ "\n\n";
	}

	public void registraQuarto(Quarto quarto) {
		listaDeQuartos.add(quarto);

	}

	public void listarQuartos() {
		for (Quarto quarto : listaDeQuartos) {
			System.out.println(quarto.toString());
		}

	}

	public void buscarQuartos(int numero) {
			for (Quarto quarto : listaDeQuartos) {
				if(quarto.getNumero() == numero) {
					boolean disponibilidade = false;
					quarto.setDisponibilidade(disponibilidade);
				}
				else
				{
					System.out.println("Quarto nao encontrado ou ocupado");
				}
			}
	}
	
	public boolean disponibilidade(int numero) {
		boolean disponibilidade = false;
		
		for (Quarto quarto : listaDeQuartos) {
			if(quarto.getNumero() == numero && quarto.getDisponibilidade() == true)
				disponibilidade = true;
			else
				disponibilidade = false;
		}
		
		return disponibilidade;
		
	}
	
	public void quartosOcupados() {
		int num = 0;
		for (Quarto quarto : listaDeQuartos) {
			if(quarto.getDisponibilidade() == false)
				num++;
			System.out.println("\nNumero do quarto: " + quarto.getNumero() + " , " + "Tipo: " + quarto.getTipo() + "\n");
				
		}
		
		System.out.println("Numero de quartos Ocupados: " + num);
		
	}
	
	public void liberarQuarto(int numero) {
		for (Quarto quarto : listaDeQuartos) {
			if(quarto.getNumero() == numero) {
				boolean disponibilidade = true;
				quarto.setDisponibilidade(disponibilidade);
			}
		}
	}
	
}
