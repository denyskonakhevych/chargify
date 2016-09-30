package com.chargify.transformers;

import com.chargify.model.webhooks.WebhookEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Map;

public class WebhookFactory
{
  private static final String CHARGIFY_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss Z";
  private static final ObjectMapper objectMapper = new ObjectMapper().setDateFormat( new SimpleDateFormat( CHARGIFY_DATE_FORMAT ) );

  public static <T extends WebhookEntity> T create( final Map<String, Object> webhookData, final Class<T> clazz )
  {
    try
    {
      return objectMapper.readValue( objectMapper.writeValueAsString( webhookData ), clazz );
    }
    catch( IOException e )
    {
      throw new RuntimeException( e );
    }
  }
}
