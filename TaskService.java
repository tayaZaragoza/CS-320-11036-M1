package moduleFourAssignment;

import java.util.ArrayList;

public class TaskService {

	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	public void addTask(String taskId, String name, String description) {
		Task task = new Task(taskId, name, description);
		taskList.add(task);
	}
	
	public Task getTask(String taskId) {
		Task task = new Task(null, null, null);
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskId().contentEquals(taskId)) {
				task = taskList.get(i);
			}
		}
		return task;
	}
	
	public void deleteTask(String taskID) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskId().equals(taskID)) {
				taskList.remove(i);
				break;
			}
			if (i == taskList.size() - 1) {
				System.out.println("Unable to locate task.");
			}
		}
	}
	
	public void updateName(String updatedName, String taskId) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskId().equals(taskId)) {
				taskList.get(i).setName(updatedName);
				break;
			}
			if (i == taskList.size() - 1) {
				System.out.println("Unable to locate task.");
			}
		}
	}
	
	public void updateDescription(String updatedDescription, String taskId) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getTaskId().equals(taskId)) {
				taskList.get(i).setDescription(updatedDescription);
				break;
			}
			if (i == taskList.size() - 1) {
				System.out.println("Unable to locate task.");
			}
		}
	}

}
