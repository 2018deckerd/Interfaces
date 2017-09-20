
public class Cat extends Animal implements Pet {
	
	private String name;
	
	public Cat (String name) {
		super(4);
		this.name = name;
	}
	
	public Cat() {
		super(4);
		name = "";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("The cat is playing with a ball of string.");
	}
	
	String eat() {
		return "Eats cat food.";
	}
}
