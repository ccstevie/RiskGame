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
	
	public void attack(Player player) {
		System.out.println("Choose your attacking country: ");
		for(int i = 1; i <= numCountries; i++) {
		     System.println(i + " " +  ownedCountries[i - 1].getName);
		}
		int attackingCountry = in.nextInt();
		System.out.println("Who do you wish to attack?: ");
		for(int i = 1; i <= country.num(possibleAdj); i++){
			System.println(i + " " + country.possibleAdj[i - 1].getName);
		}
		int attackedCountry = in.nextInt();
		System.out.println(player.getName() + " is attacking " + ownedCountries[attackingCountry-1]);
		System.out.println("How many armies will you attack with?: " + "Min: 1, Max: " + country.getNumArmies-1);
		int numAttArmies = in.nextInt();
		System.out.println("Rolling Red Dice");
		int[] RedDice = int[min(3, numAttArmies)]
		for (int i = 1; i <= numAttArmies; i++){
			RedDice[i-1] = (int)(Math.random()*6)+1;
			if (i == 3){
				break;
			}
		}
		System.out.println("Rolling White Dice");
		int[] WhiteDice = int[min(2, country.possibleAdj[attackedCountry-1].getNumArmies)]
		for (int i =1; i <= country.possibleAdj[attackedCountry-1].getNumArmies; i++){
			WhiteDice[i-1] = (int)(Math.random()*6)+1;
			if (i == 2){
				break;
			}
		}
		if (max(WhiteDice) >= max(RedDice)){
			country.possibleAdj[attackedCountry-1].getNumArmies -= 1;
		else{
			country.getNumArmies -= 1;
		}
		if (country.possibleAdj[attackedCountry-1].getNumArmies == 0){
			country.conquer(player)
		}
	}
