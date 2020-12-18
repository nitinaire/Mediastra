package com.finastra.FinastraHelp.exception;

public class ResourceNotFoundException extends Exception{
	
	private String erroMessage;

	/**
	 * @return the erroMessage
	 */
	public String getErroMessage() {
		return erroMessage;
	}

	public ResourceNotFoundException(String erroMessage) {
		super();
		this.erroMessage = erroMessage;
	}

	/**
	 * @param erroMessage the erroMessage to set
	 */
	public void setErroMessage(String erroMessage) {
		this.erroMessage = erroMessage;
	}

}
