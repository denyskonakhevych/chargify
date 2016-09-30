package com.chargify.webhooks;

import com.chargify.model.webhooks.WebhookEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Component
@Qualifier("counted")
public class CountedWebhookHandler implements WebhookHandler
{
  private ConcurrentHashMap<String, AtomicInteger> counter = new ConcurrentHashMap<>();
  @Override
  public void handle(final WebhookEntity webhook)
  {
    counter.computeIfAbsent( webhook.getEvent(), key -> new AtomicInteger() );
    counter.get( webhook.getEvent() ).incrementAndGet();

    System.out.println("Handled webhook of type: " + webhook.getEvent() +
                               ". Current value: " + counter.get( webhook.getEvent() ).get() );
  }

  public Map<String, Integer> getStats()
  {
    return counter.entrySet().stream()
            .collect( Collectors.toMap( Map.Entry::getKey, value -> value.getValue().get() ) );
  }
}
