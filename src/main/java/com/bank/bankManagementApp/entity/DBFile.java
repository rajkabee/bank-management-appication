package com.bank.bankManagementApp.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.*;
@Data
@Entity
public class DBFile {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;
    
    @CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;

   
}
