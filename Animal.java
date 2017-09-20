/**
 * Abstract animal class for lesson on interfaces
 * @author Dylan Decker
 *
 */
public abstract class Animal {
	
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	abstract String eat();
	
	public String walk() {
		return "The animal walks on " + legs + " legs.";
	}
	
	

}
