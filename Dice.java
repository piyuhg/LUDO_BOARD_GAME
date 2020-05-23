package game1;
import java.util.Random;
public class Dice {

	private Random random = new Random();
	private int Dice[] = {1,2,3,4,5,6};
	public int Out = Dice[0];
	
	public int ThrowDice() {
		int rand = random.nextInt(6);
		System.out.println(rand+1);
		return rand;
	}
	
	public static void main(String [] args) {
		Dice d1 = new Dice();
		int out;
		for(int i = 0; i< 10; i++) {
			out = d1.ThrowDice();
		}
	}
}
