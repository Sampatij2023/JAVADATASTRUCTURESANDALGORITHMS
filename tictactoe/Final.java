package tictactoe;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameEntry ge = new GameEntry("d", 7);
		GameEntry ge2 = new GameEntry("deepak",37);
		GameEntry ge3 = new GameEntry("deepak", 71);
		GameEntry ge4 = new GameEntry("deepak", 1);
		Scoreboard sb = new Scoreboard(4);
		sb.add(ge);
		sb.add(ge2);
		sb.add(ge3);
		sb.add(ge4);
		System.out.println(ge.getName());
		System.out.println(sb.getCapacity());
		sb.print();
		
	}

}
