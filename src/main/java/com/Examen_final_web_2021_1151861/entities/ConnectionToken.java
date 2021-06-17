package com.Examen_final_web_2021_1151861.entities;

import lombok.Data;

@Data

public class ConnectionToken {

	private Integer id;
	
	private String host;
	
	private String userdb;
	
	private String pass;
	
	private String db;
	
	private String token;
	
	private int port;
	
	private Usuario user;
	
	private int state;
	
	private Typedb type;
	
	
}
