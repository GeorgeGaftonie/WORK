package project.testController.model;

public enum Status {
	UNTESTED("1"), PASSED("2"), FAILED("3");

	private String statusEnum;

	private Status(String statusEnum) {
		this.statusEnum = statusEnum;
	}

	// Status PASS = Status.valueOf("1");
	// Status FAIL = Status.valueOf("2");
	// Status UNT = Status.valueOf("3");

}
