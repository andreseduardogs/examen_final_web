package com.Examen_final_web_2021_1151861.entities;

import java.sql.Date;

import lombok.Data;

@Data

public class Reporte {

	private Integer id;
	
	private String file;
	
	private ConnectionToken conexion;
	
	private Date datecreate;
	
	private String state;
	
	private String description;
	
	private String name;
}
