package br.com.qintess.configuration;

import java.io.IOException;

import java.time.Duration;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.ContentTypeDelegatingMessageConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.support.WebExchangeBindException;

import com.rabbitmq.client.ConnectionFactory;

//@Configuration
public class RabbitAMQPConfiguration {
/*
	@Bean
	public Queue createQUEUE(String name, Duration duration) {
		if (duration == null) {
			return QueueBuilder.nonDurable(name).build();
		} else if (name != null && duration != null) {
			return QueueBuilder.durable(name).build();
		} else {
			return new Queue("DEFAULT");
		}
	}

	@Bean

	public RabbitAdmin createRabbitAdmin(org.springframework.amqp.rabbit.connection.ConnectionFactory factory)
			throws IOException {
		return new RabbitAdmin(factory);

	}

	/* Load TabbitMQ service */

	/* application listener */
	/*
	@Bean
	/*
	 * When load, create a QUEUE on rabbitMQ server and detects the connection alive
	 */
	/*
	public ApplicationListener<ApplicationReadyEvent> initRabbitMQ(RabbitAdmin rabbitAdmin) {
		return event -> rabbitAdmin.initialize();

	}

	@Bean

	public Jackson2JsonMessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	@Bean
	public RabbitTemplate customRabbitTemplate(ConnectionFactory factory,
			Jackson2JsonMessageConverter messageConverter) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(
				(org.springframework.amqp.rabbit.connection.ConnectionFactory) factory);
		rabbitTemplate.setMessageConverter(messageConverter);
		return rabbitTemplate;

	}

	@Bean

	public FanoutExchange fanoutExchange() throws WebExchangeBindException {
		return new FanoutExchange("pagamentos.ex");

	}

	@Bean(autowireCandidate = true)
	public ConnectionFactory connectionFactory() {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		factory.setPort(15672);
		factory.setPassword("guest");
		factory.setUsername("guest");

		return factory;

	}
*/
}
