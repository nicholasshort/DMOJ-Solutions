
public class SuperClass {

	public String unt = "ni";
	private int balls = 2;
	
	public SuperClass(String unt) {
		this.unt = unt;
	}
	
	protected final void doSomething() {//no subclass can have this method "final"
		System.out.println("balls");
	}
	
	public void suckMePeepee() {
		System.out.println("Eddie loves to suck his peepee.");
	}
	
	
}
