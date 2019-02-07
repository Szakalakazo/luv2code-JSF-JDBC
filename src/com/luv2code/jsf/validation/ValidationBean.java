package com.luv2code.jsf.validation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class ValidationBean {

	private String firstName;
	private String lastName;
	private String postalCode;
	private String phoneNumber;
	private String courseCode;
	private int freePasses;

	public ValidationBean() {

	}

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

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void validateTheCourseCode(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		if (value == null) {
			return;
		}

		String data = value.toString();

		// Course code must start with LUV
		if (!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage("Course code must start with LUV");

			throw new ValidatorException(message);
		}
	}
}
