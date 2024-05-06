package com.project.BankingSystem.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class PermanentAddress {
	@NotBlank (message="Permanent House No is required")
	@Size(max=50, message="must be lessthan 50 characters")
	private String PerHouseNo;
	@NotBlank (message="Permanent Street Name is required")
	@Size(max=50, message="must be lessthan 50 characters")
	private String PerStreet;
	@NotBlank(message="Permanent Landmark is required")
	@Size(max=50, message="must be lessthan 50 characters")
	private String PerLandmark;
	@NotBlank(message="Permanent City is required")
	@Size(max=15, message="must be lessthan 15 characters")
	private String PerCity;
	@NotBlank(message="Permanent State is required")
	@Size(max=20, message="must be lessthan 20 characters")
	private String PreState;
	@NotBlank(message="Permanent Pincode No is required")
	@Size(max=10, message="must be lessthan 10 characters")
	private String perpincode;
	
	
	public PermanentAddress() {
		super();
		
	}


	public PermanentAddress(
			@NotBlank(message = "Permanent House No is required") @Size(max = 50, message = "must be lessthan 50 characters") String perHouseNo,
			@NotBlank(message = "Permanent Street Name is required") @Size(max = 50, message = "must be lessthan 50 characters") String perStreet,
			@NotBlank(message = "Permanent Landmark is required") @Size(max = 50, message = "must be lessthan 50 characters") String perLandmark,
			@NotBlank(message = "Permanent City is required") @Size(max = 15, message = "must be lessthan 15 characters") String perCity,
			@NotBlank(message = "Permanent State is required") @Size(max = 20, message = "must be lessthan 20 characters") String preState,
			@NotBlank(message = "Permanent Pincode No is required") @Size(max = 10, message = "must be lessthan 10 characters") String perpincode) {
		super();
		PerHouseNo = perHouseNo;
		PerStreet = perStreet;
		PerLandmark = perLandmark;
		PerCity = perCity;
		PreState = preState;
		this.perpincode = perpincode;
	}


	public String getPerHouseNo() {
		return PerHouseNo;
	}


	public void setPerHouseNo(String perHouseNo) {
		PerHouseNo = perHouseNo;
	}


	public String getPerStreet() {
		return PerStreet;
	}


	public void setPerStreet(String perStreet) {
		PerStreet = perStreet;
	}


	public String getPerLandmark() {
		return PerLandmark;
	}


	public void setPerLandmark(String perLandmark) {
		PerLandmark = perLandmark;
	}


	public String getPerCity() {
		return PerCity;
	}


	public void setPerCity(String perCity) {
		PerCity = perCity;
	}


	public String getPreState() {
		return PreState;
	}


	public void setPreState(String preState) {
		PreState = preState;
	}


	public String getPerpincode() {
		return perpincode;
	}


	public void setPerpincode(String perpincode) {
		this.perpincode = perpincode;
	}


	@Override
	public String toString() {
		return "PermanentAddress [PerHouseNo=" + PerHouseNo + ", PerStreet=" + PerStreet + ", PerLandmark="
				+ PerLandmark + ", PerCity=" + PerCity + ", PreState=" + PreState + ", perpincode=" + perpincode + "]";
	}


	

	
	
	

}
