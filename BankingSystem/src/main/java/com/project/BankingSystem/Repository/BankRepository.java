package com.project.BankingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.BankingSystem.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer>{

}
