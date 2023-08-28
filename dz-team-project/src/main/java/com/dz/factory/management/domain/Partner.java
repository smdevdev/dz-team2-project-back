package com.dz.factory.management.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Partner {

	private int partner_id;
	private String bizNum;
	private String name;
	private int company_id;
	private String emp_name;
	private String ph_num;
	private String address;
	private String email;
	
}