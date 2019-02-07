package com.luv2code.jsf.tour;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {

	private String typeOfTour;

	public TourBean() {
	}

	public String getTypeOfTour() {
		return typeOfTour;
	}

	public void setTypeOfTour(String typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public String startTheTour() {
		if (typeOfTour != null && typeOfTour.equals("City")) {
			return "city-tour";
		} else
			return "country-tour";
	}
}
