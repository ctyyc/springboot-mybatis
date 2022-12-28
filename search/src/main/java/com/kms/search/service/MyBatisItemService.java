package com.kms.search.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kms.search.domain.Item;
import com.kms.search.dto.ItemSearchCond;
import com.kms.search.dto.ItemUpdateDto;
import com.kms.search.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyBatisItemService implements ItemService {
	private final ItemRepository itemRepository;

	@Override
	public Item save(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public void update(Long itemId, ItemUpdateDto updateParam) {
		itemRepository.update(itemId, updateParam);
	}

	@Override
	public Optional<Item> findById(Long id) {
		return itemRepository.findById(id);
	}

	@Override
	public List<Item> findItems(ItemSearchCond cond) {
		return itemRepository.findAll(cond);
	}
}