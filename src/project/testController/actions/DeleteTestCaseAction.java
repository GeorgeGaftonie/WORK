package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Testcase;

public class DeleteTestCaseAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteTestCaseAction() {
		super("3", "Delete Test Case");

	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String ID = keyboard.getString("ID: ");
		Testcase testcase = db.getTestCaseByID(ID);
		if (testcase == null) {
			System.out.println("Reading does not exist ! !");
			return;

		}
		ApplicationSession.getInstance().getDatabase().deleteTestCase(ID);
	}

}
