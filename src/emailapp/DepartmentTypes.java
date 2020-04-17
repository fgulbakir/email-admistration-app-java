package emailapp;

public enum DepartmentTypes {

	SALES("Sales"),
	
	DEVELOPMENT("Development"), 
	
	ACCOUNTING("Account");

	private final String name;

	private DepartmentTypes(String s) {

		name = s;
	}

	public boolean equalsName(String otherName) {

		return name.equals(otherName);
	}

	@Override
	public String toString() {

		return this.name;
	}

}
