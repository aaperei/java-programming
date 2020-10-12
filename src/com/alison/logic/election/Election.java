package com.alison.logic.election;



/**
 * Election Class
 * @author Alison Augusto Miranda Pereira
 *
 */
public class Election {

	private Integer totalOfVoters;
	private Integer quatityOfValidVotes;
	private Integer quatityOfBlankVotes;
	private Integer quatityOfNullVotes;

	

	public Integer getTotalOfVoters() {
		return totalOfVoters;
	}

	public void setTotalOfVoters(Integer totalOfVoters) {
		this.totalOfVoters = totalOfVoters;
	}

	public Integer getQuatityOfValidVotes() {
		return quatityOfValidVotes;
	}

	public void setQuatityOfValidVotes(Integer quatityOfValidVotes) {
		this.quatityOfValidVotes = quatityOfValidVotes;
	}

	public Integer getQuatityOfBlankVotes() {
		return quatityOfBlankVotes;
	}

	public void setQuatityOfBlankVotes(Integer quatityOfBlankVotes) {
		this.quatityOfBlankVotes = quatityOfBlankVotes;
	}

	public Integer getQuatityOfNullVotes() {
		return quatityOfNullVotes;
	}

	public void setQuatityOfNullVotes(Integer quatityOfNullVotes) {
		this.quatityOfNullVotes = quatityOfNullVotes;
	}

	/**
	 * Calculates the percentage of valid votes
	 * 
	 */
	public double getPorcentageOfValidVotes() {
		return 100 * this.getQuatityOfValidVotes() / this.getTotalOfVoters();
	}

	/**
	 * Calculates the percentage of blank votes
	 * 
	 */
	public double getPorcentageOfBlankVotes() {
		return 100 * this.getQuatityOfBlankVotes() / this.getTotalOfVoters();
	}

	/**
	 * Calculates the percentage of null votes
	 * 
	 */
	public double getPorcentageOfNullVotes() {
		return 100 * this.getQuatityOfNullVotes() / this.getTotalOfVoters();
	}
	
	/**
	 * Prints the election results
	 * 
	 */
	public void printElectionResults() {
		System.out.println("Election 2020:");
		System.out.println("Porcentage of valid votes: " + this.getPorcentageOfValidVotes() + "%");
		System.out.println("Porcentage of blank votes: " + this.getPorcentageOfBlankVotes() + "%");
		System.out.println("Porcentage of null votes: " + this.getPorcentageOfNullVotes() + "%");

	}

	/**
	 * Main method used only to run and validate the class methods
	 *  
	 */
	public static void main(String[] args) {

		Election elections2020 = new Election();

		elections2020.setTotalOfVoters(1000);
		elections2020.setQuatityOfValidVotes(800);
		elections2020.setQuatityOfBlankVotes(150);
		elections2020.setQuatityOfNullVotes(50);

		elections2020.printElectionResults();

	}

}
