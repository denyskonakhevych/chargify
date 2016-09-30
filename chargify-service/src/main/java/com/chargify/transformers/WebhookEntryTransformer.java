package com.chargify.transformers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebhookEntryTransformer
{
  private static final Pattern PATTERN = Pattern.compile( "\\[([^\\]]+)]" );
  private static final String PAYLOAD = "payload";

  public static Map<String, Object> transformToMap( final String key, final String value )
  {
    if( key.startsWith( PAYLOAD ) )
    {
      List<String> properties = parseProperties( key );
      return toMap( properties, value );
    }
    else
      return toMap( key, value );
  }

  private static List<String> parseProperties( String key )
  {
    Matcher matcher = PATTERN.matcher( key );
    List<String> properties = new ArrayList<>();
    while ( matcher.find() ) {
      properties.add( matcher.group( 1 ) );
    }
    return properties;
  }

  private static Map<String, Object> toMap( List<String> levels, String value )
  {
    if( levels.size() <= 1)
      return toMap( levels.get( 0 ), value );
    else
      return toMap( levels.get( 0 ),
                    toMap( levels.subList( 1, levels.size() ),
                           value ) );
  }

  private static Map<String, Object> toMap( String key, Map<String, Object> subLevel )
  {
    Map<String, Object> map = new HashMap<>();
    map.put( key, subLevel );
    return map;
  }

  private static Map<String, Object> toMap( String key, String value )
  {
    Map<String, Object> map = new HashMap<>();
    map.put( key, value );
    return map;
  }
}
