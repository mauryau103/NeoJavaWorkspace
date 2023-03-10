package customexceptions;

public class NegativeAgeException extends Exception{

	private String description;
	
	public NegativeAgeException() {
			description="age is -ve";
	}
	public NegativeAgeException(String description) {
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