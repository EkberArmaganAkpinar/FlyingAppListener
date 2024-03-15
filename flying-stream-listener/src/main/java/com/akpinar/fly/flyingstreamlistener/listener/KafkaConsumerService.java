package com.akpinar.fly.flyingstreamlistener.listener;

import com.akpinar.fly.flyingstream.dto.FlyChangeDto;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaConsumerService {

    @KafkaListener(topics = "${spring.kafka.topic-name}",groupId = "${spring.kafka.consumer.group-id}")
    public void listen(FlyChangeDto message) {
        try {
            System.out.println("Received Message in group myGroup: " + message);
        }catch (Exception e){
            throw new RuntimeException("Kafkada hata oluştu");
        }

    }
}
