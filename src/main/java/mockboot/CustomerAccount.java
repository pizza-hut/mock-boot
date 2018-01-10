package mockboot;

import java.util.Date;

public class CustomerAccount {
	private String salutation;
    private String firstName;
    private String lastName;
    private Date personBirthDate; 
    private String personEmail;
    private String personHomePhone;
    private String personMobilePhone;
    private String personOtherPhone;
    private String phone;
    private String personTitle;
    
    public CustomerAccount() {
    	
    }
    
    public CustomerAccount(String salutation, String firstName, String lastName, Date personBirthDate,
    		String personEmail, String personHomePhone, String personOtherPhone, String phone,
    		String personTitle) {
    	this.setSalutation(salutation);
    	this.firstName = firstName;
    	this.setLastName(lastName);
    	this.setPersonBirthDate(personBirthDate);
    	this.setPersonEmail(personEmail);
    	this.setPersonHomePhone(personHomePhone);
    	this.setPersonOtherPhone(personOtherPhone);
    	this.setPhone(phone);
    	this.setPersonTitle(personTitle);
    }

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
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

	public Date getPersonBirthDate() {
		return personBirthDate;
	}

	public void setPersonBirthDate(Date personBirthDate) {
		this.personBirthDate = personBirthDate;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public String getPersonHomePhone() {
		return personHomePhone;
	}

	public void setPersonHomePhone(String personHomePhone) {
		this.personHomePhone = personHomePhone;
	}

	public String getPersonMobilePhone() {
		return personMobilePhone;
	}

	public void setPersonMobilePhone(String personMobilePhone) {
		this.personMobilePhone = personMobilePhone;
	}

	public String getPersonOtherPhone() {
		return personOtherPhone;
	}

	public void setPersonOtherPhone(String personOtherPhone) {
		this.personOtherPhone = personOtherPhone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPersonTitle() {
		return personTitle;
	}

	public void setPersonTitle(String personTitle) {
		this.personTitle = personTitle;
	}

}
