package project.testController.model;

import java.io.Serializable;

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ID;
	private String name;
	private String description;

	public Project(String ID, String name, String description) {
		this.ID = ID;
		this.name = name;
		this.description = description;
	}

	public boolean hasID(String ID2) {
		return ID.equals(ID2);
	}

	@Override
	public String toString() {
		return " | Project ID:  " + ID + "| Name: " + name + "| Description: "
				+ description + " | ";
	}

	public void edit(String name2, String description2) {
		name = name2;
		description = description2;
	}

}
