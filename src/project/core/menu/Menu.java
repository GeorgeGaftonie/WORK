package project.core.menu;

import java.util.ArrayList;
import java.util.List;

import project.core.keyboard.Keyboard;

public class Menu extends MenuItem {
	Keyboard keyboard = Keyboard.getInstance();
	private List<MenuItem> items = new ArrayList<>();
	private MenuItem backAction;

	public Menu(String key, String name) {
		super(key, name);
	}

	public Menu() {
		super(null, null);
	}

	@Override
	public void doAction() {
		while (true) {
			showMenu();
			String option = keyboard.getText();
			MenuItem item = getMenuItemForOption(option);
			if (item == backAction) {
				return;
			}

			if (item != null) {
				item.doAction();
			} else {
				System.out.println("Invalid option!");
			}
		}
	}

	private MenuItem getMenuItemForOption(String option) {
		for (MenuItem item : items) {
			if (item.hasOption(option)) {
				return item;
			}
		}
		return null;
	}

	private void showMenu() {
		System.out.println("Menu " + name);
		for (MenuItem item : items) {
			System.out.println(item);
		}
		System.out.print("Introduceti optiunea: ");
	}

	public void addItem(MenuItem item) {
		for (MenuItem mi : items) {
			if (mi.getKey().equals(item.getKey())) {
				throw new RuntimeException(
						"Two submenus with the same key!!! (" + item + "<->"
								+ mi + ")");
			}
		}
		items.add(item);
	}

	public void setBackAction(MenuItem item) {
		backAction = item;
	}
}
