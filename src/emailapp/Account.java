package emailapp;

import Interface.IDepartment;

public class Account implements IDepartment {
	
	public String departmentType() {

		return DepartmentTypes.ACCOUNTING.name();
	}

}