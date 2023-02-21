package com.example.registrationlogindemo.dto;



import com.logger.Baselog;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends Baselog
{

	
    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @NotEmpty(message = "Password should not be empty")
    private String password;
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		logger.info("First name passed");
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		logger.info("last name passed");
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		logger.info("Email passed");
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		logger.info("password passed");
		this.password = password;
	}
    
}
