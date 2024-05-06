package com.project.BankingSystem.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="bank_details")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bankId;
	@NotNull(message="Please enter accountNumber")
	private int accountNumber;
	@NotBlank
	private String bankName;
	@NotNull
	private int depositAmount;
	@NotNull
	private int withdrawAmount;
	
	private int balanceAmount;
	@NotBlank
	private String notes;
	
	@Valid
	@Embedded
	PermanentAddress permanentAddress;
	@Valid
	@Embedded
	CommunicationAddress communicationAddress;
	
	public Bank () {
		super();
	}

	public Bank(int bankId, @NotNull(message = "Please enter accountNumber") int accountNumber,
			@NotBlank String bankName, @NotNull int depositAmount, @NotNull int withdrawAmount, int balanceAmount,
			@NotBlank String notes, @Valid PermanentAddress permanentAddress,
			@Valid CommunicationAddress communicationAddress) {
		super();
		this.bankId = bankId;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.depositAmount = depositAmount;
		this.withdrawAmount = withdrawAmount;
		this.balanceAmount = balanceAmount;
		this.notes = notes;
		this.permanentAddress = permanentAddress;
		this.communicationAddress = communicationAddress;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public CommunicationAddress getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAddress(CommunicationAddress communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", accountNumber=" + accountNumber + ", bankName=" + bankName
				+ ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount + ", balanceAmount="
				+ balanceAmount + ", notes=" + notes + ", permanentAddress=" + permanentAddress
				+ ", communicationAddress=" + communicationAddress + "]";
	}

	
	
	

}
