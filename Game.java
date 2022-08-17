package choiceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Game {
	private ArrayList <Question> questionSet;
	public Game () {
		questionSet = new ArrayList <Question> ();
		String q = "Where does the Sun rise?";
		String [] a = {"East", "South", "North", "West"};
		questionSet.add(new Question(q, a, "East"));
		q = "Who invented the telephone?";
		//  must reuse variable with new String []
		// array constants can only be used during initialization
		a = new String [] {"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
		questionSet.add(new Question (q, a, "Alexander Bell"));
		q = "Where is the capital of Japan?";
		a = new String [] {"Tokyo", "Beijing", "Seoul", "Bangkok"};
		questionSet.add(new Question (q, a, "Tokyo"));
		Collections.shuffle(questionSet, new Random());
	}
	public void start () {
		Scanner scan = new Scanner (System.in);
		int numCorrect = 0;
		// show question from questionSet
		for (int question = 0; question < questionSet.size(); question++) {
			System.out.println(questionSet.get(question).getQuestion());
			int numChoices = questionSet.get(question).getChoices().size();
			// show choices from question in questionSet
			for (int choice = 0; choice < numChoices; choice++) {
				System.out.println((choice + 1) + ": " + questionSet.get(question).getChoices().get(choice));
			}
			int playerAnswer = scan.nextInt();
			ArrayList <String> choiceSet = questionSet.get(question).getChoices();
			String correctAnswer = questionSet.get(question).getAnswer();
			int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
			// Seeing if the player got the answer right
			// and adding a point to the score
			if (playerAnswer == correctAnswerIndex + 1) {
				System.out.println("Yes! The answer is " + correctAnswer);
				numCorrect++;
			}
			else {
				System.out.println("No, the answer is " + correctAnswer);
			}
		}
		scan.close();
		System.out.println("You got " + numCorrect + " correct answers");
	}
}
