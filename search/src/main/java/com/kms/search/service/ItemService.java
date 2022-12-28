package com.kms.search.service;

import java.util.List;
import java.util.Optional;

import com.kms.search.domain.Item;
import com.kms.search.dto.ItemSearchCond;
import com.kms.search.dto.ItemUpdateDto;


public interface ItemService {
	Item save(Item item);

	void update(Long itemId, ItemUpdateDto updateParam);

	Optional<Item> findById(Long id);

	List<Item> findItems(ItemSearchCond itemSearch);
}