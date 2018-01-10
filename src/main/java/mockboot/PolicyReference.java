package mockboot;

//import java.util.Date;

public class PolicyReference {
	private String policySourceSystem;
	private String policyNumber;
	private PolicyDetails policyDetails;
	
	public PolicyReference() {
		
	}
	
	public PolicyReference(String policySourceSystem, String policyNumber, PolicyDetails policyDetails) {
		this.policySourceSystem = policySourceSystem;
		this.policyNumber = policyNumber;
		this.setPolicyDetails(policyDetails);
	}
	
	

	public String getPolicySourceSystem() {
		return policySourceSystem;
	}

	public void setPolicySourceSystem(String policySourceSystem) {
		this.policySourceSystem = policySourceSystem;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public PolicyDetails getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(PolicyDetails policyDetails) {
		this.policyDetails = policyDetails;
	}
}
