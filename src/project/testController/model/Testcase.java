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

	public Testcase(String ID, String name, String description, Status status,
			Project project) {
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.status = status;
		this.project = project;
	}

	@Override
	public String toString() {
		return " " + ID + " " + name + " " + description + " " + status + " "
				+ project;
	}

	public void edit(String name2, String description2, String status2) {

	}

	public boolean hasID(String ID2) {
		return ID.equals(ID2);
	}

}
