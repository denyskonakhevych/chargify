package com.chargify.logging.service;

import com.chargify.logging.LogServiceApplication;
import com.chargify.logging.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("echo")
public class AmqpLogService implements LogService
{
  private final RabbitMessagingTemplate messagingTemplate;

  public AmqpLogService(RabbitMessagingTemplate messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
  }

  @Override
  public void log( final Notification notification )
  {
    final Map<String, Object> headers = new HashMap<>();
    headers.put( "notification-id", notification.getId() );
    this.messagingTemplate.convertAndSend( LogServiceApplication.NOTIFICATIONS, notification, headers );
  }
}
