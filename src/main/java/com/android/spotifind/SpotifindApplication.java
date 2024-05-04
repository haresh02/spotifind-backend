package com.android.spotifind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories

public class SpotifindApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifindApplication.class, args);
	}

}
