package com.clone;

//another class Employee with two properties name and reference variable of Address class
public final class Employee {
	private final String empName;
	private final Address address;

	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}

}
