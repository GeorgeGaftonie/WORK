package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Project;

public class TestRaport extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public TestRaport() {
		super("4", "TestRaport");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {

		Database db = ApplicationSession.getInstance().getDatabase();
		String ID = keyboard.getString("ID: ");
		Project project = db.getProjectByID(ID);
		if (project == null) {
			System.out.println("Project does not exist ! !");
			return;
		}
		String status = keyboard.getString("New Status: ");
		db.changeStatus(ID, status);

	}

}
