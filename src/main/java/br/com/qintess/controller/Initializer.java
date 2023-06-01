package br.com.qintess.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import br.com.qintess.openfeign.ContactDTO;
import br.com.qintess.openfeign.FeignClient;

@Component

public class Initializer implements CommandLineRunner {

	@Autowired
	private FeignClient client;

	@Override
	public void run(String... args) throws Exception, IOException {
		try {
			Page<ContactDTO> list = this.client.getAll();
			list.forEach(contact -> {
				System.out.println("Nome: " + " " + contact.getNome() + "\n" + "Email:" + " " + contact.getEmail()
						+ "\n" + " " + contact.getCpf());
			});
		} catch (Exception ex) {

		}

	}

	// private final FeignClient client;

	// public Initializer(FeignClient client) {
	// this.client = client;

}
