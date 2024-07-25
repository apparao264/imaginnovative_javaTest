package com.imaginnovate.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {
	
	@NotBlank(message = "First name is mandatory")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Phone number is mandatory")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$")
    private String phoneNumbers;

    @NotNull(message = "Date of joining is mandatory")
    private Date dateOfJoining;

    @NotNull(message = "Salary is mandatory")
    private Double salary;

    
}
