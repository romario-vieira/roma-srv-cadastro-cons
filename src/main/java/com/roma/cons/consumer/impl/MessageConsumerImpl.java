package com.roma.cons.consumer.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.roma.cons.consumer.MessageConsumer;

@Service
public class MessageConsumerImpl implements MessageConsumer {

	@Override
	@KafkaListener(topics = "roma-topico", groupId = "group-roma")
	public void consomeTopico(String mensagem) {
		System.out.println("Mensagem recebida:-> " + mensagem);
	}

}
