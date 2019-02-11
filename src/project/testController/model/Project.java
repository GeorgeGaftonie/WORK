package project.testController.model;

import java.io.Serializable;

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ID;
	private String name;
	private String description;
	private String status;

	public Project(String ID, String name, String description, String status) {
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public boolean hasID(String ID2) {
		return ID.equals(ID2);
	}

	@Override
	public String toString() {
		return " " + ID + " " + name + " " + description + " ";
	}

	public void edit(String name2, String description2) {
		name = name2;
		description = description2;
	}

	public void editStatus(String status2) {
		status = status2;
	}

	public void changeStatus(String status2) {
		status = status2;
	}

}
