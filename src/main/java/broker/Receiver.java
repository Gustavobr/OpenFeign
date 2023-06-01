package broker;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.amqp.support.ConsumerTagStrategy;

import com.rabbitmq.client.AMQP.Channel;
import com.rabbitmq.client.AMQP.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Receiver {

	private static final String QUEUE_NAME = "HELLO";
	private static String host = "localhost";

	public Receiver() {

	}

	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();

		factory.setHost(host);

		com.rabbitmq.client.Connection connection = factory.newConnection();

		com.rabbitmq.client.Channel channel = connection.createChannel();

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {

			String message = new String();

			System.out.println("received [x]" + " " + message);

		};

		channel.basicConsume(QUEUE_NAME, deliverCallback, consumerTag -> {
		});
	}

}
