package com.LSS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Login {
private String LoginId;
<<<<<<< HEAD
private String Password;
private Long AuthenticationID;
=======
private String Password;	
private String Authentication;
>>>>>>> dbfb524 (added accommodator model)
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Login_Sequence")
@SequenceGenerator(name = "Login_Sequence", sequenceName = "Login_Sequence", allocationSize = 1)
private Long id ;
<<<<<<< HEAD
	public Login(String loginId, String password, Long authenticationID) {
	super();
	LoginId = loginId;
	Password = password;
	AuthenticationID = authenticationID;
=======
	public Login(String loginId, String password, String authentication) {
	super();
	LoginId = loginId;
	Password = password;
	Authentication = authentication;
>>>>>>> dbfb524 (added accommodator model)
	
}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Login [LoginId=" + LoginId + ", Password=" + Password + ", Authentication=" + AuthenticationID + ", id="
=======
		return "Login [LoginId=" + LoginId + ", Password=" + Password + ", Authentication=" + Authentication + ", id="
>>>>>>> dbfb524 (added accommodator model)
				+ id + "]";
	}
	public Login() {
		
	}
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
<<<<<<< HEAD
	public Long getAuthentication() {
		return AuthenticationID;
	}
	public void setAuthentication(Long authentication) {
		AuthenticationID = authentication;
=======
	public String getAuthentication() {
		return Authentication;
	}
	public void setAuthentication(String authentication) {
		Authentication = authentication;
>>>>>>> dbfb524 (added accommodator model)
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
