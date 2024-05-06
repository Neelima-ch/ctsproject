package com.project.BankingSystem.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BankingSystem.Repository.BankRepository;
import com.project.BankingSystem.exception.ResourceNotFoundException;
import com.project.BankingSystem.model.Bank;

@Service
public class BankServiceImpl implements BankService{
	@Autowired
	BankRepository bankRepository;

	@Override
	public Bank addBank(Bank bank) {
		// TODO Auto-generated method stub
		
		if(bank.getBankName()==null)
			throw new  ResourceNotFoundException("incorrect data");
		
		
		
		
		
	
		return bankRepository.save(bank);
	}

	@Override
	public Bank updateBank(int bankId, Bank bank) {
		
		// TODO Auto-generated method stub
		String m="invalid update";
		Bank bank1=bankRepository.findById(bankId).orElseThrow(()-> new ResourceNotFoundException(m));
		
		bank1.setBankName(bank.getBankName());
		bank1.setAccountNumber(bank.getAccountNumber());
		bank1.setDepositAmount(bank.getDepositAmount());
		bank1.setWithdrawAmount(bank.getWithdrawAmount());
		bank1.setBalanceAmount(bank.getBalanceAmount());
		
		bank1.setNotes(bank.getNotes());
		
		
		return bankRepository.save(bank1);
		
	}

	@Override
	public boolean deleteBank(int bankId) {
		bankRepository.findById(bankId).orElseThrow(()-> new ResourceNotFoundException("invalid delete"));
		bankRepository.deleteById(bankId);
		System.out.println("the delete is :"+bankId);
		return true;
	}

	@Override
	public Bank getBankById(int bankId) {
		// TODO Auto-generated method stub
		bankRepository.findById(bankId).orElseThrow(
				()
				      ->new ResourceNotFoundException("invalid view"));
		return bankRepository.findById(bankId).get();
	    
		
		
	}

	
	
	@Override
	public List<Bank> getAll() {
		// TODO Auto-generated method stub
		
		return bankRepository.findAll();
	}

}
