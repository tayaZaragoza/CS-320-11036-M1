package moduleFiveAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;

public class AppointmentTest {
	
	private Date Date(int i, int january, int j) {
		return null;
	}
	
	@Test
	@DisplayName("The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters.")
	void testAppointmentIdLength() {
		Appointment appointment = new Appointment("AppointmentId", Date(2024, Calendar.JANUARY, 1), "Description");
		if (appointment.getAppointmentId().length() > 10) {
			fail("Appointment Id longer than 10 characters.");
		}
		if (appointment.getAppointmentId().length() == 10) {
        	assertTrue(true);
        }
        if (appointment.getAppointmentId().length() < 10) {
        	assertTrue(true);
        }
	}
	
	@Test
	@DisplayName("The appointment Date field cannot be in the past.")
	void testDateCurrent() {
		Appointment appointment = new Appointment("AppointmentId", Date(2024, Calendar.JANUARY, 1), "Description");
		if (appointment.getDate().before(new Date())) {
			fail("Appointment date is a previous date.");
		}
	}

	@Test
	@DisplayName("The appointment object shall have a required description String field that cannot be longer than 50 characters.")
	void testDescriptionLength() {
		Appointment appointment = new Appointment("AppointmentId", Date(2024, Calendar.JANUARY, 1), "Description."); 
		if (appointment.getDescription().length() > 50) {
			fail("Appointment description longer than 50 characters.");
		}
	}

	@Test
	@DisplayName("The appointment ID shall not be null.")
	void testAppointmentIdNull() {
		Appointment appointment = new Appointment(null, Date(2024, Calendar.JANUARY, 1), "Description");
		assertNotNull(appointment.getAppointmentId(), "AppointmentId was null.");
	}
	
	@Test
	@DisplayName("The appointment date shall not be null.")
	void testDateNull() {
		Appointment appointment = new Appointment("AppointmentId", null, "Description");
		assertNotNull(appointment.getDate(), "Appointment date was null.");
	}
	
	@Test
	@DisplayName("The description field shall not be null.")
	void testDescriptionNull() {
		Appointment appointment = new Appointment("AppointmentId", Date(2024, Calendar.JANUARY, 1), null);
		assertNotNull(appointment.getDescription(), "Description was null.");
	}
	
	
}
