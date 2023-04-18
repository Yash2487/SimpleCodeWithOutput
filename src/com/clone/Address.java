package com.clone;

//Suppose u have class Address with properties like street name, city name
public class Address implements Cloneable {

	public String streetName;
	public String cityName;

	public Address(String streetName, String cityName) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	// create clone() method
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + "]";
	}

}
