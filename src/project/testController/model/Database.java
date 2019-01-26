package project.testController.model;

import java.util.List;

public interface Database {
	void addReading(Reading reading);

	List<Reading> getReadings();

	Reading getReadingByID(String iD);

	void editProject(String iD, String name, String description);

}
