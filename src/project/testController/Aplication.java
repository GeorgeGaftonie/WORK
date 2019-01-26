package project.testController;

import project.core.menu.BackAction;
import project.core.menu.DeleteAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.testController.actions.AddProjectAction;
import project.testController.actions.AddTestCaseAction;
import project.testController.actions.ChangeStatusTestCaseAction;
import project.testController.actions.DeleteProjectAction;
import project.testController.actions.DeleteTestCaseAction;
import project.testController.actions.EditProjectAction;
import project.testController.actions.EditTestCaseAction;
import project.testController.actions.TestRaport;
import project.testController.actions.ViewProjectAction;

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
		MenuItem add = new AddProjectAction();
		MenuItem edit = new EditProjectAction();
		MenuItem testraport = new TestRaport();
		MenuItem changestatus = new ChangeStatusTestCaseAction();
		MenuItem viewproject = new ViewProjectAction();
		MenuItem deleteproject = new DeleteProjectAction();
		MenuItem addtestcase = new AddTestCaseAction();
		MenuItem edittestcase = new EditTestCaseAction();
		MenuItem deletetestcase = new DeleteTestCaseAction();

		BackAction back = new BackAction("0", "Back");
		BackAction exit = new BackAction("0", "Exit");
		DeleteAction delete = new DeleteAction("3", "Delete");

		Menu managementProject = new Menu("1", "Management Project");
		managementProject.addItem(add);
		managementProject.addItem(edit);
		managementProject.addItem(deleteproject);
		managementProject.addItem(testraport);
		managementProject.addItem(viewproject);
		managementProject.addItem(back);
		managementProject.setBackAction(back);

		Menu managementTestCase = new Menu("2", "Management Test Case");
		managementTestCase.addItem(addtestcase);
		managementTestCase.addItem(edittestcase);
		managementTestCase.addItem(deletetestcase);
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
