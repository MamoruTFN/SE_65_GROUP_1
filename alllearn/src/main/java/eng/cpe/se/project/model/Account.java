package eng.cpe.se.project.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;



// Generated Mar 5, 2023, 12:22:12 AM by Hibernate Tools 5.6.3.Final

/**
 * Account generated by hbm2java
 */

public class Account implements java.io.Serializable {

	private int accountId;
	private String email;
	
	private String password;
	
	
	private String title;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	@JsonIgnore
	private Staff staff;
	@JsonIgnore
	private User user;

	public Account() {
	}

	public Account(String email, String password, String title, String firstName, String lastName, String phoneNumber) {
		this.email = email;
		this.password = password;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public Account(String email, String password, String title, String firstName, String lastName, String phoneNumber,
			Staff staff, User user) {
		this.email = email;
		this.password = password;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.staff = staff;
		this.user = user;
	}
	
	public void clone(Account otherAccount) {
		this.email = otherAccount.email;
		this.password = otherAccount.password;
		this.title = otherAccount.title;
		this.firstName = otherAccount.firstName;
		this.lastName = otherAccount.lastName;
		this.phoneNumber = otherAccount.phoneNumber;
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
