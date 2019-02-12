package project.testController.actions;

import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Testcase;

public class TestRaport extends MenuItem {

	public TestRaport() {
		super("4", "TestRaport");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		Database database = ApplicationSession.getInstance().getDatabase();
		for (Testcase testcase : database.getTestCase()) {
			System.out
					.println("-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(testcase);

		}
	}
}
