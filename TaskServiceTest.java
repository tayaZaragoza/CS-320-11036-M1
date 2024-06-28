package moduleFourAssignment;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import module3Assignment.Contact;
import module3Assignment.ContactService;

public class TaskServiceTest {
	
	@Test
    public void testAddTask(String taskId, String[] taskList) {
        TaskService task = new TaskService();
        Task testTask = new Task("0123456789", "taskName", "taskDescription");
        for (int i = 0; i < taskList.length; i++) {
	        if (taskId == taskList[i]) {
	            fail("Task ID is not unique.");
	        }
	    }
        assertEquals(true, task.addTask(testTask));
    }
	
	@Test
    public void testDeleteTask() {
        TaskService task = new TaskService();

        task.addTask("0123456789", "taskName", "taskDescription");
        task.addTask("0123456780", "taskName2", "taskDescription2");
        task.addTask("0123456781", "taskName3", "taskDescription3");

        assertEquals(true, task.deleteTask("0123456789"));
        assertEquals(false, task.deleteTask("0123456780"));
        assertEquals(false, task.deleteTask("0123456781"));
    }
	
	@Test
	void testUpdateName() {
		TaskService task = new TaskService();
		task.addTask("0123456789", "taskName", "taskDescription");
		task.updateName("Updated taskName", "0123456789");
		assertEquals("Updated taskName", task.getTask("0123456789").getName());
	}
	
	@Test
	void testUpdateDescription() {
		TaskService task = new TaskService();
		task.addTask("0123456789", "taskName", "taskDescription");
		task.updateDescription("Updated taskDescription", "0123456789");
		assertEquals("Updated taskDescription", task.getTask("0123456789").getName());
	}
}
