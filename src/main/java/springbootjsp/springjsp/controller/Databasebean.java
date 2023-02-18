package springbootjsp.springjsp.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Databasebean {
	
	@Id
	private String userid;
	private String username;
	private String userpassword;

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "Databasebean [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + "]";
	}
	public Databasebean() {
		super();
	}
	public Databasebean(String userid, String username, String userpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
	}
		
	
}
