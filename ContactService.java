package module3Assignment;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<Contact> contacts;
	
	public void contactService() {
		contacts = new ArrayList<>();
	}
	
	public boolean addContact(Contact contact) {
        boolean duplicateContact = false;
        for (Contact contactList : contacts) {
            if (contactList.equals(contact)) {
                duplicateContact = true;
            }
        }
        if (!duplicateContact) {
            contacts.add(contact);
            return true;
        } else {
            return false;
        }
	}
	
	public boolean deleteContact(String contactInfo) {
        for (Contact contactList : contacts) {
            if (contactList.getContactId().equals(contactInfo)) {
                contacts.remove(contactList);
                return true;
            }
        }
        //else return false
        return false;
    }
	
	public boolean updateContact(String contactID, String firstName, String lastName, String number,
            String address) {
        for (Contact contactList : contacts) {
            if (contactList.getContactId().equals(contactID)) {
                if (!firstName.equals("") && !(firstName.length() > 10)) {
                    contactList.setFirstName(firstName);
                }
                if (!lastName.equals("") && !(lastName.length() > 10)) {
                    contactList.setFirstName(lastName);
                }
                if (!number.equals("") && (number.length() == 10)) {
                    contactList.setFirstName(number);
                }
                if (!address.equals("") && !(address.length() > 30)) {
                    contactList.setFirstName(address);
                }
                return true;
            }
        }
        return false;
    }
}
