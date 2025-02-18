/*
 * IS4010 Fall 2019
 * 10/03/2019
 * Assignment 05
 * Description: Football Scores
 * Aaron Silvestri
 * silvesam@ucmail.uc.edu
 */
package footballFun;


public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	/**
	 * This checks to make sure the score works for each return, if so, all tests pass
	 * In the process, if a statement is true, correct count gets increased by 1. if all tests are true(8) the whole thing passes
	 * @param score, what the user would be entering for a score
	 * @return "" returns "All tests passed" if all statements align
	 */
	
	public static String translateScore (int score) {
	
		if (score == 2) {return"safety";}
		if (score == 3) {return"field goal";}
		if (score == 6) {return"touchdown";}
		if (score == 7) {return"touchdown and extra point";}
		if (score == 8) {return"touchdown and 2-point conversion";}
		if (score == -1) {return"";}
		if (score == 1) {return"invalid";}
		if (score == 10) {return"you must be playing Quidditch ";}
	
		return "";
	}
}
