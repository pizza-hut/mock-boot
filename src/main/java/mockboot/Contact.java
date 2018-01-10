package mockboot;

//import java.util.Date;

public class Contact {
	
	private String sourceSystem;
	private String externalKey;
	private CustomerAccount customerAccount;
	
	public Contact(String sourceSystem, String externalKey, CustomerAccount customerAccount) {
		this.sourceSystem = sourceSystem;
		this.externalKey = externalKey;
		this.setCustomerAccount(customerAccount);
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public String getexternalKey() {
		return this.externalKey;
	}

	public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
	
}
