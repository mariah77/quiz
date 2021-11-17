
public class Dog extends Animal implements Pet {
	 String name;
	public Dog(String d) {
		super(4);
		name = d;
	}
	public Dog() {
		super(4);
		name = "Dog";
	}

	public void setName(String s) {
		name = s;
	}
    public String getName() {
    	return name;
    }
    public void play() {
    	System.out.println("Dog plays");
    }
    public void eat() {
    	System.out.println("Dog eats");
    }
}
