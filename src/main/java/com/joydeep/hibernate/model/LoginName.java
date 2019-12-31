package com.joydeep.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;

public class LoginName implements Serializable
{
   @Column(name="SSN_NUMBER")
   private String ssn;
   @Column(name="PASSPORT_ID")
   private String passportId;
   public LoginName()
   {
	   
   }
public LoginName(String ssn, String passportId) {
	super();
	this.ssn = ssn;
	this.passportId = passportId;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getPassportId() {
	return passportId;
}
public void setPassportId(String passportId) {
	this.passportId = passportId;
}
@Override
public String toString() {
	return "LoginName [ssn=" + ssn + ", passportId=" + passportId + "]";
}
   
}
