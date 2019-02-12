package project.testController.actions;

import javax.net.ssl.SSLEngineResult.Status;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Testcase;

public class ChangeStatusTestCaseAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ChangeStatusTestCaseAction() {
		super("4", "Change Status");

	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String ID = keyboard.getString("ID: ");
		Testcase testcase = db.getTestCaseByID(ID);
		if (testcase == null) {
			System.out.println("Test Case does not exist ! !");
			return;
		}

		String s = keyboard.getString("Status: ");
		Status statusEnum = Status.valueOf(s);

		testcase.setStatus(statusEnum);

	}
}
