
package hasa;

public class Address {
	private String houseName;
	private String city;
	private String state;
    public Address() {
		
	} 
	public Address(String houseName, String city, String state) {

		this.houseName = houseName;
		this.city = city;
		this.state = state;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", city=" + city + ", state=" + state + "]";
	}
	
}