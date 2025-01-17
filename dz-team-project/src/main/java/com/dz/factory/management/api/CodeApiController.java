package com.dz.factory.management.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dz.factory.common.domain.CMRespDto;
import com.dz.factory.common.domain.Code;
import com.dz.factory.common.domain.ManageCode;
import com.dz.factory.management.service.CodeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CodeApiController {

	private final CodeService codeService;

	@GetMapping("/code/all")
	public ResponseEntity<?> codeAll(){
		ArrayList<Code> codeList = codeService.getAllCode();
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",codeList),HttpStatus.OK);
	}
	
	
	@PostMapping("/code/add")
	public ResponseEntity<?> CodeAdd(@RequestBody Code data){
		codeService.addCode(data);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",data),HttpStatus.OK);
	}
	
	@PostMapping("/code/search")
	public ResponseEntity<?> codeSearch(@RequestBody HashMap<String, Object> codes){
		ArrayList<ManageCode> list = codeService.getSearchCodeList(codes);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",list),HttpStatus.OK);
	}
	
	@PostMapping("/code/delete")
	public ResponseEntity<?> codeDelete(@RequestBody List<String> codes){
		codes.forEach((data) -> System.out.println(data));
		codeService.delCode(codes);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",codes),HttpStatus.OK);
	}
	
	
	@GetMapping("/managementcode/all")
	public ResponseEntity<?> manageCodeAll(){
		ArrayList<ManageCode> manageCodeList = codeService.getAllManageCode();
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",manageCodeList),HttpStatus.OK);
	}
	
	@PostMapping("/managecode/add")
	public ResponseEntity<?> manageCodeAdd(@RequestBody ManageCode data){
		codeService.addManageCode(data);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",data),HttpStatus.OK);
	}
	@PostMapping("/managecode/search")
	public ResponseEntity<?> manageCodeSearch(@RequestBody HashMap<String, Object> codes){
		ArrayList<ManageCode> list = codeService.getSearchList(codes);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",list),HttpStatus.OK);
	}
	
	@PostMapping("/managecode/delete")
	public ResponseEntity<?> manageCodeDelete(@RequestBody List<String> codes){
		codeService.delManageCode(codes);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",codes),HttpStatus.OK);
	}
	
	

	
}
