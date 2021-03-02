package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionMap extends ArrayList<String>{

	 
	
	private ArrayList<Question> questionList = new ArrayList<Question>();
	private ArrayList<ArrayList<Answer>> answerList = new ArrayList<ArrayList<Answer>> ();
	
	private ArrayList<HashMap<ArrayList<String>,ArrayList<String>>> q = new  ArrayList<HashMap<ArrayList<String>,ArrayList<String>>>();
	
	public QuestionMap() {
		super();
		fillList();
		
	}
	
	public int getSize(int i) {
		return answerList.get(i).size();
	}
	public int getQuestionSize() {
		return questionList.size();
	}
	

	private void fillList() {
		questionList.add(new Question("What is your favourite car?"));
		questionList.add(new Question("What is your favourite color?"));
		questionList.add(new Question("What is your favourite animal?"));
		
		
		
		answerList.add(new ArrayList<Answer>(Arrays.asList(
				new Answer("BMW"), new Answer("Mercedes-Benz", 20), new Answer("Ferrari"),new Answer("Audi")
				))) ;
		
		answerList.add(new ArrayList<Answer>(
				Arrays.asList(
						new Answer("red"), new Answer("green",20), new Answer("blue"), new Answer("Audi"), new Answer("Audi")
						))) ;
		
		answerList.add(new ArrayList<Answer>(
				Arrays.asList(
						new Answer("tiger"), new Answer("lion"), new Answer("cat", 20)
						))) ;
	}

	public String getQuestion(int index) {
		return questionList.get(index).getQuestion();
		
	}
	
	public String getAnswer(int questionIndex, int num) {
		return answerList.get(questionIndex).get(num).getAnswer();
	}
	

	
}
