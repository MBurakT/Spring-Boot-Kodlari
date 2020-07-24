package com.example.deneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenemeApplication.class, args);
	}


}
//JDBC eklerinden otomatik olarak oluşturulan ID'lerin nasıl alınacağını gösterir.
//GeneratedKeyHolder, otomatik olarak oluşturulan anahtarları JDBC insert deyimlerinden potansiyel olarak geri almak için kullanılır.