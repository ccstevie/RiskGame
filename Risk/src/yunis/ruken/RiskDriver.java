package yunis.ruken;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class RiskDriver {

	private static final int NUM_CARDS = 45;
	private static final int NUM_COUNTRIES = 42;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Players: ");
		int numPlayers = in.nextInt();
		Player[] players = new Player[numPlayers];
		
		for (int i = 0; i < numPlayers; i++) {
			
			System.out.print("Player " + (i + 1) + " name: ");
			players[i] = new Player(in.nextLine());
			in.next();
		}
		//Read in countries
		try {
			
			ArrayList<Country> countries = new ArrayList<>();
			Scanner countryScanner = new Scanner(new File("resources\\countries.csv"));
			String header = countryScanner.nextLine();
			int[] adj = new int[0];
			while (countryScanner.hasNextLine()) {
				
				String rawId = countryScanner.next();
				int id = Integer.parseInt(rawId.substring(0, rawId.length() - 1));
				String name = countryScanner.next();
				name = name.substring(0, name.length() - 1);
				String rawAdj = countryScanner.next();
				String[] adjListStr = rawAdj.substring(0, rawAdj.length() - 1).split(" ");
				adj = new int[adjListStr.length];
				
				int i = 0;
				for (String country : adjListStr) {
					adj[i++] = Integer.parseInt(country);
				}
				
				
				countries.add(new Country(id, name));
					
			}
			for (int countryId : adj) {
				countryId++;
				for (Country possibleAdj : countries) {
					if (countryId == possibleAdj.getCountryId()) {
						//TODO add adjacencies
					}
				}
			}
			
			
			countryScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		//Read in cards
		try {
			
			ArrayList<Card> deck = new ArrayList<>();
			Scanner cardScanner = new Scanner(new File("resources\\cards.csv"));
			String header = cardScanner.nextLine();
			
			while (cardScanner.hasNextLine()) {
				//TODO add card reading
				//deck.add(new Card(cardScanner.next().substring(0, ));
			}
			cardScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public static void turn(Player player) {
		//TODO implement turns
	}
	
	public int attack(Player player) {
		//TODO implement attacks
		return 1;
	}
}