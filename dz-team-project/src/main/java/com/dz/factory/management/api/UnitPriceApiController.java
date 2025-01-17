package com.dz.factory.management.api;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dz.factory.common.domain.CMRespDto;
import com.dz.factory.common.domain.UnitPrice;
import com.dz.factory.management.service.UnitPriceService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UnitPriceApiController {

	private final UnitPriceService unitPriceService;
	
	@GetMapping("/unitPrice/all")
	public ResponseEntity<?> unitPriceGetAll(){
		ArrayList<UnitPrice> unitPriceList = unitPriceService.getAll();
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",unitPriceList),HttpStatus.OK);
	}
	
	@PostMapping("/unitPrice/add")
	public ResponseEntity<?> unitPriceAdd(@RequestBody UnitPrice unitPrice){
		unitPriceService.addUnitPrice(unitPrice);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",unitPrice),HttpStatus.OK);
	}
}
