package com.nnh;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	@KafkaListener(topics = "nnh", groupId = "groupId")
	void listener(String data) {
		System.out.println("Listener: " + data);
	}
}
