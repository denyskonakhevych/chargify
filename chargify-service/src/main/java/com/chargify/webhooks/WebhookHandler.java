package com.chargify.webhooks;

import com.chargify.model.webhooks.WebhookEntity;

public interface WebhookHandler
{
  void handle(final WebhookEntity webhook);
}
