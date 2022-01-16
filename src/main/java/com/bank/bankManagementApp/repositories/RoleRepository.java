package com.bank.bankManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankManagementApp.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
