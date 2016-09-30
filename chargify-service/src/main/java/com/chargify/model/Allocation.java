package com.chargify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Allocation
{
  @JsonProperty( "component_id" )
  private Integer id;

  @JsonProperty( "subscription" )
  private Integer subscriptionId;

  private int quantity;

  @JsonProperty( "previous_quantity" )
  private int previousQuantity;

  private String memo;

  private Date timestamp;

  @JsonProperty( "proration_upgrade_scheme" )
  private String prorationUpgradeScheme;

  @JsonProperty( "proration_downgrade_scheme" )
  private String prorationDowngradeScheme;

  @JsonProperty( "payment_collection_method" )
  private String paymentCollectionMethod;

  private Payment payment;

  public Allocation()
  {
  }

  public Allocation( int id, int quantity )
  {
    this.id = id;
    this.quantity = quantity;
  }

  public Allocation( int quantity )
  {
    this.quantity = quantity;
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

  public String getPaymentCollectionMethod()
  {
    return paymentCollectionMethod;
  }

  public void setPaymentCollectionMethod( String paymentCollectionMethod )
  {
    this.paymentCollectionMethod = paymentCollectionMethod;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setQuantity( int quantity )
  {
    this.quantity = quantity;
  }

  public String getMemo()
  {
    return memo;
  }

  public void setMemo( String memo )
  {
    this.memo = memo;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId( Integer id )
  {
    this.id = id;
  }

  public Integer getSubscriptionId()
  {
    return subscriptionId;
  }

  public void setSubscriptionId( Integer subscriptionId )
  {
    this.subscriptionId = subscriptionId;
  }

  public int getPreviousQuantity()
  {
    return previousQuantity;
  }

  public void setPreviousQuantity( int previousQuantity )
  {
    this.previousQuantity = previousQuantity;
  }

  public Date getTimestamp()
  {
    return timestamp;
  }

  public void setTimestamp( Date timestamp )
  {
    this.timestamp = timestamp;
  }

  public Payment getPayment()
  {
    return payment;
  }

  public void setPayment( Payment payment )
  {
    this.payment = payment;
  }
}
