package com.dz.factory.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dz.factory.domain.management.Storage;
import com.dz.factory.mapper.StorageMapper;
import com.dz.factory.web.dto.management.LocationDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StorageService {

	private final StorageMapper storageMapper;
	
	@Transactional
	public void insert(Storage storage) {
		
			storageMapper.insertStorage(storage);
		
	}

	public ArrayList<Storage> getAll() {
		return storageMapper.selectAll();
	}

	public void addLocation(LocationDto locationDto) {
		storageMapper.insertLocation(locationDto);
	}

	public ArrayList<LocationDto> getLocationAll() {
		return storageMapper.selectLocationAll();
	}
	
}
