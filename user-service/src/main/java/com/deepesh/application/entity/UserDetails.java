package com.deepesh.application.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "USER_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long userId;
	@NotNull(message = "userName cannot be null")
	private String userName;
	@Email(message = "Please provide the valid Email details ")
	@NotNull(message = "Email cannot be null")
	private String email;
	@NotNull(message = "Password cannot be null")
	@Size(min = 8, max = 16, message = "Password should be greater than 8 characters and less than equals to 16 characters")
	private String password;
	private String projectName;
	private String role;


}
