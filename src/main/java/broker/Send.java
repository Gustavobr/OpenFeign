package broker;

import com.rabbitmq.client.AMQP.Channel;
import com.rabbitmq.client.AMQP.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	private final static String QUEUE_NAME = "hello";
	private final static String HOST = "localhost";

	static ConnectionFactory factory = new ConnectionFactory();

	public static void main(String[] args) {
		Send.factory.setHost(Send.HOST);
		try {
			com.rabbitmq.client.Connection connection = factory.newConnection();
			com.rabbitmq.client.Channel channel = connection.createChannel();
			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
			String message = "Hello RabbitMQ";
			channel.basicPublish(message, QUEUE_NAME, null, message.getBytes());
			System.out.println(" [x] Sent" + " " + message);
		} catch (Exception ex) {

		}
	}

}
