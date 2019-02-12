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

	void editTestCase(String iD, String name, String description);

	void deleteTestCase(String ID);

	Serializer getProjectByID();

	// void changeStatus(String ID, Status status);

}
