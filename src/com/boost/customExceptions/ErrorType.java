package com.boost.customExceptions;

public enum ErrorType {

	REPOSITORY_ERROR_NOTFOUND_ID(20, "The selected ID of Student could not be found"),
	REPOSITORY_ERROR_UPDATEERROR(21, "Something went wrong during the update"),
	REPOSITORY_ERROR_UPDATEERROR_ID(22, "Something went wrong during the update");

	private int code;
	private String message;

	private ErrorType() {
	}

	private ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
