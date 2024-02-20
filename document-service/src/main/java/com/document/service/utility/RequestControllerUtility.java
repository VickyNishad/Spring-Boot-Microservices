/**
 * 
 */
package com.document.service.utility;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class RequestControllerUtility {
	
	public final static String BASE_URL="api/v1/document";
	public final static String uploadDocument = BASE_URL+"/uploadDocument";
	public final static String getDocument = BASE_URL+"/getDocument";
	public final static String getDocumentById = getDocument+"/{docId}";
	public final static String deleteDocumentById = BASE_URL+"/deleteDocument/{docId}";
	
	/**
	 * 
	 */
	public RequestControllerUtility() {
		// TODO Auto-generated constructor stub
	}
}
