package com.kms.search.repository;

import java.util.List;
import java.util.Optional;

import com.kms.search.domain.Item;
import com.kms.search.dto.ItemSearchCond;
import com.kms.search.dto.ItemUpdateDto;

public interface ItemRepository {
	Item save(Item item);

	void update(Long itemId, ItemUpdateDto updateParam);

	Optional<Item> findById(Long id);

	List<Item> findAll(ItemSearchCond cond);
}