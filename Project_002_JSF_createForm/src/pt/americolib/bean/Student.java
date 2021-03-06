package pt.americolib.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
	//ATTRIBUTES
	private String firstName;
	private String lastName;

	//CONSTRUCTOR (no args)
	public Student() {
		super();
	}

	//GETTERS AND SETTERS (public)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
