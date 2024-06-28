package module3Assignment;

public class Contact {
	
	String firstName;
	String lastName;
	String number;
	String address;	
	String contactId;
	
	public Contact(String firstName, String lastName,String number, String address, String contactId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		this.contactId = contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName() {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName() {
		this.lastName = lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber() {
		this.number = number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress() {
		this.address = address;
	}
	
	public String getContactId() {
		return contactId;
	}
	
	public void setContactId() {
		this.contactId = contactId;
	}
	
	@Override
	public String toString() {
		return contactId + " " + firstName + " " + lastName + " " + number + " " + address;
	}
}
