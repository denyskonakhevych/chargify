package com.chargify.logging;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class RabbitMqConfiguration
{
//  @Autowired
//  private ConnectionFactory connectionFactory;

  @Value("${concurrent.consumers}")
  public int concurrent_consumers;

  @Value("${max.concurrent.consumers}")
  public int max_concurrent_consumers;

  @Bean
  public SimpleRabbitListenerContainerFactory myRabbitListenerContainerFactory() {
    SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
    factory.setConnectionFactory( connectionFactory());
    factory.setConnectionFactory( connectionFactory() );
    factory.setConcurrentConsumers( concurrent_consumers );
    factory.setMaxConcurrentConsumers( max_concurrent_consumers );
    return factory;
  }

  @Bean
  public CachingConnectionFactory connectionFactory()
  {
    CachingConnectionFactory connectionFactory = new CachingConnectionFactory("192.168.99.100", 32770);
    connectionFactory.setCacheMode( CachingConnectionFactory.CacheMode.CONNECTION);
    return connectionFactory;
  }
}
