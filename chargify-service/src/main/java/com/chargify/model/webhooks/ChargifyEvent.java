package com.chargify.model.webhooks;

public interface ChargifyEvent
{
  String PAYMENT_SUCCESS = "payment_success";
  String SUBSCRIPTION_STATE_CHANGE = "subscription_state_change";
  String TEST = "test";
}
