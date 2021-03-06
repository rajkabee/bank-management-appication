package com.bank.bankManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankManagementApp.entity.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
