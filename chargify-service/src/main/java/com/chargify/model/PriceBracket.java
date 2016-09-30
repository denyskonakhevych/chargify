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

import java.io.Serializable;

@JsonIgnoreProperties( ignoreUnknown = true )
public class PriceBracket implements Serializable
{
  public PriceBracket()
  {
  }

  @JsonProperty( "starting_quantity" )
  private String startingQuantity;

  @JsonProperty( "ending_quantity" )
  private String endingQuantity;

  @JsonProperty( "unit_price" )
  private String unitPrice;

  public String getStartingQuantity()
  {
    return startingQuantity;
  }

  public void setStartingQuantity( String startingQuantity )
  {
    this.startingQuantity = startingQuantity;
  }

  public String getEndingQuantity()
  {
    return endingQuantity;
  }

  public void setEndingQuantity( String endingQuantity )
  {
    this.endingQuantity = endingQuantity;
  }

  public String getUnitPrice()
  {
    return unitPrice;
  }

  public void setUnitPrice( String unitPrice )
  {
    this.unitPrice = unitPrice;
  }
}
