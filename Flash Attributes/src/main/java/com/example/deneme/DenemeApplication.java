package com.example.deneme;

import freemarker.core.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class DenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenemeApplication.class, args);
	}
}


// Hızlı mesajlar, kullanıcı bildirimleri veya form girişini saklamak için kullanılan geçici verilerdir. Bir oturumda saklanırlar ve alınır alınmaz ortadan kaybolurlar.

// Spring'deki flash mesajlar, RedirectAttributes'ın addFlashAttribute () yöntemi kullanılarak flash nitelikleri olarak oluşturulur. RedirectView ile birlikte kullanılırlar.