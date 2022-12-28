package com.kms.search.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kms.search.repository.ItemMapper;
import com.kms.search.repository.ItemRepository;
import com.kms.search.repository.MyBatisItemRepository;
import com.kms.search.service.ItemService;
import com.kms.search.service.MyBatisItemService;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {
	private final ItemMapper itemMapper;

	@Bean
	public ItemService itemService() {
		return new MyBatisItemService(itemRepository());
	}

	@Bean
	public ItemRepository itemRepository() {
		return new MyBatisItemRepository(itemMapper);
	}
}