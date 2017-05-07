package yunis.ruken;

import java.util.Arrays;
import java.util.Scanner;
class RiskDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Players: ");
		int numPlayers = in.nextInt();
		Player[] players = new Player[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			System.out.print("Player " + (i + 1) + " name: ");
			players[i] = new Player(in.nextLine());
		}
		

	
	}
}
