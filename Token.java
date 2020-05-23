package game1;

public class Token {
	public String Team = "";
	public int TokenNo;
	public int PosX, PosY;
	public int HomeX,HomeY;
	public int EndX, EndY;

	public Token(String Team, int TokenNo, int HomeX, int HomeY, int EndX, int EndY) {
		this.Team = Team;
		this.TokenNo = TokenNo;
		this.HomeX = HomeX;
		this.HomeY = HomeY;
		this.EndX = EndX;
		this.EndY = EndY;
	}
	
	public void GoHome() {
		System.out.println("!!Token "+this.TokenNo+" of Team "+this.Team
				+" is moving to Home!!");
		this.PosX = this.HomeX;
		this.PosY = this.HomeY;
	}
	
	public void GoEnd() {
		System.out.println("!!Token "+this.TokenNo+" of team "+this.Team
				+" has reached End!!");
		this.PosX = this.EndX;
		this.PosY = this.EndY;
	}
}
