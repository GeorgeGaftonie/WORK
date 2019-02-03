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
	private String status;

	public Testcase(String ID, String name, String description, String status) {
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	@Override
	public String toString() {
		return " " + ID + " " + name + " " + description + " " + status;
	}

	public void edit(String name2, String description2, String status2) {
		// TODO Auto-generated method stub

	}

	public boolean hasID(String ID2) {
		return ID.equals(ID2);
	}

}
