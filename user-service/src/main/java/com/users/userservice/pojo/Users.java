/**
 * 
 */
package com.users.userservice.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sudipkumarshaw
 *
 */
@Entity
@Table(name = "user_master")
public class Users {
	@Id
	private String user_id;
	private String user_first_name;
	private String user_middle_name;
	private String user_last_name;
	private String user_age;
	private String user_gender;
	private String user_martial_status;
	private String user_mobile_number;
	private String user_email_id;
	private String user_aadhar_number;
	private String user_pan_number;
	private String user_pincode;
	private String user_city;
	private String user_state;
	private String user_country;
	private String user_qualification;
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_first_name
	 */
	public String getUser_first_name() {
		return user_first_name;
	}
	/**
	 * @param user_first_name the user_first_name to set
	 */
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	/**
	 * @return the user_middle_name
	 */
	public String getUser_middle_name() {
		return user_middle_name;
	}
	/**
	 * @param user_middle_name the user_middle_name to set
	 */
	public void setUser_middle_name(String user_middle_name) {
		this.user_middle_name = user_middle_name;
	}
	/**
	 * @return the user_last_name
	 */
	public String getUser_last_name() {
		return user_last_name;
	}
	/**
	 * @param user_last_name the user_last_name to set
	 */
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	/**
	 * @return the user_age
	 */
	public String getUser_age() {
		return user_age;
	}
	/**
	 * @param user_age the user_age to set
	 */
	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}
	/**
	 * @return the user_gender
	 */
	public String getUser_gender() {
		return user_gender;
	}
	/**
	 * @param user_gender the user_gender to set
	 */
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	/**
	 * @return the user_martial_status
	 */
	public String getUser_martial_status() {
		return user_martial_status;
	}
	/**
	 * @param user_martial_status the user_martial_status to set
	 */
	public void setUser_martial_status(String user_martial_status) {
		this.user_martial_status = user_martial_status;
	}
	/**
	 * @return the user_mobile_number
	 */
	public String getUser_mobile_number() {
		return user_mobile_number;
	}
	/**
	 * @param user_mobile_number the user_mobile_number to set
	 */
	public void setUser_mobile_number(String user_mobile_number) {
		this.user_mobile_number = user_mobile_number;
	}
	/**
	 * @return the user_email_id
	 */
	public String getUser_email_id() {
		return user_email_id;
	}
	/**
	 * @param user_email_id the user_email_id to set
	 */
	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}
	/**
	 * @return the user_aadhar_number
	 */
	public String getUser_aadhar_number() {
		return user_aadhar_number;
	}
	/**
	 * @param user_aadhar_number the user_aadhar_number to set
	 */
	public void setUser_aadhar_number(String user_aadhar_number) {
		this.user_aadhar_number = user_aadhar_number;
	}
	/**
	 * @return the user_pan_number
	 */
	public String getUser_pan_number() {
		return user_pan_number;
	}
	/**
	 * @param user_pan_number the user_pan_number to set
	 */
	public void setUser_pan_number(String user_pan_number) {
		this.user_pan_number = user_pan_number;
	}
	/**
	 * @return the user_pincode
	 */
	public String getUser_pincode() {
		return user_pincode;
	}
	/**
	 * @param user_pincode the user_pincode to set
	 */
	public void setUser_pincode(String user_pincode) {
		this.user_pincode = user_pincode;
	}
	/**
	 * @return the user_city
	 */
	public String getUser_city() {
		return user_city;
	}
	/**
	 * @param user_city the user_city to set
	 */
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
	/**
	 * @return the user_state
	 */
	public String getUser_state() {
		return user_state;
	}
	/**
	 * @param user_state the user_state to set
	 */
	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}
	/**
	 * @return the user_country
	 */
	public String getUser_country() {
		return user_country;
	}
	/**
	 * @param user_country the user_country to set
	 */
	public void setUser_country(String user_country) {
		this.user_country = user_country;
	}
	/**
	 * @return the user_qualification
	 */
	public String getUser_qualification() {
		return user_qualification;
	}
	/**
	 * @param user_qualification the user_qualification to set
	 */
	public void setUser_qualification(String user_qualification) {
		this.user_qualification = user_qualification;
	}
	
	
}
