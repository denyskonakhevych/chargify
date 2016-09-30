package com.chargify.logging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class NotificationQueueReceiver
{
  @RabbitListener(containerFactory="myRabbitListenerContainerFactory", queues=LogServiceAggregatorApplication.NOTIFICATIONS)
  public void process(Message<Notification> message) {
    handleNotification(message.getPayload());
  }

  private void handleNotification( final Notification notification )
  {
    try
    {
      if( Integer.parseInt( notification.getId() ) % 1_000 == 0 )
      {
        System.out.println( Thread.currentThread().getId() + " # id: " + notification.getId() + " # latency: "
                                    + computeLatency( notification.getDate() ) + " millis" );
      }
    }
    catch( NumberFormatException e )
    {
      System.out.println( Thread.currentThread().getId() + " # id: " + notification.getId() + " # latency: "
                                  + computeLatency( notification.getDate() ) + " millis" );
    }
  }

  private long computeLatency(final Date messageDate)
  {
    return System.currentTimeMillis() - messageDate.getTime();
  }
}
