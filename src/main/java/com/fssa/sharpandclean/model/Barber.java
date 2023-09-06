package com.fssa.sharpandclean.model;

public class Barber {
private	 int barberId;
private String barberName;
private String barberEmail;
private String barberPassword;
private String barberPhone;
private String barberExperience;
private String barberProfile;
private String barberAddress;
private String barberAbout;
private int isDeleted;



public Barber(String barberName, String barberEmail, String barberPassword, String barberPhone, String barberExperience,
		String barberProfile, String barberAddress, String barberAbout) {
	super();
	this.barberName = barberName;
	this.barberEmail = barberEmail;
	this.barberPassword = barberPassword;
	this.barberPhone = barberPhone;
	this.barberExperience = barberExperience;
	this.barberProfile = barberProfile;
	this.barberAddress = barberAddress;
	this.barberAbout = barberAbout;
}

public Barber(int barberId2, String barberName2, String barberEmail2, String barberPassword2, String barberProfile2,
		String barberPhone2, String barberAddress2, String barberAbout2, String barberExperience2) {
	super();
	this.barberId = barberId2;
	this.barberName = barberName2;
	this.barberEmail = barberEmail2;
	this.barberPassword = barberPassword2;
	this.barberPhone = barberPhone2;
	this.barberExperience = barberExperience2;
	this.barberProfile = barberProfile2;
	this.barberAddress = barberAddress2;
	this.barberAbout = barberAbout2;
}
public Barber(String barberEmail, String barberPassword) {
	
	super();
	this.barberEmail = barberEmail;
	this.barberPassword = barberPassword;
}





public String getBarberName() {
	return barberName;
}
public void setBarberName(String barberName) {
	this.barberName = barberName;
}
public String getBarberEmail() {
	return barberEmail;
}
public void setBarberEmail(String barberEmail) {
	this.barberEmail = barberEmail;
}
public String getBarberPassword() {
	return barberPassword;
}
public void setBarberPassword(String barberPassword) {
	this.barberPassword = barberPassword;
}
public String getBarberPhone() {
	return barberPhone;
}
public void setBarberPhone(String barberPhone) {
	this.barberPhone = barberPhone;
}
public String getBarberExperience() {
	return barberExperience;
}
public void setBarberExperience(String barberExperience) {
	this.barberExperience = barberExperience;
}
public String getBarberProfile() {
	return barberProfile;
}
public void setBarberProfile(String barberProfile) {
	this.barberProfile = barberProfile;
}
public String getBarberAddress() {
	return barberAddress;
}
public void setBarberAddress(String barberAddress) {
	this.barberAddress = barberAddress;
}
public String getBarberAbout() {
	return barberAbout;
}
public void setBarberAbout(String barberAbout) {
	this.barberAbout = barberAbout;
}
public int getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(int isDeleted) {
	this.isDeleted = isDeleted;
}

public int getBarberId() {
	return barberId;
}
public void setBarberId(int barberId) {
	this.barberId = barberId;
}

@Override
public String toString() {
	return "Barber [barberName=" + barberName + ", barberEmail=" + barberEmail + ", barberPassword=" + barberPassword
			+ ", barberPhone=" + barberPhone + ", barberExperience=" + barberExperience + ", barberProfile="
			+ barberProfile + ", barberAddress=" + barberAddress + ", barberAbout=" + barberAbout + ", isDeleted="
			+ isDeleted + ", type=" + ", barberId=" + barberId + ", getBarberName()=" + getBarberName()
			+ ", getBarberEmail()=" + getBarberEmail() + ", getBarberPassword()=" + getBarberPassword()
			+ ", getBarberPhone()=" + getBarberPhone() + ", getBarberExperience()=" + getBarberExperience()
			+ ", getBarberProfile()=" + getBarberProfile() + ", getBarberAddress()=" + getBarberAddress()
			+ ", getBarberAbout()=" + getBarberAbout() + ", getIsDeleted()=" + getIsDeleted() + ", getType()="
			+  ", getBarberId()=" + getBarberId() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

	
}
