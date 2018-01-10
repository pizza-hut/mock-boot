package mockboot;

//import java.util.Date;

public class Phone extends ContactMethod {
    private String phone_country_code__c;
    private String phone_extension__c;
    private String phone_number__c;
    
	public String getPhone_country_code__c() {
		return phone_country_code__c;
	}
	public void setPhone_country_code__c(String phone_country_code__c) {
		this.phone_country_code__c = phone_country_code__c;
	}
	public String getPhone_extension__c() {
		return phone_extension__c;
	}
	public void setPhone_extension__c(String phone_extension__c) {
		this.phone_extension__c = phone_extension__c;
	}
	public String getPhone_number__c() {
		return phone_number__c;
	}
	public void setPhone_number__c(String phone_number__c) {
		this.phone_number__c = phone_number__c;
	} 
}
