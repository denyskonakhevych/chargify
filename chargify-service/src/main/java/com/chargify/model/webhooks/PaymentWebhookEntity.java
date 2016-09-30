package com.chargify.model.webhooks;

import com.chargify.model.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true )
public class PaymentWebhookEntity extends WebhookEntity
{
  private Transaction transaction;

  public Transaction getTransaction()
  {
    return transaction;
  }

  public void setTransaction( final Transaction transaction )
  {
    this.transaction = transaction;
  }
}
