package dto;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;


public class ClienteDto {

	@NotBlank
	private UUID cp;
	@NotBlank
	private String name;
	@NotBlank
	private int age;
	
}
