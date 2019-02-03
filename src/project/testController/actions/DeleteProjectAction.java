package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Project;

public class DeleteProjectAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteProjectAction() {
		super("3", "Delete Project");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String ID = keyboard.getString("ID: ");
		Project project = db.getProjectByID(ID);
		if (project == null) {
			System.out.println("Reading does not exist ! !");
			return;

		}
		ApplicationSession.getInstance().getDatabase().deleteProject(ID);
	}
}
