package com.dz.factory.production.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.dz.factory.common.domain.Item;
import com.dz.factory.common.domain.ProductRelation;
import com.dz.factory.production.dto.ComponentItemDto;
import com.dz.factory.production.dto.RelationDto;


@Mapper
public interface ProductionAddMapper {
	public ArrayList<ComponentItemDto> getComponentItems(String itemCode);
	public ArrayList<RelationDto> getRelation(String itemCode);
}
