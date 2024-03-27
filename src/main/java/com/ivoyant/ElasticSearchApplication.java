package com.ivoyant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
public class ElasticSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApplication.class, args);
	}

}
