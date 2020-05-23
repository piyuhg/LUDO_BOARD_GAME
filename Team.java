package game1;

public class Team {
	
	public String TeamName;
	public Token[] Tokens = new Token[4];
	public int TokensLeft;
	public boolean AbleToGoEnd;
	public boolean PlayerTurn;
	
	
	
	public Team(String TeamName) {
	//Token(String Team, int TokenNo, int HomeX, int HomeY, int EndX, int EndY) {
		this.TokensLeft = 4;
		if(TeamName.equals("Red")) {
			Tokens[0] = new Token(TeamName,1,1,1,7,6);
			Tokens[1] = new Token(TeamName,2,1,4,7,6);
			Tokens[2] = new Token(TeamName,3,4,1,7,6);
			Tokens[3] = new Token(TeamName,4,4,4,7,6);
		}
		if(TeamName.equals("Blue")) {
			Tokens[0] = new Token(TeamName,1,1,10,6,7);
			Tokens[1] = new Token(TeamName,2,1,13,6,7);
			Tokens[2] = new Token(TeamName,3,4,10,6,7);
			Tokens[3] = new Token(TeamName,4,4,13,6,7);
		}
		if(TeamName.equals("Yellow")) {
			Tokens[0] = new Token(TeamName,1,10,10,7,8);
			Tokens[1] = new Token(TeamName,2,10,13,7,8);
			Tokens[2] = new Token(TeamName,3,13,10,7,8);
			Tokens[3] = new Token(TeamName,4,13,13,7,8);
		}
		if(TeamName.equals("Green")) {
			Tokens[0] = new Token(TeamName,1,10,1,7,8);
			Tokens[1] = new Token(TeamName,2,10,4,7,8);
			Tokens[2] = new Token(TeamName,3,13,1,7,8);
			Tokens[3] = new Token(TeamName,4,13,4,7,8);
		}
	}

	
	
}
