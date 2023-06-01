package br.com.qintess.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.dto.Todo;

@RestController
@RequestMapping("/todo")
public class TodoController {

	

	@GetMapping

	public br.com.qintess.dto.Todo retornaTodo() {
		Todo todo = new Todo();
		todo.setId(1);
		todo.setTitle("HEllo");
		todo.setUserId(1);
		return todo;
	}

}
