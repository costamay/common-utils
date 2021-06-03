package com.kcbgroup.common.models.redis;

public class KeyType {
	private String businessKey;
	private String businessKeyType;
	private String businessKeyName;

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getBusinessKeyType() {
		return businessKeyType;
	}

	public void setBusinessKeyType(String businessKeyType) {
		this.businessKeyType = businessKeyType;
	}
	
	public String getBusinessKeyName() {
		return businessKeyName;
	}
	
	public void setBusinessKeyName(String businessKeyName) {
		this.businessKeyName = businessKeyName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [bussinesKey=");
		builder.append(businessKey);
		builder.append(", businessKeyType=");
		builder.append(businessKeyType);	
		builder.append(", businessKeyName=");
		builder.append(businessKeyName);	
		builder.append("]");
		return builder.toString();
	}
}
