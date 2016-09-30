package com.chargify.webhooks;

import com.chargify.model.webhooks.WebhookEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("echo")
public class EchoWebhookHandler implements WebhookHandler
{
  @Override
  public void handle(final WebhookEntity webhook)
  {
    System.out.println("Handled webhook of type: " + webhook.getEvent());
  }
}
