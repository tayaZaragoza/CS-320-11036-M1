package moduleFiveAssignment;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {

	@Test
	@DisplayName("The appointment service shall be able to add appointments with a unique appointment ID.")
	void testAddAppointment(String appointmentId, String[] appointmentList) {
		AppointmentService appointment = new AppointmentService();
		appointment.addAppointment("AppointmentId", Date(2024, Calendar.JANUARY, 1), "Description");
		for (int i = 0; i < appointmentList.length; i++) {
	        if (appointmentId == appointmentList[i]) {
	            fail("Appointment Id is not unique.");
	        }
	    }
		assertNotNull(appointment.getAppointment("AppointmentId"));
	}
	
	@Test
	@DisplayName("The appointment service shall be able to delete appointments per appointment ID.")
	void testDeleteAppointment() {
		AppointmentService appointment = new AppointmentService();
		appointment.addAppointment("AppointmentId", Date(2024, Calendar.JANUARY, 1), "Description");
		appointment.deleteAppointment("AppointmentId");
		ArrayList<Appointment> appointmentListEmpty = new ArrayList<Appointment>();
		assertEquals(appointment.appointmentList, appointmentListEmpty);
	}
}
