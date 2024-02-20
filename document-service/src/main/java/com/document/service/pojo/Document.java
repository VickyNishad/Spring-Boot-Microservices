/**
 * 
 */
package com.document.service.pojo;

import java.io.Serializable;

import org.hibernate.engine.jdbc.SerializableClobProxy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "Document")
public class Document implements Serializable {
    // Other serializable fields and methods
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public Document() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String fileName;
	
	private String originalFileName;
	
	private String fileContantType;
	
	@Lob
	private byte[] file;
	
	private String fileSize;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the originalFileName
	 */
	public String getOriginalFileName() {
		return originalFileName;
	}

	/**
	 * @param originalFileName the originalFileName to set
	 */
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	/**
	 * @return the fileContantType
	 */
	public String getFileContantType() {
		return fileContantType;
	}

	/**
	 * @param fileContantType the fileContantType to set
	 */
	public void setFileContantType(String fileContantType) {
		this.fileContantType = fileContantType;
	}

	/**
	 * @return the file
	 */
	public byte[] getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}

	/**
	 * @return the fileSize
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public Document(long id, String fileName, String originalFileName, String fileContantType, byte[] file,
			String fileSize) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.originalFileName = originalFileName;
		this.fileContantType = fileContantType;
		this.file = file;
		this.fileSize = fileSize;
	}
	
	

}
