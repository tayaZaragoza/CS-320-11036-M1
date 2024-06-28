package moduleFiveAssignment;

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
	
	public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

	public void addAppointment(String appointmentId, Date date, String description) {
		Appointment appointment = new Appointment(appointmentId, date, description);
		appointmentList.add(appointment);
	}

	public Appointment getAppointment(String appointmentId) {
		Appointment appointment = new Appointment(null, null, null);
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppointmentId().contentEquals(appointmentId)) {
				appointment = appointmentList.get(i);
			}
		}
		return appointment;
	}

	public void deleteAppointment(String appointmentId) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppointmentId().equals(appointmentId)) {
				appointmentList.remove(i);
				break;
			}
			if (i == appointmentList.size() - 1) {
				System.out.println("Unable to locate appointment.");
			}
		}
	}


}
