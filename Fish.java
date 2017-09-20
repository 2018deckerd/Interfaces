/**
 * Fish class that overrides the walk and eat methods of Animal
 */
public class Fish {
	
	private String name;
	
	public Fish() {
		
		name = "Piscene";
		
	}
	
	public String walk() {
		return "The fish can't walk and doesn't have legs!";
	}
	
	public String eat() {
		return "The fish eats fish food.";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void play() {
		System.out.println("The fish are playing in a pond over the fish food.");
	}
}
