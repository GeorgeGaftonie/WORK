package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Project;

public class AddProjectAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddProjectAction() {
		super("1", "Add Project");
	}

	@Override
	public void doAction() {
		String ID = keyboard.getString("Add ID: ");
		String name = keyboard.getString("Add name: ");
		String description = keyboard.getString("Add description: ");

		Project project = new Project(ID, name, description);
		ApplicationSession.getInstance().getDatabase().addProject(project);

	}

}
