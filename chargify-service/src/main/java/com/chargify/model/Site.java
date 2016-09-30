package com.chargify.model;

public class Site
{
  private String id;
  private String subdomain;

  public String getId()
  {
    return id;
  }

  public void setId( final String id )
  {
    this.id = id;
  }

  public String getSubdomain()
  {
    return subdomain;
  }

  public void setSubdomain( final String subdomain )
  {
    this.subdomain = subdomain;
  }
}
