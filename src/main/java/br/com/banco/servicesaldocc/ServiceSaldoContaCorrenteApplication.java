package br.com.banco.servicesaldocc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages  = {"br.com.banco.servicesaldocc.db.model"})
public class ServiceSaldoContaCorrenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSaldoContaCorrenteApplication.class, args);
	}
}
