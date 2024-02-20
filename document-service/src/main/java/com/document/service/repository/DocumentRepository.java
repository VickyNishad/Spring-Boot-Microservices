/**
 * 
 */
package com.document.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.document.service.pojo.Document;

/**
 * 
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Long>{

}
