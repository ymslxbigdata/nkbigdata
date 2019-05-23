package com.ymslx.nkbigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories("com.ymslx.nkbigdata.repository")
public class NkbigdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(NkbigdataApplication.class, args);
	}

}
