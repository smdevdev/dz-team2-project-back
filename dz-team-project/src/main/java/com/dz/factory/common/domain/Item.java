package com.dz.factory.common.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Item {

	private LocalDateTime registDate;
	private int company_id;
	private String category;
	private String item_code;
	private String item_name;
	private String storage_code;
	private int location_id;
	private String width;
	private String length;
	private String height;
	private String volume;
	private String weight;
	private String discription;
	private String partner_code;
	private int quantity;
}
