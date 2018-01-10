package mockboot;

import java.util.Date;

public class PolicyDetails {

	private String name;
	private String agent_code__c;
	private String basic_plan_code__c;
	private String basic_plan_name__c;
	private Date effective_date__c;
	private Date payment_date__c;
	private Date payment_due_date__c;
	private String payment_mode__c;
	private String payment_status__c;
	private String policy_status__c;		
	private String policy_number__c;
	private String policy_type__c;
	private String source_system__c;
	private Date submission_date__c;
	private String external_id__c;
	
	public PolicyDetails() {
		
	}
	
	public PolicyDetails(String name, String agent_code__c, String basic_plan_code__c, String basic_plan_name__c, 
			Date effective_date__c, Date payment_date__c, Date payment_due_date__c, String payment_mode__c, 
			String payment_status__c, String policy_status__c, String policy_number__c, String policy_type__c, 
			String source_system__c, Date submission_date__c, String external_id__c) {
		this.name = name;
		this.agent_code__c = agent_code__c;
		this.basic_plan_code__c = basic_plan_code__c;
		this.basic_plan_name__c = basic_plan_name__c;
		this.effective_date__c = effective_date__c;
		this.payment_date__c = payment_date__c;
		this.payment_due_date__c = payment_due_date__c;
		this.payment_mode__c = payment_mode__c;
		this.payment_status__c = payment_status__c;
		this.policy_status__c = policy_status__c;
		this.policy_number__c = policy_number__c;
		this.policy_type__c = policy_type__c;
		this.source_system__c = source_system__c;
		this.submission_date__c = submission_date__c;			
		this.external_id__c = external_id__c;			
	}
			
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgent_code__c() {
		return agent_code__c;
	}
	public void setAgent_code__c(String agent_code__c) {
		this.agent_code__c = agent_code__c;
	}
	public String getBasic_plan_code__c() {
		return basic_plan_code__c;
	}
	public void setBasic_plan_code__c(String basic_plan_code__c) {
		this.basic_plan_code__c = basic_plan_code__c;
	}
	public String getBasic_plan_name__c() {
		return basic_plan_name__c;
	}
	public void setBasic_plan_name__c(String basic_plan_name__c) {
		this.basic_plan_name__c = basic_plan_name__c;
	}
	public Date getEffective_date__c() {
		return effective_date__c;
	}
	public void setEffective_date__c(Date effective_date__c) {
		this.effective_date__c = effective_date__c;
	}
	public Date getPayment_due_date__c() {
		return payment_due_date__c;
	}
	public void setPayment_due_date__c(Date payment_due_date__c) {
		this.payment_due_date__c = payment_due_date__c;
	}
	public Date getPayment_date__c() {
		return payment_date__c;
	}
	public void setPayment_date__c(Date payment_date__c) {
		this.payment_date__c = payment_date__c;
	}
	public String getPayment_mode__c() {
		return payment_mode__c;
	}
	public void setPayment_mode__c(String payment_mode__c) {
		this.payment_mode__c = payment_mode__c;
	}
	public String getPayment_status__c() {
		return payment_status__c;
	}
	public void setPayment_status__c(String payment_status__c) {
		this.payment_status__c = payment_status__c;
	}
	public String getPolicy_status__c() {
		return policy_status__c;
	}
	public void setPolicy_status__c(String policy_status__c) {
		this.policy_status__c = policy_status__c;
	}
	public String getpolicy_number__c() {
		return policy_number__c;
	}
	public void setpolicy_number__c(String policy_number__c) {
		this.policy_number__c = policy_number__c;
	}
	public String getPolicy_type__c() {
		return policy_type__c;
	}
	public void setPolicy_type__c(String policy_type__c) {
		this.policy_type__c = policy_type__c;
	}
	public Date getSubmission_date__c() {
		return submission_date__c;
	}
	public void setSubmission_date__c(Date submission_date__c) {
		this.submission_date__c = submission_date__c;
	}
	public String getSource_system__c() {
		return source_system__c;
	}
	public void setSource_system__c(String source_system__c) {
		this.source_system__c = source_system__c;
	}
	public String getExternal_id__c() {
		return external_id__c;
	}
	public void setExternal_id__c(String external_id__c) {
		this.external_id__c = external_id__c;
	}		
}
