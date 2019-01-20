package project.testController.actions;

import project.core.menu.MenuItem;

public class EditAction extends MenuItem {
	public EditAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		System.out.println("Aici editam ceva");
	}
}
