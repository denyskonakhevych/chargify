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
public class SubscriptionOutput
{

  public SubscriptionOutput()
  {
  }

  private String id;

  private String state;

  @JsonProperty( "balance_in_cents" )
  private Integer balanceInCents;

  @JsonProperty( "current_period_started_at" )
  private Date currentPeriodStartedAt;

  @JsonProperty( "current_period_ends_at" )
  private Date currentPeriodEndsAt;

  @JsonProperty( "next_assessment_at" )
  private Date nextAssessmentAt;

  @JsonProperty( "trial_started_at" )
  private Date trialStartedAt;

  @JsonProperty( "trial_ended_at" )
  private Date trialEndedAt;

  @JsonProperty( "activated_at" )
  private Date activatedAt;

  @JsonProperty( "expires_at" )
  private Date expiresAt;

  @JsonProperty( "created_at" )
  private Date createdAt;

  @JsonProperty( "updated_at" )
  private Date updatedAt;

  @JsonProperty( "total_revenue_in_cents" )
  private Long totalRevenue;

  private Customer customer;

  private Product product;

  @JsonProperty( "credit_card" )
  private CreditCard creditCard;

  @JsonProperty( "cancellation_message" )
  private String cancellationMessage;

  @JsonProperty( "canceled_at" )
  private String canceledAt;

  @JsonProperty( "signup_revenue" )
  private String signupRevenue;

  @JsonProperty( "signup_payment_id" )
  private String signupPaymentId;

  @JsonProperty( "cancel_at_end_of_period" )
  private String cancelAtEndOfPeriod;

  @JsonProperty( "delayed_cancel_at" )
  private String delayedCancelAt;

  @JsonProperty( "previous_state" )
  private String previousState;

  @JsonProperty( "coupon_code" )
  private String couponCode;

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getState()
  {
    return state;
  }

  public void setState( String state )
  {
    this.state = state;
  }

  public Integer getBalanceInCents()
  {
    return balanceInCents;
  }

  public void setBalanceInCents( Integer balanceInCents )
  {
    this.balanceInCents = balanceInCents;
  }

  public Date getCurrentPeriodStartedAt()
  {
    return currentPeriodStartedAt;
  }

  public void setCurrentPeriodStartedAt( Date currentPeriodStartedAt )
  {
    this.currentPeriodStartedAt = currentPeriodStartedAt;
  }

  public Date getCurrentPeriodEndsAt()
  {
    return currentPeriodEndsAt;
  }

  public void setCurrentPeriodEndsAt( Date currentPeriodEndsAt )
  {
    this.currentPeriodEndsAt = currentPeriodEndsAt;
  }

  public Date getNextAssessmentAt()
  {
    return nextAssessmentAt;
  }

  public void setNextAssessmentAt( Date nextAssessmentAt )
  {
    this.nextAssessmentAt = nextAssessmentAt;
  }

  public Date getTrialStartedAt()
  {
    return trialStartedAt;
  }

  public void setTrialStartedAt( Date trialStartedAt )
  {
    this.trialStartedAt = trialStartedAt;
  }

  public Date getTrialEndedAt()
  {
    return trialEndedAt;
  }

  public void setTrialEndedAt( Date trialEndedAt )
  {
    this.trialEndedAt = trialEndedAt;
  }

  public Date getActivatedAt()
  {
    return activatedAt;
  }

  public void setActivatedAt( Date activatedAt )
  {
    this.activatedAt = activatedAt;
  }

  public Date getExpiresAt()
  {
    return expiresAt;
  }

  public void setExpiresAt( Date expiresAt )
  {
    this.expiresAt = expiresAt;
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

  public Customer getCustomer()
  {
    return customer;
  }

  public void setCustomer( Customer customer )
  {
    this.customer = customer;
  }

  public Product getProduct()
  {
    return product;
  }

  public void setProduct( Product product )
  {
    this.product = product;
  }

  public CreditCard getCreditCard()
  {
    return creditCard;
  }

  public void setCreditCard( CreditCard creditCard )
  {
    this.creditCard = creditCard;
  }

  public String getCancellationMessage()
  {
    return cancellationMessage;
  }

  public void setCancellationMessage( String cancellationMessage )
  {
    this.cancellationMessage = cancellationMessage;
  }

  public String getCanceledAt()
  {
    return canceledAt;
  }

  public void setCanceledAt( String canceledAt )
  {
    this.canceledAt = canceledAt;
  }

  public String getSignupRevenue()
  {
    return signupRevenue;
  }

  public void setSignupRevenue( String signupRevenue )
  {
    this.signupRevenue = signupRevenue;
  }

  public String getSignupPaymentId()
  {
    return signupPaymentId;
  }

  public void setSignupPaymentId( String signupPaymentId )
  {
    this.signupPaymentId = signupPaymentId;
  }

  public String getCancelAtEndOfPeriod()
  {
    return cancelAtEndOfPeriod;
  }

  public void setCancelAtEndOfPeriod( String cancelAtEndOfPeriod )
  {
    this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
  }

  public String getDelayedCancelAt()
  {
    return delayedCancelAt;
  }

  public void setDelayedCancelAt( String delayedCancelAt )
  {
    this.delayedCancelAt = delayedCancelAt;
  }

  public String getPreviousState()
  {
    return previousState;
  }

  public void setPreviousState( String previousState )
  {
    this.previousState = previousState;
  }

  public String getCouponCode()
  {
    return couponCode;
  }

  public void setCouponCode( String couponCode )
  {
    this.couponCode = couponCode;
  }

  public Long getTotalRevenue()
  {
    return totalRevenue;
  }

  public void setTotalRevenue( Long totalRevenue )
  {
    this.totalRevenue = totalRevenue;
  }
}
