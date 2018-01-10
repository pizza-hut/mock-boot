package mockboot;

import java.sql.Date;
import java.util.ArrayList;

public class MockService {
	
	private RandomGenerator randomGenerator;	
		
	public Contact getContactDetails(String sourceSystem, String externalKey) {
		randomGenerator = new RandomGenerator();
		Contact contact = new Contact(sourceSystem, externalKey, null);
		CustomerAccount customerAccount = new CustomerAccount();
		customerAccount.setSalutation(randomGenerator.getRandomString(3));
		customerAccount.setFirstName(randomGenerator.getRandomString(10));
		customerAccount.setLastName(randomGenerator.getRandomString(10));
		customerAccount.setPersonEmail(customerAccount.getFirstName()+"."+customerAccount.getLastName()+"@"+"gmail.com");
		customerAccount.setPersonHomePhone(randomGenerator.getRandomInteger(999999999).toString());
		customerAccount.setPersonMobilePhone(randomGenerator.getRandomInteger(999999999).toString());
		customerAccount.setPersonTitle(randomGenerator.getRandomString(3));
		contact.setCustomerAccount(customerAccount);		
		return contact;
	}

	public ContactMethods getContactMethods(String sourceSystem, String externalKey) {
		randomGenerator = new RandomGenerator();
		ContactMethods contactMethods = new ContactMethods(sourceSystem, externalKey);
		
		ArrayList<Email> emails = new ArrayList<Email>();
		int noOfEmailsToSet = randomGenerator.getRandomInteger(10);
		
		for (int i=0; i<noOfEmailsToSet; i++) {		
			Email email = new Email();
			email.setAnswer_back__c(randomGenerator.getRandomString(3));
			email.setContact_instructions__c(randomGenerator.getRandomString(25));
			email.setContact_method_subtype__c(randomGenerator.getRandomString(3));
			email.setContact_method_type__c(randomGenerator.getRandomString(3));
			email.setEmail__c(randomGenerator.getRandomString(5)+"@gmail.com");
			email.setExternalKey(externalKey);			
			emails.add(email);
			contactMethods.setEmails(emails);		
		}
		
		ArrayList<Address> addresses = new ArrayList<Address>();
		Address address = new Address();
		
		int noOfAddressesToSet = randomGenerator.getRandomInteger(5);
		for (int i=0; i<noOfAddressesToSet; i++) {
			address.setAddress__c(randomGenerator.getRandomString(20));
			address.setAddress_code__c(randomGenerator.getRandomInteger(99999).toString());
			addresses.add(address);	
		}		
		contactMethods.setAddresses(addresses);		
		return contactMethods;
	}

	public PolicyReference getPolicyReference(String sourceSystem, String externalKey) {
		PolicyReference policyReference = new PolicyReference(sourceSystem, externalKey, null);
		//hardcoding taking place
		PolicyDetails policyDetails = new PolicyDetails();
		randomGenerator = new RandomGenerator();
		policyDetails.setAgent_code__c(randomGenerator.getRandomString(10));
		policyDetails.setBasic_plan_code__c(randomGenerator.getRandomString(10));
		policyDetails.setBasic_plan_name__c(randomGenerator.getRandomString(20));
		policyDetails.setPayment_mode__c(randomGenerator.getRandomString(3));
		policyDetails.setPayment_date__c(Date.valueOf("2017-12-12"));
		policyDetails.setPayment_due_date__c(Date.valueOf("2017-12-12"));
		policyDetails.setpolicy_number__c(randomGenerator.getRandomString(10));
		policyReference.setPolicyDetails(policyDetails);
				
		return policyReference;		
	}
}
