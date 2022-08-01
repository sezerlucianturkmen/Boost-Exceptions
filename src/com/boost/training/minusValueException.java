package com.boost.training;

public class minusValueException extends RuntimeException {

	String messagee;

	public minusValueException(String messagee) {
		super();
		this.messagee = messagee;
	}

	public minusValueException() {
		super();
	}

	public String getMessagee() {
		return messagee;
	}

	@Override
	public String getMessage() {
		return messagee;
	}

}
