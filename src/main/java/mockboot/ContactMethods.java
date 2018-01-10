package mockboot;

import java.util.ArrayList;

public class ContactMethods {
	private String sourceSystem;
	private String externalKey;
	private ArrayList<Email> emails;
	private ArrayList<Phone> phones;
	private ArrayList<Address> addresses;
	
	public ContactMethods(String sourceSystem, String externalKey) {
		// TODO Auto-generated constructor stub
		this.setSourceSystem(sourceSystem);
		this.setExternalKey(externalKey);
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getExternalKey() {
		return externalKey;
	}
	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}
	public ArrayList<Email> getEmails() {
		return emails;
	}
	public void setEmails(ArrayList<Email> emails) {
		this.emails = emails;
	}
	public ArrayList<Phone> getPhones() {
		return phones;
	}
	public void setPhones(ArrayList<Phone> phones) {
		this.phones = phones;
	}
	public ArrayList<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}
	
}
