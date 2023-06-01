package br.com.qintess.controller;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.qintess.dto.Todo;

@RestController
@RequestMapping("/v1")
public class PagamentoController {

	//@Autowired

	//private RabbitTemplate rabbitTemplate;

	@PostMapping
	@ResponseStatus
	@Transactional
	public ResponseEntity<Todo> save(@RequestBody Todo todoDTO, UriComponentsBuilder uriComponentsBuilder)
			throws IOException, Exception {
		URI endereco = uriComponentsBuilder.path("/pagamentos/{id}").buildAndExpand(todoDTO.getId()).toUri();
		
		String body= "Pagamento gerado"+ File.separator+ todoDTO.getId();
		byte[] message = body.getBytes();
		
		Message msg = new org.springframework.amqp.core.Message(message);
		//rabbitTemplate.convertSendAndReceive("pagamento.concluido", todoDTO);
		return ResponseEntity.created(endereco).body(todoDTO);

	}
}
