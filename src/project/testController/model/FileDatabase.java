package project.testController.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.testController.ApplicationSession;
import project.testController.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Reading> readings = new ArrayList<Reading>();

	@Override
	public void addReading(Reading reading) {
		readings.add(reading);
		Serializer serializer = ApplicationSession.getInstance()
				.getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Reading> getReadings() {
		return readings;
	}

	@Override
	public Reading getReadingByID(String iD) {
		for (Reading reading : readings) {
			return reading;
		}
		return null;
	}

	@Override
	public void editProject(String ID, String name, String description) {
		Reading reading = getReadingByID(ID);
		reading.edit(name, description);
		Serializer serializer = ApplicationSession.getInstance()
				.getSerializer();
	}

}
