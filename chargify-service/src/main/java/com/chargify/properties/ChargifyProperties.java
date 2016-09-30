package com.chargify.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(locations = "classpath:chargify.properties", prefix = "chargify")
public class ChargifyProperties
{
  private String site;
  private Auth auth;

  public String getSite()
  {
    return site;
  }

  public void setSite( final String site )
  {
    this.site = site;
  }

  public Auth getAuth()
  {
    return auth;
  }

  public void setAuth( final Auth auth )
  {
    this.auth = auth;
  }

  public String getHost()
  {
    return "https://" + site + ".chargify.com";
  }
}
