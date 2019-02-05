package project.core.keyboard;

import java.util.Scanner;

import project.testController.ApplicationSession;
import project.testController.model.Project;

public class Keyboard {
	private Scanner kb = new Scanner(System.in);

	private static Keyboard instance = new Keyboard();

	public static Keyboard getInstance() {
		return instance;
	}

	public String getText() {
		return kb.nextLine();
	}

	public int getInt(String message) {
		System.out.print(message);
		int value = kb.nextInt();
		kb.nextLine();
		return value;
	}

	public String getString(String message) {
		System.out.print(message);
		String value = kb.nextLine();
		return value;
	}

	public Project getProject(String message) {
		System.out.print(message);
		String text = kb.nextLine();
		Project project = ApplicationSession.getInstance().getDatabase().getProjectByID(text);
		return project;
	}
}
