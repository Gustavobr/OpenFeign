package br.com.qintess.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.qintess.dto.Todo;

@FeignClient(value = "todoClient", url = "http://localhost:8080")
public interface TodoClient {

	@GetMapping
	@ResponseStatus
	public Todo retorna();
}
