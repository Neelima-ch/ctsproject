package com.project.BankingSystem.Service;

import java.util.List;


import com.project.BankingSystem.exception.ResourceNotFoundException;
import com.project.BankingSystem.model.Bank;

public interface BankService {
	public Bank addBank(Bank bank) throws ResourceNotFoundException;
	public Bank updateBank(int bankId, Bank bank) throws ResourceNotFoundException;
	public boolean deleteBank(int bankId) throws ResourceNotFoundException;
	public Bank getBankById(int bankId) throws ResourceNotFoundException;
	
	public List<Bank> getAll();
	
	

}
