package com.bank.bankManagementApp.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class DBFile {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;
    
    @CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;

    public DBFile() {

    }

    public DBFile(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }
    

    public DBFile(String fileName, String fileType, byte[] data, Date date_created, Date date_updated) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}

	public DBFile(long id, String fileName, String fileType, byte[] data, Date date_created, Date date_updated) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

	@Override
	public String toString() {
		return "DBFile [id=" + id + ", fileName=" + fileName + ", fileType=" + fileType + ", data="
				+ Arrays.toString(data) + ", date_created=" + date_created + ", date_updated=" + date_updated + "]";
	}
    
    
}
