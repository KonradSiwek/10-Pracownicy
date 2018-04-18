package hr;

import java.time.LocalDate;

public class Employee {
private int id;
private String firstName;
private String lastName;
private String jobTitle;
private int salary;
private String departmentName;
private String address;
private String postalCode;
private String city;
private String country;
private LocalDate hireDate;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public Employee() {
	
}
public Employee(int id, String firstName, String lastName, String jobTitle, int salary, String departmentName,
		String address, String postalCode, String city, String country, LocalDate hireDate) {

	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.jobTitle = jobTitle;
	this.salary = salary;
	this.departmentName = departmentName;
	this.address = address;
	this.postalCode = postalCode;
	this.city = city;
	this.country = country;
	this.hireDate = hireDate;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", jobTitle=" + jobTitle
			+ ", salary=" + salary + ", departmentName=" + departmentName + ", address=" + address + ", postalCode="
			+ postalCode + ", city=" + city + ", country=" + country + "]";
}


}
