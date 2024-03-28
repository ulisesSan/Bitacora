package com.bitacora.bitacora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BitacoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitacoraApplication.class, args);
	}

	//docker exec -it Bitacora bash
	//mysql -u root -p
}
