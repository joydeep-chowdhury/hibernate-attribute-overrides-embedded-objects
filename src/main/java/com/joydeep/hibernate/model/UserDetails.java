package com.joydeep.hibernate.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
	@EmbeddedId
	private LoginName userId;
	private String userName;
	private Date joinedDate;
	private String description;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="HOME_STREET_NAME")),
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY_NAME")),
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE_NAME")),
	@AttributeOverride(name="pincode",column=@Column(name="HOME_PIN_CODE"))
	})
	private Address homeAddress;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET_NAME")),
	@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY_NAME")),
	@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE_NAME")),
	@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PIN_CODE"))
	})
    private Address officeAddress;
	public UserDetails() {
	}
	public UserDetails(LoginName userId, String userName, Date joinedDate, String description, Address homeAddress,
			Address officeAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.joinedDate = joinedDate;
		this.description = description;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	public LoginName getUserId() {
		return userId;
	}
	public void setUserId(LoginName userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", joinedDate=" + joinedDate
				+ ", description=" + description + ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress
				+ "]";
	}
	

	
	

}
