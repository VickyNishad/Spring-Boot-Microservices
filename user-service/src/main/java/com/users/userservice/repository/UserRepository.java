/**
 * 
 */
package com.users.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.userservice.pojo.Users;

/**
 * @author Vicky Nishad
 *
 */
@Repository
public interface UserRepository extends CrudRepository<Users, String>{

}
