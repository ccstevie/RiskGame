package yunis.ruken;

public class Continent {

	private int troopGen;
	private String name;
	
	public Continent(String name, int troopGen) {
		this.name = name;
		this.troopGen = troopGen;
	}
	
	public int getTroopGen() {
		return troopGen;
	}
	
	public String getName() {
		return name;
	}
}
