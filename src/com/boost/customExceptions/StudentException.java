package com.boost.customExceptions;

public class StudentException extends RuntimeException {

	private final ErrorType errorType;

	public StudentException(ErrorType type) {
		super(type.getMessage());
		this.errorType = type;
	}

	public StudentException(ErrorType type, String message) {
		super(message);
		this.errorType = type;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

}
