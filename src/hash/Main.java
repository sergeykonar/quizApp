package hash;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;




 
public class Main extends JFrame{
	
	
	static Main window;

	
	private static JLabel text;
	private static JLabel score;
	
	private static QuestionMap questionMap;
	private static Map<String, List<String>> map;
	
	
	
	private static int questionIndex = 0;
	
	public Main(String appName, int width, int height) {
		setTitle(appName);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLayout(new GridLayout(8, 2));
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
		
		
	}
	
	private static ActionListener answerClick = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Player.setScore(Player.getScore() + 20);
			
			try {
				questionIndex++;
				window.getContentPane().removeAll();
				System.out.println(questionIndex);
				init();
				
				window.revalidate();
			}catch (Exception e){
				System.out.println(questionIndex);
				window.getContentPane().removeAll();
				
				initEnd();
				
			}finally {
				window.revalidate();
			}
					
		}
	};
	
	private static void init() {
		text = new JLabel(questionMap.getQuestion(0));
		
		window.add(text);
		int k = questionMap.getSize(questionIndex);
		for(int i=0; i < k ; i++) {
			JButton button = new JButton(questionMap.getAnswer(questionIndex,i));
			button.addActionListener(answerClick);
			window.add(button); 
					
			
		}
		score = new JLabel("Your score: " + Player.getScoreText());
		window.add(score);
		
		
		
	}
	
	private static void initEnd() {
		window.getContentPane().removeAll();
		window.revalidate();
		text = new JLabel("The end!");
		window.add(text);
	}
	
	public static void main(String[] args) {
		window = new Main("App", 300, 320);
		
		
		questionMap = new QuestionMap();
		
		
		System.out.println(questionMap.getSize(questionIndex));
		init();
		
		
		
		
	}

}
