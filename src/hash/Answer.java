package hash;

public class Answer {

	private String answer;
	private int score;
	
	
	public Answer(String answer) {
		super();
		this.answer = answer;
	}


	public Answer(String answer, int score) {
		super();
		this.answer = answer;
		this.score = score;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
