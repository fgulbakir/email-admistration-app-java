package emailapp;

import Interface.IDepartment;

public class Development implements IDepartment {
	
	public String departmentType() {
		
		return DepartmentTypes.DEVELOPMENT.name();
	}

}