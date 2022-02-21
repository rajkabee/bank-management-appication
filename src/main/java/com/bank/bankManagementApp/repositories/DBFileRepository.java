package com.bank.bankManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankManagementApp.entity.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String>{

}
