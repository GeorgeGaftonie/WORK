package project.testController;

import project.core.menu.BackAction;
import project.core.menu.DeleteAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.testController.actions.AddAction;
import project.testController.actions.ChangeStatusRaport;
import project.testController.actions.EditAction;
import project.testController.actions.TestRaport;

public class Aplication {
	public static void main(String[] args) {
		Aplication app = new Aplication();
		app.run();
	}

	private void run() {
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem add = new AddAction();
		MenuItem edit = new EditAction();
		MenuItem testraport = new TestRaport();
		MenuItem changestatus = new ChangeStatusRaport();

		BackAction back = new BackAction("0", "Back");
		BackAction exit = new BackAction("0", "Exit");
		DeleteAction delete = new DeleteAction("3", "Delete");

		Menu managementProject = new Menu("1", "Management Project");
		managementProject.addItem(add);
		managementProject.addItem(edit);
		managementProject.addItem(delete);
		managementProject.addItem(testraport);
		managementProject.addItem(back);
		managementProject.setBackAction(back);

		Menu managementTestCase = new Menu("2", "Management Test Case");
		managementTestCase.addItem(add);
		managementTestCase.addItem(edit);
		managementTestCase.addItem(delete);
		managementTestCase.addItem(changestatus);
		managementTestCase.addItem(back);
		managementTestCase.setBackAction(back);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(managementProject);
		mainMenu.addItem(managementTestCase);
		mainMenu.addItem(exit);
		mainMenu.setBackAction(exit);
		return mainMenu;
	}
}
