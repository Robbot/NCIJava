package com.hello;

public class main
	{
	//create the score variable for the game
	public static int myScore;
	
	public static void main(String[]  args) {
		//create variable
		myScore = 1000;
		System.out.println("Setting the score to: " + myScore);
		//call method
		displayScore();
		changeScore(100);
		
	}
	
	public static void changeScore(int scoreDelta) {
		System.out.println("Setting the score by: " + scoreDelta);
		myScore = myScore + scoreDelta;
		displayScore();
	}
	public static void displayScore() {
		System.out.println("Player score: " + myScore);
	}
}