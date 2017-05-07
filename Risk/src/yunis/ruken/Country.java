package yunis.ruken;

public class Country {
	
	private Country[] adjacentCountries;
	private String name;
	
	public Country(String name, Country[] adjacentCountries) {
		this.name = name;
		this.adjacentCountries = adjacentCountries;
	}
	
	public Country[] getAdjacentCountries() {
		return adjacentCountries;
	}
	
	public String getName() {
		return name;
	}
}
