package com.luv2code.jsf.scopes;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ScopeBean {
	
	private int value = 0;
	
	public ScopeBean() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String increment() {
		value++;
		
		return "counter-two"; 
	}
	
	public String decrement() {
		value--;
		
		return "counter-two"; 
	}
}
