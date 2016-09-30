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

import java.util.Date;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Product
{
  public Product()
  {
  }

  private String id;
  private String name;
  private String handle;
  private String description;

  @JsonProperty( "price_in_cents" )
  private String priceInCents;

  @JsonProperty( "accounting_code" )
  private String accountingCode;

  @JsonProperty( "product_family" )
  private ProductFamily productFamily;

  @JsonProperty( "initial_charge_in_cents" )
  private String initialChargeInCents;

  @JsonProperty( "interval_unit" )
  private String intervalUnit;

  private String interval;

  @JsonProperty( "trial_price_in_cents" )
  private String trialPriceInCents;

  @JsonProperty( "trial_interval_unit" )
  private String trialIntervalUnit;

  @JsonProperty( "trial_interval" )
  private String trialInterval;

  @JsonProperty( "expiration_interval_unit" )
  private String expirationIntervalUnit;

  @JsonProperty( "expiration_interval" )
  private String expirationInterval;

  @JsonProperty( "return_url" )
  private String returnUrl;

  @JsonProperty( "update_return_url" )
  private Date update_return_url;

  @JsonProperty( "return_params" )
  private String returnParams;

  @JsonProperty( "require_credit_card" )
  private Boolean requireCreditCard;

  @JsonProperty( "request_credit_card" )
  private Boolean requestCreditCard;

  @JsonProperty( "created_at" )
  private Date createdAt;

  @JsonProperty( "updated_at" )
  private Date updatedAt;

  @JsonProperty( "archived_at" )
  private Date archivedAt;

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

  public String getHandle()
  {
    return handle;
  }

  public void setHandle( String handle )
  {
    this.handle = handle;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription( String description )
  {
    this.description = description;
  }

  public String getPriceInCents()
  {
    return priceInCents;
  }

  public void setPriceInCents( String priceInCents )
  {
    this.priceInCents = priceInCents;
  }

  public String getAccountingCode()
  {
    return accountingCode;
  }

  public void setAccountingCode( String accountingCode )
  {
    this.accountingCode = accountingCode;
  }

  public ProductFamily getProductFamily()
  {
    return productFamily;
  }

  public void setProductFamily( ProductFamily productFamily )
  {
    this.productFamily = productFamily;
  }

  public String getInitialChargeInCents()
  {
    return initialChargeInCents;
  }

  public void setInitialChargeInCents( String initialChargeInCents )
  {
    this.initialChargeInCents = initialChargeInCents;
  }

  public String getIntervalUnit()
  {
    return intervalUnit;
  }

  public void setIntervalUnit( String intervalUnit )
  {
    this.intervalUnit = intervalUnit;
  }

  public String getInterval()
  {
    return interval;
  }

  public void setInterval( String interval )
  {
    this.interval = interval;
  }

  public String getTrialPriceInCents()
  {
    return trialPriceInCents;
  }

  public void setTrialPriceInCents( String trialPriceInCents )
  {
    this.trialPriceInCents = trialPriceInCents;
  }

  public String getTrialIntervalUnit()
  {
    return trialIntervalUnit;
  }

  public void setTrialIntervalUnit( String trialIntervalUnit )
  {
    this.trialIntervalUnit = trialIntervalUnit;
  }

  public String getTrialInterval()
  {
    return trialInterval;
  }

  public void setTrialInterval( String trialInterval )
  {
    this.trialInterval = trialInterval;
  }

  public String getExpirationIntervalUnit()
  {
    return expirationIntervalUnit;
  }

  public void setExpirationIntervalUnit( String expirationIntervalUnit )
  {
    this.expirationIntervalUnit = expirationIntervalUnit;
  }

  public String getExpirationInterval()
  {
    return expirationInterval;
  }

  public void setExpirationInterval( String expirationInterval )
  {
    this.expirationInterval = expirationInterval;
  }

  public String getReturnUrl()
  {
    return returnUrl;
  }

  public void setReturnUrl( String returnUrl )
  {
    this.returnUrl = returnUrl;
  }

  public Date getUpdate_return_url()
  {
    return update_return_url;
  }

  public void setUpdate_return_url( Date update_return_url )
  {
    this.update_return_url = update_return_url;
  }

  public String getReturnParams()
  {
    return returnParams;
  }

  public void setReturnParams( String returnParams )
  {
    this.returnParams = returnParams;
  }

  public Boolean getRequireCreditCard()
  {
    return requireCreditCard;
  }

  public void setRequireCreditCard( Boolean requireCreditCard )
  {
    this.requireCreditCard = requireCreditCard;
  }

  public Boolean getRequestCreditCard()
  {
    return requestCreditCard;
  }

  public void setRequestCreditCard( Boolean requestCreditCard )
  {
    this.requestCreditCard = requestCreditCard;
  }

  public Date getCreatedAt()
  {
    return createdAt;
  }

  public void setCreatedAt( Date createdAt )
  {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt()
  {
    return updatedAt;
  }

  public void setUpdatedAt( Date updatedAt )
  {
    this.updatedAt = updatedAt;
  }

  public Date getArchivedAt()
  {
    return archivedAt;
  }

  public void setArchivedAt( Date archivedAt )
  {
    this.archivedAt = archivedAt;
  }
}
