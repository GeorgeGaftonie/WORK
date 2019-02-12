package project.testController.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.testController.ApplicationSession;
import project.testController.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Project> projects = new ArrayList<Project>();

	@Override
	public void addProject(Project project) {
		projects.add(project);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Project> getProject() {
		return projects;
	}

	@Override
	public Project getProjectByID(String ID) {
		for (Project project : projects) {
			if (project.hasID(ID)) {
				return project;
			}
		}
		return null;
	}

	@Override
	public void editProject(String ID, String name, String description) {
		Project project = getProjectByID(ID);
		project.edit(name, description);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
	}

	@Override
	public void deleteProject(String ID) {
		Iterator<Project> iterator = projects.iterator();
		while (iterator.hasNext()) {
			Project project = iterator.next();
			if (project.hasID(ID)) {
				iterator.remove();

			}
		}
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	private List<Testcase> testcases = new ArrayList<Testcase>();

	@Override
	public void addTestCase(Testcase testcase) {
		testcases.add(testcase);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public Testcase getTestCaseByID(String ID) {
		for (Testcase testcase : testcases) {
			if (testcase.hasID(ID)) {
				return testcase;
			}
		}
		return null;
	}

	@Override
	public void editTestCase(String ID, String name, String description) {
		Testcase testcase = getTestCaseByID(ID);
		testcase.edit(name, description);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void deleteTestCase(String ID) {
		Iterator<Testcase> iterator = testcases.iterator();
		while (iterator.hasNext()) {
			Testcase testcase = iterator.next();
			if (testcase.hasID(ID)) {
				iterator.remove();

			}
		}
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Testcase> getTestCase() {

		return testcases;
	}

	@Override
	public Serializer getProjectByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeStatus(Testcase testcase, Status statusEnum) {
		testcase.setStatus(statusEnum);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

}
