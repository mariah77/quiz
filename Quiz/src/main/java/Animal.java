
public abstract class Animal {
	protected int legs;
	public Animal(int a) {
		if(a>=0) {
			legs = a;
		}
	}
	public abstract void eat();
    public void walk() {
    	System.out.println("Animal walks on "+legs+" legs");
    }
}



