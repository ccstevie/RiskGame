package yunis.ruken;

import java.util.ArrayList;

public class Country {
	
	private ArrayList<Country> adjacentCountries;
	private String name;
	private Player currentOwner;
	private int countryId;
	
	public Country(int countryId, String name, ArrayList<Country> adjacentCountries) {
		this.countryId = countryId;
		this.name = name;
		this.adjacentCountries = adjacentCountries;
	}
	
	public Country(int countryId, String name) {
		this.countryId = countryId;
		this.name = name;
	}
	
	public ArrayList<Country> getAdjacentCountries() {
		return adjacentCountries;
	}
	
	public String getName() {
		return name;
	}
	
	public void conquer(Player player) {
		currentOwner = player;
	}
	
	public Player getCurrentOwner() {
		return currentOwner;
	}
	
	public int getCountryId() {
		return countryId;
	}
	
	public void setAdjacencies(ArrayList<Country> adjacentCountries) {
		this.adjacentCountries = adjacentCountries;
	}
	
	public void addAdjacency(Country country) {
		adjacentCountries.add(country);
	}
}
