package com.dz.factory.management.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dz.factory.common.domain.CMRespDto;
import com.dz.factory.common.domain.ProductRelation;
import com.dz.factory.management.dto.ProductRelationDto;
import com.dz.factory.management.service.ProductRelationService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ProductRelationApiController {

	private final ProductRelationService productRelationService; 
	
	@PostMapping("/product/add")
	public ResponseEntity<?> productAdd(@RequestBody ProductRelationDto dto){
		System.out.println(dto.getProductId());
		for(ProductRelation component : dto.getComponents()) {
			System.out.println(component.toString());
		}
		productRelationService.productRelationAdd(dto);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",dto),HttpStatus.OK);
	}
	
	
}
