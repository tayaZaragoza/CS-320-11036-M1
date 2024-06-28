package module3Assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact(String contactId, String[] contactList) {
        ContactService contact = new ContactService();
        Contact testContact = new Contact("Vanessa", "Smith", "1234567890", "123 Street", "0123456");
        for (int i = 0; i < contactList.length; i++) {
	        if (contactId == contactList[i]) {
	            fail("Contact ID is not unique.");
	        }
	    }
        assertEquals(true, contact.addContact(testContact));
    }

    @Test
    public void testDeleteContact() {
        ContactService contact = new ContactService();

        Contact testContact1 = new Contact("Vanessa", "Smith", "1234567890", "123 Street", "0123456");
        Contact testContact2 = new Contact("Cassandra", "Morris", "4567890123", "456 Street", "0123457");
        Contact testContact3 = new Contact("Faith", "Williams", "7890123456", "789 Street", "0123458");

        contact.addContact(testContact1);
        contact.addContact(testContact2);
        contact.addContact(testContact3);

        assertEquals(true, contact.deleteContact("0123456"));
        assertEquals(false, contact.deleteContact("0123457"));
        assertEquals(false, contact.deleteContact("0123458"));
    }

    @Test
    public void testContactUpdate() {
        ContactService contact = new ContactService();

        Contact testContact1 = new Contact("Vanessa", "Smith", "1234567890", "123 Street", "0123456");
        Contact testContact2 = new Contact("Cassandra", "Morris", "4567890123", "456 Street", "0123457");
        Contact testContact3 = new Contact("Faith", "Williams", "7890123456", "789 Street", "0123458");

        contact.addContact(testContact1);
        contact.addContact(testContact2);
        contact.addContact(testContact3);

        assertEquals(true, contact.updateContact("Faith", "Thompson", "7890123456", "789 Street", "0123458"));
        assertEquals(false, contact.updateContact("Anna", "Williams", "7890123456", "789 Street", "0123458"));
    }

}