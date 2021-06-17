package com.Examen_final_web_2021_1151861.entities;

import lombok.Data;

@Data

public class Usuario {

	private Integer id;
	
	private String usuario;
	
	private String email;
	
	private String pass;
	
	private Rol role;
	
	private int state;
	
}
