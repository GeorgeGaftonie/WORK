package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Project;
import project.testController.model.Status;
import project.testController.model.Testcase;

public class TestRaport extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public TestRaport() {
		super("4", "TestRaport");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		String id = keyboard.getString("Add ID: ");

		Database database = ApplicationSession.getInstance().getDatabase();
		Project project = database.getProjectByID(id);
		int passed = 0;
		int failed = 0;
		for (Testcase testcase : database.getTestCase()) {
			if (testcase.getProject() == project) {
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(testcase);
				if (testcase.getStatus() == Status.PASSED) {
					passed++;
				} else if (testcase.getStatus() == Status.FAILED) {
					failed++;
				}
			}
		}

		System.out.println("Passed: " + passed);
		System.out.println("Failed: " + failed);
		System.out.println("Success percent: ");
	}
}
