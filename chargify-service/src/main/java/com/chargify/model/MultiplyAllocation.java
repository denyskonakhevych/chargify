package com.chargify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties( ignoreUnknown = true )
@JsonSerialize( include = JsonSerialize.Inclusion.NON_NULL )
public class MultiplyAllocation
{
  @JsonProperty( "proration_upgrade_scheme" )
  private String prorationUpgradeScheme;

  @JsonProperty( "proration_downgrade_scheme" )
  private String prorationDowngradeScheme;

  private List<Allocation> allocations = new ArrayList<>();

  public void add( String componentId, int quantity )
  {
    allocations.add( new Allocation( Integer.parseInt( componentId ), quantity ) );
  }

  public String getProrationUpgradeScheme()
  {
    return prorationUpgradeScheme;
  }

  public void setProrationUpgradeScheme( String prorationUpgradeScheme )
  {
    this.prorationUpgradeScheme = prorationUpgradeScheme;
  }

  public String getProrationDowngradeScheme()
  {
    return prorationDowngradeScheme;
  }

  public void setProrationDowngradeScheme( String prorationDowngradeScheme )
  {
    this.prorationDowngradeScheme = prorationDowngradeScheme;
  }

  public List<Allocation> getAllocations()
  {
    return allocations;
  }

  public void setAllocations( List<Allocation> allocations )
  {
    this.allocations = allocations;
  }
}
