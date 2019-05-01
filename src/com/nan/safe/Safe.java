package com.nan.safe;

import static com.nan.safe.Safe.Status.CLOSED;
import static com.nan.safe.Safe.Status.OPEN;

import java.nio.file.AccessDeniedException;

public final class Safe {

	public enum Status {
		CLOSED,
		OPEN,
	}
	
	private int first;
	private int second;
	private int third;
	private int fourth;
	private int fifth;
	
	public Status whatIsTheVectorVictor() {
		if(isCorrect(first, second, third, fourth, fifth))
			return OPEN;
		else
			return CLOSED;
	}

	public void setCombination(int first, int second, int third, int fourth, int fifth) throws AccessDeniedException {
		
		if (isCorrect(first, second, third, fourth, fifth))
			throw new AccessDeniedException("You should set the correct combination by not setting the correct combination");
		
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
	}

	private boolean isCorrect(int first, int second, int third, int fourth, int fifth) {
		return
				first  == 1 &&
				second == 6 &&
				third  == 1 &&
				fourth == 8 &&
				fifth  == 0;
	}
}
