package com.chargify.transformers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class WebhookParser
{
  private static final Function<String[], String> TRANSFORMER = (array) -> array.length == 0
          ? ""
          : Optional.ofNullable( array[ 0 ] ).orElse( "" );

  public static Map<String, Object> parse( final Map<String, String[]> webhookBody )
  {
    final Map<String, Object> parsedWebhook = new HashMap<>();
    webhookBody.entrySet().stream()
            .map( entry ->  WebhookEntryTransformer.transformToMap( entry.getKey(), TRANSFORMER.apply( entry.getValue() ) ) )
            .forEach( map -> combine( parsedWebhook, map ) );
    return parsedWebhook;
  }

  private static void combine( final Map<String, Object> general, final Map<String, Object> map )
  {
    map.entrySet().stream().forEach( entry -> combine( general, entry ) );
  }

  private static void combine( final Map<String, Object> general, final Map.Entry<String, Object> entry )
  {
    if( entry.getValue() instanceof Map && general.containsKey( entry.getKey() ) )
    {
      combine( (Map) general.get( entry.getKey() ), (Map) entry.getValue() );
    }
    else
      general.put( entry.getKey(), entry.getValue() );
  }
}
