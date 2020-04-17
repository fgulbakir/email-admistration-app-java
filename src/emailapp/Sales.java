package emailapp;

import Interface.IDepartment;

public class Sales implements IDepartment {

	public String departmentType() {
		
		return DepartmentTypes.SALES.name();
	}
}
