package project.testController.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		// int year = keyboard.getInt("Year: ");
		// int month = keyboard.getInt("Month: ");
		// int coldWater = keyboard.getInt("Cold water: ");
		// int hotWater = keyboard.getInt("Hot water: ");
		// do something with values
		System.out.println("Adding...");
	}

}
