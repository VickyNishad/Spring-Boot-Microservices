/**
 * 
 */
package com.document.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.document.service.pojo.ApiResponse;
import com.document.service.pojo.Document;
import com.document.service.service.DocumentService;

/**
 * 
 */
@RestController
@RequestMapping(DocumentController.BASE_URL)
public class DocumentController {

	public final static String BASE_URL = "api/v1/document";

	@Autowired
	private DocumentService documentService;

	/**
	 * 
	 */
	public DocumentController() {
		// TODO Auto-generated constructor stub
	}

	@CacheEvict(value = "myDocumentById", allEntries = true)
	@PostMapping
	public ResponseEntity<?> saveDocument(@RequestParam("file") MultipartFile multipartFile) {

		try {
			return documentService.uploadDocument(multipartFile);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Cacheable(value = "myDocument", unless = "#result == null or #result.isEmpty()")
	@GetMapping()
	public List<Document> getDocument() {
		// TODO Auto-generated method stub
		return documentService.getDocument();
	}

	
//	@Cacheable(value = "myDocumentById", key = "#id", unless = "#result == null or #result.isEmpty() or #result.isEmptyDocument()", condition = "#id !=null")
	@Cacheable(value = "myDocumentById", key = "#id")
	@GetMapping("/{id}")
	public ApiResponse getDocumentById(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return documentService.getDocumentById(id);
	}

	
	
	
}
