package genericdemo;

public class StackUnderFlowException extends Exception {
	 private String description;
     public StackUnderFlowException() {
		
	}
	public StackUnderFlowException(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "StackUnderFlowException [description=" + description + "]";
	}
	 
}