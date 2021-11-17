
public class Fish extends Animal{
	String name;
	public Fish() {
		super(0);
		name = "Fish";
	}
	
	public void eat() {
		System.out.println("Fish eats");
	}
    public void walk() {
    	System.out.println("Fish can't walk as it has  "+legs+" legs");
    }

}
