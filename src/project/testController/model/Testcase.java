package project.testController.model;

import java.io.Serializable;

public class Testcase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ID;
	private String name;
	private String description;
	private Status status;
	private Project project;

	public Testcase(String ID, String name, String description, Project project, Status status) {
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.project = project;
		this.status = status;
	}

	@Override
	public String toString() {
		return " | Test Case ID: " + ID + " " + "| Name: " + name + " " + "| Description: " + description + "| Status: "
				+ status + "| --- " + project;
	}

	public void edit(String name2, String description2) {
		name = name2;
		description = description2;
	}

	public boolean hasID(String ID2) {
		return ID.equals(ID2);
	}

	public void setStatus(Status statusEnum) {
		this.status = statusEnum;
	}

	public Project getProject() {
		return project;
	}

	public Status getStatus() {
		return status;
	}

}
