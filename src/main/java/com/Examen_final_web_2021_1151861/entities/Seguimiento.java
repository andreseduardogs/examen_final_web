package com.Examen_final_web_2021_1151861.entities;

import java.sql.Date;

import lombok.Data;

@Data

public class Seguimiento {
		
	private Integer id;
	
	private Reporte report;
	
	private Date dateGenerate;
	
	private int state;
	
	private String result;
	
	private String detailRequest;
	
	private String type;
	
	private String fileGenerate;
	
}
