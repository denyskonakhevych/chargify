package com.chargify.logging.controller;

import com.chargify.logging.LogServiceApplication;
import com.chargify.logging.model.Notification;
import com.chargify.logging.service.LogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class LogController
{
	private final LogService logService;

	//@Autowired
	public LogController(final LogService logService) {
		this.logService = logService;
	}

	@RequestMapping("/log")
	public void log() {
		sendMessage();
	}

	private void sendMessage()
	{
		final Notification notification = new Notification( UUID.randomUUID().toString(), "LOG_MESSAGE", new Date() );
		this.logService.log( notification );
	}

	private void sendMessage(Integer id)
	{
		final Notification notification = new Notification( id.toString(), "LOG_MESSAGE", new Date() );
		this.logService.log( notification );
	}

	@RequestMapping("/stress")
	public void stressTest() {
		System.out.println(new Date().toString() + ": Start sending messages");
		for(int i=0; i<LogServiceApplication.MAX_MESSAGES; i++) {
			if( i % 1_000 == 0)
				System.out.println(new Date().toString() + ": Sent messages: " + i / 1_000);
			sendMessage(i);
		}
		System.out.println(new Date().toString() + ": Stopped sending messages");
	}

}
