package project.testController.model;

import java.util.List;

import project.testController.utils.Serializer;

public interface Database {

	List<Project> getProject();

	void addProject(Project project);

	Project getProjectByID(String iD);

	void editProject(String iD, String name, String description);

	void deleteProject(String ID);

	List<Testcase> getTestCase();

	void addTestCase(Testcase testcase);

	Testcase getTestCaseByID(String ID);

	void editTestCase(String iD, String name, String description, String status);

	void deleteTestCase(String ID);

	void changeStatus(String iD, String name, String description, String status);

	Serializer getProjectByID();

	// deleteProject(String id);
	// addTestCase(String projectId, TestCase testCase); (Status -> enum)

	// editTestCase (String id, String name, String desc, String precondition,
	// String action, String expected, Status status)
	// deleteTestCase(String id)
	// changeStatus(String id, Status newStatus)
	// List<TestCase> getTestCasesByProject(String projectId)
}
