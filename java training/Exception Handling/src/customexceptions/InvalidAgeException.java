package customexceptions;

public class InvalidAgeException extends RuntimeException {
private String description;
	
	public InvalidAgeException() {
			description="age below 18 is not valid";
	}
	public InvalidAgeException(String description) {
		this.description=description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return getClass()+":"+description; // similar to builtin exception, u can return any string as a representation of object
	}
}