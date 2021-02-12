

public class Country {
	
   private final String name;
   private final Continent continent;
   
	public Country(String name, Continent continent) {
      this.name = name;
      this.continent = continent;
   }
   
	public String getName() {return name;}
   public Continent getContinent() {return continent;}
   
	@Override
	public String toString() {return String.format("%s (%s)", name, continent);}
}