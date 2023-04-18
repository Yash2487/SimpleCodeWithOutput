package com.clone;

/*Q. Suppose u have class Address with properties like street name, city name 
 * and another class Employee with two properties name and reference variable of Address class. 
 * Now make Employee class immutable but u cannot change anything in address class. 
 * How will u achieve that? 
 */
public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee employee = new Employee("yash", new Address("rammandir", "pune"));
		Address address = employee.getAddress();
		System.out.println(address);
		address.setStreetName("ambegaon-Pathar");
		address.setCityName("pune");
		System.out.println(employee.getAddress());
	}

}
