package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {

		executar();

	}

	public static void executar() {
		Reserva reserva = new Reserva();
		Quarto quarto = new Quarto();
		Scanner scan = new Scanner(System.in);
		System.out.print("1- registrar quarto\n" + "2-Listar quartos\n" + "3-Fazer reserva\n" + "4-Listar Reservas\n"
				+ "5- Check-in\n" + "6- Check-Out\n" + "7- Gerenciamento de quartos\n");
		int opcao = scan.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1: {
				System.out.println("Numero do quarto: ");
				int numero = scan.nextInt();
				System.out.print("Tipo do quarto: (solteiro, casal, suite)");
				String tipo = scan.next();
				System.out.print("Valor da diaria: ");
				int valor = scan.nextInt();
				quarto.registraQuarto(new Quarto(numero, tipo, valor));

				break;
			}

			case 2: {
				quarto.listarQuartos();
				break;
			}

			case 3: {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

				System.out.println("Informe o nome:");
				String nome = scan.next();
				
				System.out.println("Tipo do quarto: ");
				String tipo = scan.next();

				System.out.println("Informe a data de check-In:");
				String check_In = scan.next();
				LocalDate checkIn = LocalDate.parse(check_In, formatter);

				System.out.println("Informe a data de Check-Out:");
				String check_Out = scan.next();
				LocalDate checkOut = LocalDate.parse(check_Out, formatter);
				int diarias = checkOut.compareTo(checkIn);
				Reserva novaReserva = new Reserva(new Hospede(nome, checkIn, checkOut, tipo),diarias);
				reserva.adicionaReserva(novaReserva);
				break;
			}
			case 4: {
				reserva.listarReservas();
				break;
			}
			case 5:
			{
				System.out.println("Numero do quarto:");
				int numero = scan.nextInt();
				if(quarto.disponibilidade(numero)) {
					System.out.println("Nome:");
					String nome = scan.next();
					LocalDate checkIn = LocalDate.now();
					if (reserva.buscaReservaCheckIn(nome, checkIn)) {
						reserva.setQuartoCheckIn(nome, numero, checkIn);
						quarto.buscarQuartos(numero);
					}
					else {
						System.out.println("Tipo: ");
						String tipo = scan.next();
						Reserva novaReserva = new Reserva(new Hospede(nome, checkIn, numero, tipo));
						reserva.adicionaReserva(novaReserva);
						quarto.buscarQuartos(numero);
					}
						
				}		
				break;
				
			}
			case 6:
			{
				System.out.println("Numero do quarto:");
				int numero = scan.nextInt();
				reserva.setCheckOut(numero);
				quarto.liberarQuarto(numero);
				
				break;
			}
			case 7:
			{
				System.out.println("Gerenciamento de quartos");
				quarto.quartosOcupados();
				break;
			}
			}

			System.out.print("1- registrar quarto\n" + "2-Listar quartos\n" + "3-Fazer reserva\n" + "4-Listar Reservas\n"
					+ "5- Check-in\n" + "6- Check-Out\n" + "7- Gerenciamento de quartos\n");
			opcao = scan.nextInt();

		}
		scan.close();
	}

}
