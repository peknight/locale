package com.peknight.locale;

import com.peknight.common.annotation.EnableCommonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCommonConfiguration
@SpringBootApplication
public class LocaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocaleApplication.class, args);
	}
}
