/**
 * 
 */
package fr.mycaverne.domain;

import java.math.BigInteger;

/**
 * @author TRAORE
 *
 */
public class User {
	
	private BigInteger id;
	
	private String firstName;
	
	private String lastName;
	
	private String login;
	
	private String password;
	
	private String avatar;
	
	private String mail;
	
	private String tel;
	
	private String country;
	
	private String status;
	
	private String address;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
