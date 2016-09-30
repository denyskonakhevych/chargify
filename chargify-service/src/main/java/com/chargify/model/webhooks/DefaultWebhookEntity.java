package com.chargify.model.webhooks;

import com.chargify.model.Site;
import com.chargify.model.SubscriptionOutput;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = true )
public class DefaultWebhookEntity extends WebhookEntity
{
  private Site site;
  private SubscriptionOutput subscription;
  @JsonProperty( "event_id" )
  private String eventId;

  public Site getSite()
  {
    return site;
  }

  public void setSite( final Site site )
  {
    this.site = site;
  }

  public SubscriptionOutput getSubscription()
  {
    return subscription;
  }

  public void setSubscription( final SubscriptionOutput subscription )
  {
    this.subscription = subscription;
  }

  public String getEventId()
  {
    return eventId;
  }

  public void setEventId( final String eventId )
  {
    this.eventId = eventId;
  }
}
