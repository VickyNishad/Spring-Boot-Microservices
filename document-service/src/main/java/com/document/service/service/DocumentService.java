package com.document.service.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.document.service.CommonControllerMethod;
import com.document.service.pojo.ApiResponse;
import com.document.service.pojo.Document;
import com.document.service.repository.DocumentRepository;

@Service
public class DocumentService extends CommonControllerMethod {

	@Autowired
	private DocumentRepository documentRepository;

	public DocumentService() {
		// TODO Auto-generated constructor stub
	}

	Document document = null;
	List<Document> docList = null;
	ApiResponse apiResponse = null;
	
	public ResponseEntity<?> uploadDocument(MultipartFile multipartFile) {

		try {
			document = new Document();
			document.setId(UUID.randomUUID().getLeastSignificantBits());
			document.setFileName(multipartFile.getName());
			document.setFileContantType(multipartFile.getContentType());
			document.setOriginalFileName(multipartFile.getOriginalFilename());

			Path tempFile = Files.createTempFile("temp-file", null);

			try (InputStream inputStream = multipartFile.getInputStream()) {
				// Stream the file content to the temporary file
				Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);

				// Now read the content from the temporary file and store it in the database
//                fileEntity.setFileData(Files.readAllBytes(tempFile));
				document.setFile(Files.readAllBytes(tempFile));

			} finally {
				// Delete the temporary file
				Files.deleteIfExists(tempFile);
			}

//			InputStream inputStream = multipartFile.getInputStream();
//			document.setFile(inputStream.readAllBytes());
			// document.setFileSize(Long.toString(multipartFile.getSize()/1024));

			// document.setFileSize(Double.toString(Integer.parseInt(Long.toString(multipartFile.getSize()/1024))/1024)+"MB");
			document.setFileSize(Double.toString((double) multipartFile.getSize() / (1024 * 1024)) + "MB" + "|"
					+ Double.toString((double) multipartFile.getSize() / 1024) + "KB");

			documentRepository.save(document);

			System.out.println("save");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return new ResponseEntity<Document>(document, HttpStatus.OK);

	}

	public List<Document> getDocument() {
		try {
			docList = documentRepository.findAll();
//			if (docList.isEmpty()) {
//				return new ResponseEntity<List<Document>>(docList, HttpStatus.OK);
//			}
			System.out.println("size" + docList.size());
			System.out.println("data form data base");
//			return new ResponseEntity<List<Document>>(docList, HttpStatus.OK);
			return docList;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	public ApiResponse getDocumentById(Long id) {
		try {
//			docList = documentRepository.findAll(id);
			document = new Document();
			apiResponse = new ApiResponse();

			Optional<Document> opDocument = documentRepository.findById(id);
			if (opDocument.isEmpty()) {
				System.out.println("data not found");

				return apiResponse;
			} else {
				document.setId(opDocument.get().getId());
				document.setFile(opDocument.get().getFile());
				document.setFileContantType(opDocument.get().getFileContantType());
				document.setFileName(opDocument.get().getFileName());
				document.setFileSize(opDocument.get().getFileSize());
				document.setOriginalFileName(opDocument.get().getOriginalFileName());
			}

//			System.out.println("size" + docList.size());
			apiResponse.setStatusCode("200");
			apiResponse.setMessage("retrive data successfully !!");
			apiResponse.setData(document);
			System.out.println("data form data base");
			return apiResponse;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

}
