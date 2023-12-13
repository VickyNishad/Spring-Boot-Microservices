/**
 * 
 */
package com.users.userservice.pojo;

import jakarta.persistence.Entity;
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
	private String userid;
	private String user_name;
	private String user_email;
	private String user_contact;
	public String getUser_contact() {
		return user_contact;
	}
	public String getUser_email() {
		return user_email;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(String userid, String user_name, String user_email, String user_contact) {
		super();
		this.userid = userid;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_contact = user_contact;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", user_name=" + user_name + ", user_email=" + user_email + ", user_contact="
				+ user_contact + "]";
	}
	

}
