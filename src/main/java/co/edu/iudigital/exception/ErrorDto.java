package co.edu.iudigital.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ErrorDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String error;

	private String message;

	private int status;

	private LocalDateTime date;

	public static ErrorDto getErrorDto(String error, String message, int status) {
		ErrorDto errorDto = new ErrorDto();
		errorDto.setError(error);
		errorDto.setMessage(message);
		errorDto.setStatus(status);
		errorDto.setDate(LocalDateTime.now());
		return errorDto;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
