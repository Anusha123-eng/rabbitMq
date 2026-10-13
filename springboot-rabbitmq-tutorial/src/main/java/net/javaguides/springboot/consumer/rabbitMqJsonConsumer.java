package net.javaguides.springboot.consumer;

import net.javaguides.springboot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class rabbitMqJsonConsumer {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(rabbitMqJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consumeJsonMessage(User user) {
        LOGGER.info("Received message -> {}", user);
    }
}
