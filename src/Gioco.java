import java.util.Scanner;

import services.GameService;

public class Gioco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;
		GameService gameService = new GameService();
		
		while(isRunning) {	
		System.out.println("1) Aggiungi un gioco arcade ");
		System.out.println("2) Vedere la lista completa ");
		System.out.println("3) Cercare giochi per parola chiave nel nome");
		System.out.println("4) Filtrare solo quelli più difficili (difficoltà ≥ 4) ");
		System.out.println("5) Menu in loop" );
		
		String choose = scanner.nextLine();
		
		if (choose.equals("1")) {
			System.out.println("Inserisci nome del gioco: ");
			String nome = scanner.nextLine();
			
			System.out.println("Inserisci anno di uscita del gioco: ");
			String annoUscita = scanner.nextLine();
			
			System.out.println("Inserisci livello di difficoltà: ");
			String livelloDifficoltà = scanner.nextLine();
			
			gameService.insertGame(nome, anno, livello);
		}
		}
	}
}
