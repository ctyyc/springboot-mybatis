package com.kms.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.kms.search.config.MyBatisConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import(MyBatisConfig.class)
@SpringBootApplication(scanBasePackages = "com.kms.search.web")
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}

}