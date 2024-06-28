package moduleFourAssignment;

public class Task {
	
	String taskId;
	String name;
	String description;
	
	public Task(String taskId, String name,String description) {
		
		this.taskId = taskId;
		
		if (name.isEmpty() || name == null) {
			this.name = "NULL";
		} else if (name.length() > 20) {
			this.name = name.substring(0,20);
		} else {
			this.name = name;
		}
		
		if (description.isEmpty() || description == null) {
			this.description = "NULL";
		} else if (description.length() > 50) {
			this.description = name.substring(0,50);
		} else {
			this.description = description;
		}
		
	}
	
	public String getTaskId() {
		return taskId;
	}
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		if (name.isEmpty() || name == null) {
			this.name = "NULL";
		} else if (name.length() > 20) {
			this.name = name.substring(0,20);
		} else {
			this.name = name;
		}
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		
		if (description.isEmpty() || description == null) {
			this.description = "NULL";
		} else if (description.length() > 50) {
			this.description = name.substring(0,50);
		} else {
			this.description = description;
		}	
		
	}
	
	
	@Override
	public String toString() {
		return taskId + " " + name + " " + description;
	}
		 
}
