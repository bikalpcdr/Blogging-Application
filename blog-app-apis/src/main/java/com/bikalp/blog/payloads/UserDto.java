package com.bikalp.blog.payloads;

import jakarta.validation.constraints.*;
import lombok.*;

//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 character")
	private String name; 

	@Email(message = "Email is not valid")
	private String email;

	@NotEmpty
	@Size(min = 3, message = "Password must be in min of 3 chars and max of 10 chars")
//	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{3,10}$", message = "Password must contain at least one uppercase letter, one lowercase letter, and one digit")
	private String password;

	@NotEmpty
	private String about;

	public UserDto() {

	}

	public UserDto(int id, String name, String email, String password, String about) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.about = about;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
