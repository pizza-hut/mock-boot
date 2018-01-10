package mockboot;

import java.util.ArrayList;

public class PolicyReferences {
	private String sourceSystem;
	private String externalKey;
	private ArrayList<PolicyReferences> policyReferences;

	public PolicyReferences(String sourceSystem, String externalKey) {
		this.setSourceSystem(sourceSystem);
		this.setExternalKey(externalKey);
	}

	public ArrayList<PolicyReferences> getPolicyReferences() {
		return policyReferences;
	}

	public void setPolicyReferences(ArrayList<PolicyReferences> policyReferences) {
		this.policyReferences = policyReferences;
	}

	public String getExternalKey() {
		return externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	
}
