package moduleFourAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
	
	@Test
	@DisplayName("The task object shall have a required unique task ID string that cannot be longer than 10 characters.")
	void testTaskIdLength() {
		Task task = new Task("TaskId", "Name", "Description");
		if (task.getTaskId().length() > 10) {
			fail("Task ID longr than 10 characters.");
		}
		if (task.getTaskId().length() == 10) {
        	assertTrue(true);
        }
        if (task.getTaskId().length() < 10) {
        	assertTrue(true);
        }
	}

	@Test
	@DisplayName("The task object shall have a required name String field that cannot be longer than 20 characters.")
	void testNameLength() {
		Task task = new Task("TaskId", "Name", "Description");
		if (task.getName().length() > 20) {
			fail("Task name longer than 20 characters.");
		}
		if (task.getName().length() == 20) {
        	assertTrue(true);
        }
        if (task.getName().length() < 20) {
        	assertTrue(true);
        }
	}

	@Test
	@DisplayName("The task object shall have a required description String field that cannot be longer than 50 characters.")
	void testDescriptionLength() {
		Task task = new Task("TaskId", "Name", "Description");
		if (task.getDescription().length() > 50) {
			fail("Task description longer than 50 characters.");
		}
		if (task.getDescription().length() == 50) {
        	assertTrue(true);
        }
        if (task.getDescription().length() < 50) {
        	assertTrue(true);
        }
	}

	@Test
	@DisplayName("The taskId field shall not be null")
	void testTaskIdNull() {
		Task task = new Task(null, "Name", "Description");
		assertNotNull(task.getTaskId(), "TaskId was null.");
	}
	
	@Test
	@DisplayName("The name field shall not be null")
	void testNameNull() {
		Task task = new Task("TaskId", null, "Description");
		assertNotNull(task.getName(), "Task name was null.");
	}
	
	@Test
	@DisplayName("The description field shall not be null")
	void testDescriptionNull() {
		Task task = new Task("TaskId", "Name", null);
		assertNotNull(task.getDescription(), "Task description was null.");
	}
}
