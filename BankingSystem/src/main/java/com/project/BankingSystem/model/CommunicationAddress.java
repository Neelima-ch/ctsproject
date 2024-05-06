package com.project.BankingSystem.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class CommunicationAddress{
	@NotBlank(message="Communication House No is required")
	@Size(max=50, message="must be lessthan 50 characters")
	private String ComHouseNo;
	@NotBlank (message="Communication Street Name is required")
	@Size(max=50, message="must be lessthan 50 characters")
	private String ComStreet;
	@NotBlank(message="Communication Landmark is required")
	@Size(max=50, message="must be lessthan 50 characters")
	private String ComLandmark;
	@NotBlank(message="Communication City is required")
	@Size(max=15, message="must be lessthan 15 characters")
	private String ComCity;
	@NotBlank(message="Communication State is required")
	@Size(max=20, message="must be lessthan 20 characters")
	private String ComState;
	@NotBlank(message="Communication Pincode No is required")
	private String ComPin;
	
	public CommunicationAddress(){
		super();
	
	}

	

	public CommunicationAddress(
			@NotBlank(message = "Communication House No is required") @Size(max = 50, message = "must be lessthan 50 characters") String comHouseNo,
			@NotBlank(message = "Communication Street Name is required") @Size(max = 50, message = "must be lessthan 50 characters") String comStreet,
			@NotBlank(message = "Communication Landmark is required") @Size(max = 50, message = "must be lessthan 50 characters") String comLandmark,
			@NotBlank(message = "Communication City is required") @Size(max = 15, message = "must be lessthan 15 characters") String comCity,
			@NotBlank(message = "Communication State is required") @Size(max = 20, message = "must be lessthan 20 characters") String comState,
			@NotBlank(message = "Communication Pincode No is required") String comPin) {
		super();
		ComHouseNo = comHouseNo;
		ComStreet = comStreet;
		ComLandmark = comLandmark;
		ComCity = comCity;
		ComState = comState;
		ComPin = comPin;
	}
	



	public String getComHouseNo() {
		return ComHouseNo;
	}



	public void setComHouseNo(String comHouseNo) {
		ComHouseNo = comHouseNo;
	}



	public String getComStreet() {
		return ComStreet;
	}



	public void setComStreet(String comStreet) {
		ComStreet = comStreet;
	}



	public String getComLandmark() {
		return ComLandmark;
	}



	public void setComLandmark(String comLandmark) {
		ComLandmark = comLandmark;
	}



	public String getComCity() {
		return ComCity;
	}



	public void setComCity(String comCity) {
		ComCity = comCity;
	}



	public String getComState() {
		return ComState;
	}



	public void setComState(String comState) {
		ComState = comState;
	}



	public String getComPin() {
		return ComPin;
	}



	public void setComPin(String comPin) {
		ComPin = comPin;
	}



	@Override
	public String toString() {
		return "CommunicationAddress [ComHouseNo=" + ComHouseNo + ", ComStreet=" + ComStreet + ", ComLandmark="
				+ ComLandmark + ", ComCity=" + ComCity + ", ComState=" + ComState + ", ComPin=" + ComPin + "]";
	}
	

	


	
}
