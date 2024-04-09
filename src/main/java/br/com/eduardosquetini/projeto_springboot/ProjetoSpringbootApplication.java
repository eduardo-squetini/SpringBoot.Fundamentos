package br.com.eduardosquetini.projeto_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.eduardosquetini")
public class ProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringbootApplication.class, args);
	}

}
