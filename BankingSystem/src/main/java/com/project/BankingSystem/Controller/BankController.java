package com.project.BankingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.BankingSystem.Service.BankService;
import com.project.BankingSystem.model.Bank;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	BankService bs;
	
	@GetMapping("/get/{bankId}")
	@ResponseStatus(HttpStatus.OK)
	public Bank getbankById(@PathVariable int bankId) {
		return bs.getBankById(bankId);
	}
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Bank addbank(@Valid @RequestBody Bank bank) {
		return bs.addBank(bank);
	}
	
	@PutMapping("/update/{bankId}")
	@ResponseStatus(HttpStatus.CREATED)
	public Bank update(@PathVariable int bankId, @RequestBody Bank bank) {
		return bs.updateBank(bankId, bank);
	}
	
	@DeleteMapping("/delete/{bankId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public boolean deletebank(@PathVariable int bankId) {
		return bs.deleteBank(bankId);
	}
	
	@GetMapping("/getAll")
	public List<Bank> getAll(){
		return bs.getAll();
	}
	
	
	
	
	
	
	
	
}
