package com.dz.factory.management.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dz.factory.common.domain.Location;
import com.dz.factory.common.domain.Storage;
import com.dz.factory.management.mapper.StorageMapper;

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

	@Transactional
	public void addLocation(Location locationDto) {
		storageMapper.insertLocation(locationDto);
	}

	public ArrayList<Location> getLocationAll() {
		return storageMapper.selectLocationAll();
	}

	@Transactional
	public void editLocation(Location locationDto) {
		storageMapper.updateLocation(locationDto);
	}

	@Transactional
	public void delLocation(List<Integer> ids) {
		for (int id : ids) {
			storageMapper.deleteLocation(id);
		}
	}

	@Transactional
	public void delStorage(List<String> codes) {
		for (String code : codes) {
			storageMapper.deleteStorage(code);
		}
	}

	public ArrayList<Storage> getSearchStorage(HashMap<String, String> formData) {
		return storageMapper.selSearchStorage(formData);
	}

	public ArrayList<Storage> getSearchLocation(HashMap<String, String> formData) {
		return storageMapper.selSearchLocation(formData);
	}

}
