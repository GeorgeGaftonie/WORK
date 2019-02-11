package project.testController.actions;

import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Project;
import project.testController.model.Status;

public class ViewProjectAction extends MenuItem {

	public ViewProjectAction() {
		super("5", "View Projects");
	}

	@Override
	public void doAction() {
		Database database = ApplicationSession.getInstance().getDatabase();
		for (Project project : database.getProject())

		{
			System.out.println(project + "" + Status.UNTESTED);
		}
	}

}
