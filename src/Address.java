
public class Address implements Comparable<Address> {
	String street;
	int pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public int compareTo(Address o) {
		return this.getPincode() - o.getPincode();
	}
	public Address(String street, int pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}
	
	
}
