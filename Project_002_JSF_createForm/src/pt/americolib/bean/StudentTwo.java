package pt.americolib.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {

	//ATTRIBUTES
	private String firstName;
	private String lastName;
	private String country;
	
	private List<String> countryOptions;

	//CONSTRUCTOR (no args)
	public StudentTwo() {
		//INSTANTIATE AND POPULATE LIST
		countryOptions = new ArrayList<String>();
		countryOptions.add("Portugal");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("Brazil");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");
		countryOptions.add("India");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}
}
