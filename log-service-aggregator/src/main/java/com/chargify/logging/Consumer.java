package com.chargify.logging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Component
public class Consumer
{
//	public static AtomicInteger handledMessages = new AtomicInteger(0);
//	public static AtomicLong totalLatency = new AtomicLong( 0 );

//	@RabbitListener(containerFactory="rabbitListenerContainerFactory", queues = LogServiceAggregatorApplication.NOTIFICATIONS)
	public void onNotification(Message<Notification> message) {
		handleNotification( message.getPayload() );
	}

	private void handleNotification( final Notification notification )
	{
		System.out.println( Thread.currentThread().getId() + " # id: " + notification.getId() + " # latency: "
																+ computeLatency( notification.getDate() ) + " millis" );
//		totalLatency.addAndGet( computeLatency( notification.getDate() ) );
//		if( LogServiceApplication.MAX_MESSAGES.equals( handledMessages.incrementAndGet() ) )
//			System.out.println(new Date() + ": Handled all messages. Average latency is: " +
//																 ( totalLatency.get() / LogServiceApplication.MAX_MESSAGES ) );

	}

	private long computeLatency(final Date messageDate)
	{
		return System.currentTimeMillis() - messageDate.getTime();
	}

}
