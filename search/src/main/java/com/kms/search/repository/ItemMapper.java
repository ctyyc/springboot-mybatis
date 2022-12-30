package com.kms.search.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kms.search.domain.Item;
import com.kms.search.dto.ItemSearchCond;
import com.kms.search.dto.ItemUpdateDto;

@Mapper
public interface ItemMapper {
	void save(Item item);

	void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);

	Optional<Item> findById(Long id);

	List<Item> findAll(ItemSearchCond itemSearch);
}