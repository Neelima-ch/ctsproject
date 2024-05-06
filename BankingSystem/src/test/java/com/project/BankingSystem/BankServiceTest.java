package com.project.BankingSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.BankingSystem.Service.BankService;
import com.project.BankingSystem.model.Bank;
import com.project.BankingSystem.model.CommunicationAddress;
import com.project.BankingSystem.model.PermanentAddress;


@SpringBootTest
public class BankServiceTest {
	@Autowired
    private BankService bankService;
	
	@Test
	public void testAddBank() {
	       
      
        Bank b=new Bank(121,787,"bankName",909899,
    			677657,  2089786,"notes",
    			new PermanentAddress("HN", "SS", "LM", "CT", "ST", "PI"),new CommunicationAddress("CHN", "CSS", "CLM", "CCT", "CST","522004"));
       
     
 
        Bank addedBank = bankService.addBank(b);
 
        assertNotNull(addedBank.getBankId());
        assertEquals(b.getBankName(), addedBank.getBankName());
        
    }
	
	@Test
	public void testGETBank() {
	       
      
        Bank b=new Bank(121,787,"bankName",909899,
    			677657,  2089786,"notes",
    			new PermanentAddress("HN", "SS", "LM", "CT", "ST", "PI"),new CommunicationAddress("CHN", "CSS", "CLM", "CCT", "CST","522004"));
       
     
 
        Bank addedBank = bankService.addBank(b);
        Bank displayBank = bankService.getBankById(addedBank.getBankId());
        String bname=displayBank.getBankName();
        
        assertEquals("bankName",bname);
        
 
        
        
    }
	@Test
	public void testupdateBank() {
	       
      
        Bank b=new Bank(121,787,"bankName",909899,
    			677657,  2089786,"notes",
    			new PermanentAddress("HN", "SS", "LM", "CT", "ST", "PI"),new CommunicationAddress("CHN", "CSS", "CLM", "CCT", "CST","522004"));
       
     
 
        Bank addedBank = bankService.addBank(b);
        
               b.setBankName("UpdatedName");
        b.setAccountNumber(99);
 
        Bank updatedBank= bankService.updateBank(addedBank.getBankId(), b);
        

        assertNotNull(updatedBank.getBankId());
        assertEquals("UpdatedName",updatedBank.getBankName());
        assertEquals(99,updatedBank.getAccountNumber());
       
	}
	@Test
	public void testdeleteBank() {
	       
      
        Bank b=new Bank(121,787,"bankName",909899,
    			677657,  2089786,"notes",
    			new PermanentAddress("HN", "SS", "LM", "CT", "ST", "PI"),new 
    			CommunicationAddress("CHN", "CSS", "CLM", "CCT", "CST","522004"));
       
     
 
        Bank addedBank = bankService.addBank(b);
        
        // When
        boolean isDeleted = bankService.deleteBank(addedBank.getBankId());
 
        // Then
        assertTrue(isDeleted);      
    }
 
    
 

}
