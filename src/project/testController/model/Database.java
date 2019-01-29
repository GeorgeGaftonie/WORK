package project.testController.model;

import java.util.List;

public interface Database {
	void addReading(Project reading);

	List<Project> getReadings();

	Project getReadingByID(String iD);

	void editProject(String iD, String name, String description);

	// deleteProject(String id);
	// addTestCase(String projectId, TestCase testCase); (Status -> enum)

	// editTestCase (String id, String name, String desc, String precondition,
	// String action, String expected, Status status)
	// deleteTestCase(String id)
	// changeStatus(String id, Status newStatus)
	// List<TestCase> getTestCasesByProject(String projectId)
}
