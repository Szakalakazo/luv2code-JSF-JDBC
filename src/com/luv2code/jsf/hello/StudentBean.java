package com.luv2code.jsf.hello;

import java.util.*;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentBean {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] favoriteTextEditors;
	List<String> countryOptions;


	// create no-args constructor

	
	public StudentBean() {
		countryOptions = new ArrayList<>();
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("Poland");
		countryOptions.add("UK");
		firstName = "Mery";
		lastName = "Poppins";
		favoriteLanguage = "Java";
				
	}
	
	public String[] getFavoriteTextEditors() {
		return favoriteTextEditors;
	}
	
	public void setFavoriteTextEditors(String[] favoriteTextEditors) {
		this.favoriteTextEditors = favoriteTextEditors;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
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
