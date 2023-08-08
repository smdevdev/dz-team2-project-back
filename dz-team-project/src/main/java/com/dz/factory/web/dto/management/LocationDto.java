package com.dz.factory.web.dto.management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocationDto {
	private int storage_id;

	private int location_id;
	private String location_name;
	private String storage_name;
}
