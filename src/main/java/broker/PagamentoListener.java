package broker;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.qintess.dto.Todo;

@Component
public class PagamentoListener {

	@RabbitListener(queues = "pagamento.concluido")
	@Payload(required = true)	
	public void receiveMessage(Todo todo) {
		String msg
		/* TextBox java */
				= """
						Dados do pagamento: %s
						id: $s
						title: $s
						userId: $s
								""".formatted(todo.getId(), todo.getTitle(), todo.getUserId());
		System.out.println("message received from: " + " " + msg);

	}

}
