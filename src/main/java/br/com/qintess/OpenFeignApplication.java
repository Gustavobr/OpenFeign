package br.com.qintess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.com.qintess.repository.TodoClient;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class OpenFeignApplication {

	@Autowired(required = false)

	private TodoClient todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignApplication.class, args);
	}

}
