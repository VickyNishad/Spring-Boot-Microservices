package com.users.userservice.pojo.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRequestModel {

	private String user_id;
	@NotBlank(message = "First name is required")
    private String user_first_name;

    // Middle name can be optional
    private String user_middle_name;

    @NotBlank(message = "Last name is required")
    private String user_last_name;

    @NotBlank(message = "Age is required")
    @Size(min = 1, max = 3, message = "Age must be between 1 and 3 characters")
    private String user_age;

    @NotBlank(message = "Gender is required")
    private String user_gender;

    // Martial status can be optional
    private String user_martial_status;

    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String user_mobile_number;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String user_email_id;

    // Aadhar number can be optional
    private String user_aadhar_number;

    // PAN number can be optional
    private String user_pan_number;

    @NotBlank(message = "Pincode is required")
    private String user_pincode;

    @NotBlank(message = "City is required")
    private String user_city;

    @NotBlank(message = "State is required")
    private String user_state;

    @NotBlank(message = "Country is required")
    private String user_country;

    @NotBlank(message = "Qualification is required")
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

	public UserRequestModel() {
		// TODO Auto-generated constructor stub
	}

}
