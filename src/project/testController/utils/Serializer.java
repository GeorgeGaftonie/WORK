package project.testController.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import project.testController.model.Database;
import project.testController.model.FileDatabase;

public class Serializer {
	private static final String FILE_DATABASE = "ProjectDB.ser";

	public void save(Database database) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(FILE_DATABASE));
			oos.writeObject(database);
			oos.close();
		} catch (IOException e) {
			System.out.println("Could not save database to file. "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

	public Database load() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					new File(FILE_DATABASE)));
			Database db = (Database) ois.readObject();
			ois.close();
			return db;
		} catch (FileNotFoundException e) {
			System.out
					.println("Database file does not exist. Probably you are running the application for the first time.");
			return new FileDatabase();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Could not load database file. "
					+ e.getMessage());
			return null;
		}
	}
}
