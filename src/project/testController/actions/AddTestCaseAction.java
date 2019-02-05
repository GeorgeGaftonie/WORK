package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Testcase;

public class AddTestCaseAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddTestCaseAction() {
		super("1", "Add Test Case");

	}

	@Override
	public void doAction() {
		String ID = keyboard.getString("ID: ");
		String name = keyboard.getString("Name: ");
		String description = keyboard.getString("Description: ");
		String status = keyboard.getString("Status Test Case: ");
		Testcase testcase = new Testcase(ID, name, description, status);
		ApplicationSession.getInstance().getDatabase().addTestCase(testcase);
	}
}
