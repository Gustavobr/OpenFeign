package broker;

import java.time.Duration;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AMQPConfig {

	@Bean

	public Queue createQueue(Duration duration, String name) {
		if (duration != null) {
			return QueueBuilder.durable(name).build();

		} else {
			return QueueBuilder.nonDurable(name).build();
		}

	}

	@Bean

	public Exchange directExchange(String tipo, String exchangeName) {
		switch (tipo) {
		case "direct":
			return ExchangeBuilder.directExchange(exchangeName).build();

		case "topic":
			return ExchangeBuilder.topicExchange(exchangeName).build();

		case "header":
			return ExchangeBuilder.headersExchange(exchangeName).build();

		case "fanout":
			return ExchangeBuilder.fanoutExchange(exchangeName).build();
		}
		return null;
	}
}
