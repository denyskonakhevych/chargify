/*
 * ********************************************************************************************************************
 *  <p/>
 *  BACKENDLESS.COM CONFIDENTIAL
 *  <p/>
 *  ********************************************************************************************************************
 *  <p/>
 *  Copyright 2012 BACKENDLESS.COM. All Rights Reserved.
 *  <p/>
 *  NOTICE:  All information contained herein is, and remains the property of Backendless.com and its suppliers,
 *  if any.  The intellectual and technical concepts contained herein are proprietary to Backendless.com and its
 *  suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret
 *  or copyright law. Dissemination of this information or reproduction of this material is strictly forbidden
 *  unless prior written permission is obtained from Backendless.com.
 *  <p/>
 *  ********************************************************************************************************************
 */

package com.chargify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties( ignoreUnknown = true )
@JsonSerialize( include = JsonSerialize.Inclusion.NON_NULL )
public class ComponentDefinition implements Serializable
{
  public ComponentDefinition()
  {
  }

  private String id;

  private String name;

  @JsonProperty( "unit_name" )
  private String unitName;

  @JsonProperty( "unit_price" )
  private String unitPrice;

  @JsonProperty( "pricing_scheme" )
  private String pricingScheme;

  @JsonProperty( "price_per_unit_in_cents" )
  @Deprecated
  private String pricePerUnitInCents;

  @JsonProperty( "product_family_id" )
  private String productFamilyId;

  private Boolean archived;

  @JsonProperty( "taxable" )
  private boolean taxable;

  private String kind;

  private List<PriceBracket> prices;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public String getUnitName()
  {
    return unitName;
  }

  public void setUnitName( String unitName )
  {
    this.unitName = unitName;
  }

  public String getUnitPrice()
  {
    return unitPrice;
  }

  public void setUnitPrice( String unitPrice )
  {
    this.unitPrice = unitPrice;
  }

  public String getPricingScheme()
  {
    return pricingScheme;
  }

  public void setPricingScheme( String pricingScheme )
  {
    this.pricingScheme = pricingScheme;
  }

  public String getPricePerUnitInCents()
  {
    return pricePerUnitInCents;
  }

  public void setPricePerUnitInCents( String pricePerUnitInCents )
  {
    this.pricePerUnitInCents = pricePerUnitInCents;
  }

  public String getProductFamilyId()
  {
    return productFamilyId;
  }

  public void setProductFamilyId( String productFamilyId )
  {
    this.productFamilyId = productFamilyId;
  }

  public Boolean getArchived()
  {
    return archived;
  }

  public void setArchived( Boolean archived )
  {
    this.archived = archived;
  }

  public boolean getTaxable()
  {
    return taxable;
  }

  public void setTaxable( boolean taxable )
  {
    this.taxable = taxable;
  }

  public String getKind()
  {
    return kind;
  }

  public void setKind( String kind )
  {
    this.kind = kind;
  }

  public List<PriceBracket> getPrices()
  {
    return prices;
  }

  public void setPrices( List<PriceBracket> prices )
  {
    this.prices = prices;
  }
}
