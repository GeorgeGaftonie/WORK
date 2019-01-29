package project.testController.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.testController.ApplicationSession;
import project.testController.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Project> readings = new ArrayList<Project>();

	@Override
	public void addReading(Project reading) {
		readings.add(reading);
		Serializer serializer = ApplicationSession.getInstance()
				.getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Project> getReadings() {
		return readings;
	}

	@Override
	public Project getReadingByID(String iD) {
		for (Project reading : readings) {
			return reading;
		}
		return null;
	}

	@Override
	public void editProject(String ID, String name, String description) {
		Project reading = getReadingByID(ID);
		reading.edit(name, description);
		Serializer serializer = ApplicationSession.getInstance()
				.getSerializer();
	}

}
