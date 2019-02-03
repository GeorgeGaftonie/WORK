package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Project;

public class EditProjectAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditProjectAction() {
		super("2", "Edit");
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

		String name = keyboard.getString("New name:");
		String description = keyboard.getString("New description:");
		db.editProject(ID, name, description);
	}
}
