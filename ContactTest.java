package module3Assignment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    @DisplayName("The contact object shall have a required unique contact ID string that cannot be longer than 10 characters.")
    void testContactIdLength() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", "ContactId");
        if (contact.getContactId().length() > 10) {
            fail("contactId longer than 10 characters.");
        }
        if (contact.getContactId().length() == 10) {
        	assertTrue(true);
        }
        if (contact.getContactId().length() < 10) {
        	assertTrue(true);
        }
    }

    @Test
    @DisplayName("The contact object shall have a required firstName String field that cannot be longer than 10 characters.")
    void testFirstNameLength() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", "ContactId");
        if (contact.getFirstName().length() > 10) {
            fail("firstName longer than 10 characters.");
        }
        if (contact.getFirstName().length() == 10) {
        	assertTrue(true);
        }
        if (contact.getFirstName().length() < 10) {
        	assertTrue(true);
        }
    }

    @Test
    @DisplayName("The contact object shall have a required lastName String field that cannot be longer than 10 characters.")
    void testLastNameLength() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", "ContactId");
        if (contact.getLastName().length() > 10) {
            fail("lastName longer than 10 characters.");
        }
        if (contact.getLastName().length() == 10) {
        	assertTrue(true);
        }
        if (contact.getLastName().length() < 10) {
        	assertTrue(true);
        }
    }

    @Test
    @DisplayName("The contact object shall have a required phone String field that must be exactly 10 digits.")
    void testNumberLength() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", "ContactId");
        if (contact.getNumber().length() != 10) {
            fail("Number does not equal 10 characters.");
        }
        if (contact.getNumber().length() == 10) {
        	assertTrue(true);
        }
    }

    @Test
    @DisplayName("The contact object shall have a required address field that must be no longer than 30 characters.")
    void testAddressLength() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", "ContactId");
        if (contact.getAddress().length() > 30) {
            fail("Address longer than 30 characters.");
        }
        if (contact.getAddress().length() == 30) {
        	assertTrue(true);
        }
        if (contact.getAddress().length() < 30) {
        	assertTrue(true);
        }
    }
    
    @Test
    @DisplayName("The ContactId field shall not be null.")
    void testFirstNameNull() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", null);
        assertNotNull(contact.getContactId(), "ContactId was null.");
    }

    @Test
    @DisplayName("The firstName field shall not be null.")
    void testFirstNameNull() {
        Contact contact = new Contact(null, "LastName", "Number", "Address", "ContactId");
        assertNotNull(contact.getFirstName(), "First name was null.");
    }

    @Test
    @DisplayName("The lastName field shall not be null.")
    void testLastNameNull() {
        Contact contact = new Contact("FirstName", null, "Number", "Address", "ContactId");
        assertNotNull(contact.getLastName(), "Last name was null.");
    }

    @Test
    @DisplayName("The phone field shall not be null.")
    void testNumberNotNull() {
        Contact contact = new Contact("FirstName", "LastName", null, "Address", "ContactId");
        assertNotNull(contact.getNumber(), "Phone number was null.");
    }

    @Test
    @DisplayName("The address field shall not be null.")
    void testAddressNotNull() {
        Contact contact = new Contact("FirstName", "LastName", "Number", "Address", null);
        assertNotNull(contact.getAddress(), "Address was null.");
    }

}
