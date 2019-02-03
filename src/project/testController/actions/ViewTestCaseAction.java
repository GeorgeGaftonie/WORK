package project.testController.actions;

import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Testcase;

public class ViewTestCaseAction extends MenuItem {

	public ViewTestCaseAction() {
		super("5", "View Testcase");

	}

	@Override
	public void doAction() {
		Database database = ApplicationSession.getInstance().getDatabase();
		for (Testcase testcases : database.getTestCase())

		{
			System.out.println(testcases);
		}

	}
}
