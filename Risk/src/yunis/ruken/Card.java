package yunis.ruken;

public class Card {
	
	private Faction faction;
	private Country country;
	
	public Card(Faction faction, Country country) {
		this.faction = faction;
		this.country = country;
	}
	
	public Card(int faction, int country) {
		switch (faction) {
			case 1:
				this.faction = Faction.Infantry;
				break;
			case 2:
				this.faction = Faction.Cavalry;
				break;
			case 3:
				this.faction = Faction.Artillery;
			default:
				this.faction = Faction.Wild;
		}
		switch (country) {
			case 1: 
		}
	}
	

}
