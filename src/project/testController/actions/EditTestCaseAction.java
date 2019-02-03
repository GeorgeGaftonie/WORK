package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Testcase;

public class EditTestCaseAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditTestCaseAction() {
		super("2", "Edit Test Case");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String ID = keyboard.getString("ID: ");
		Testcase testcase = db.getTestCaseByID(ID);
		if (testcase == null) {
			System.out.println("Project does not exist ! !");
			return;

		}
		String name = keyboard.getString("New name:");
		String description = keyboard.getString("New description:");
		String status = keyboard.getString("new status");
		db.editTestCase(ID, name, description, status);
	}
}
