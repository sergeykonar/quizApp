package hash;

public class Player extends Object{
	static String name;
	static int score;
	
	public static String getScoreText() {
		return String.valueOf(score);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Player.name = name;
	}

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		Player.score = score;
	}
	
	
	
}
