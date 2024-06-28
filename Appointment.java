package moduleFiveAssignment;

import java.util.Calendar;
import java.util.Date;

public class Appointment {
	
	String appointmentId;
	Date date;
	String description;
	
	public Appointment(String appointmentId, Date date, String description) {
		
		this.appointmentId = appointmentId;
		
		if (date == null) {
			this.date = new Date(2024, Calendar.JANUARY, 1);
		} else if (date.before(new Date())) {
			throw new IllegalArgumentException("Appointment cannot be a previous date.");
		} else {
			this.date = date;
		}
		
		if (description.isEmpty() || description == null) {
			this.description = "NULL";
		} else if (description.length() > 50) {
			this.description = description.substring(0, 50);
		} else {
			this.description = description;
		}
	}
	
	public String getAppointmentId() {
		return appointmentId;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		if (date == null) {
			date = new Date(2024, Calendar.JANUARY, 1);
		} else if (date.before(new Date())) {
			throw new IllegalArgumentException("Appointment cannot be a previous date.");
		} else {
			this.date = date;
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		if (description.isEmpty() || description == null) {
			this.description = "NULL";
		} else if (description.length() > 50) {
			this.description = description.substring(0, 50);
		} else {
			this.description = description;
		}
	}
}
