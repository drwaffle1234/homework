package magic;

public class Player {
	private int Health=20;
	private int maxHealth=1000;
	private int minHealth=-1000;
	
	public Player(){
		Health=20;
	}
	
	public Player(int health){
		Health=health;
	}
	
	/**
	 * + one two the health
	 */
	public void plusOne() {
		Health = Health + 1;
	}
	/**
	 * - one two the health
	 */
	public void SubOne() {
		Health = Health - 1;
	}
	/**
	 * reset health 
	 */
	public void reset() {
		Health = 20;
	}
	public int getHealth(){
		return Health;
	}
	public String getHealthinString(){
		return ""+Health;
	}
	public void setHealth(int Health){
		this.Health=Health;
	}

}
