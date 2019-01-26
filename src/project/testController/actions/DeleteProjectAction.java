package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.testController.ApplicationSession;
import project.testController.model.Database;
import project.testController.model.Reading;

public class DeleteProjectAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteProjectAction() {
		super("3", "Delete Project");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String ID = keyboard.getString("ID: ");
		Reading reading = db.getReadingByID(ID);
		if (reading == null) {
			System.out.println("Reading does not exist ! !");
			return;
		} else {
			reading.delete(ID, name);

		}
	}
}
