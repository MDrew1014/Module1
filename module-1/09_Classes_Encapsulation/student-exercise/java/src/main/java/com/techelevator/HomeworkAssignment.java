package com.techelevator;

public class HomeworkAssignment {

	// Instance Variables
	private int earnedMarks; // the total correct marks submitter recieved on the assignment
	private int possibleMarks;// The number of possible marks on the assignment
	private String submitterName;// The submitter's name for the assignment
	
	
	// Method

	public String getLetterGrade() {
		double percentage = (double) earnedMarks / possibleMarks;

		if (percentage >= 0.9) {
			return "A";
		} else if (percentage >= 0.8) {
			return "B";
		} else if (percentage >= 0.7) {
			return "C";
		} else if (percentage >= 0.6) {
			return "D";
		} else {
			return "F";
		}
	}

	// Constructor
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;

	}

	// getters and setters
	public int getEarnedMarks() {
		return earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		if (earnedMarks <= possibleMarks && earnedMarks >= 0) {
			this.earnedMarks = earnedMarks;
		}
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}


	public String getSubmitterName() {
		return submitterName;
	}

	

}
