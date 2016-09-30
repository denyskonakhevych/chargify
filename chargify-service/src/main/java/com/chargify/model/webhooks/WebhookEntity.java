package com.chargify.model.webhooks;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "event",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PaymentWebhookEntity.class, name = ChargifyEvent.PAYMENT_SUCCESS),
        @JsonSubTypes.Type(value = DefaultWebhookEntity.class, name = ChargifyEvent.SUBSCRIPTION_STATE_CHANGE),
        @JsonSubTypes.Type(value = WebhookEntity.class, name = ChargifyEvent.TEST)
})
public class WebhookEntity
{
  private String id;
  private String event;

  public String getId()
  {
    return id;
  }

  public void setId( final String id )
  {
    this.id = id;
  }

  public String getEvent()
  {
    return event;
  }

  public void setEvent( final String event )
  {
    this.event = event;
  }
}
