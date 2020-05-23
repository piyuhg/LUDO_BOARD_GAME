package game1;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	public Board board = new Board();
	public Team Red = new Team("Red");
	public Team Blue = new Team("Blue");
	public Team Yellow = new Team("Yellow");
	public Team Green = new Team("Green");
	public ArrayList<String> Players = new ArrayList<String>();
	public String[] Color = {"Red", "Blue", "Yellow", "Green"};
	public int NumberOfPlayers = 1;
	
	public Game(Scanner s) {
		System.out.println("Welcome to Ludo Game");
		board.printBoard();
		takePlayerNames(s);		
	}
	
	
	public void takePlayerNames(Scanner s) {
		while(NumberOfPlayers <2 || NumberOfPlayers >5) {
			System.out.print("Please select the number of players (2-4): ");
			NumberOfPlayers = s.nextInt();s.nextLine();
			System.out.println();
		}
		for(int i = 0; i<NumberOfPlayers; i++) {
			System.out.print("Enter Player "+(i+1)+" Name: ");
			Players.add(i,s.nextLine());
		}		
		System.out.println("Numbers of players: "+NumberOfPlayers);
		System.out.println("Color\tPlayer Name");
		for(int i = 0; i<NumberOfPlayers; i++)
			System.out.println(Color[i]+"\t"+Players.get(i));

	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Game g1 = new Game(s);
		
		
		
	}

}
