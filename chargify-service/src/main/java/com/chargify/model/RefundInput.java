package com.chargify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Denys Konakhevych on 10.09.15.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class RefundInput
{
  @JsonProperty( "payment_id" )
  private String paymentId;

  @JsonProperty( "amount_in_cents" )
  private int amountInCents;

  @JsonProperty( "memo" )
  private String memo;

  public RefundInput()
  {
  }

  public RefundInput( String paymentId, int amountInCents, String memo )
  {
    this.paymentId = paymentId;
    this.amountInCents = amountInCents;
    this.memo = memo;
  }

  public String getPaymentId()
  {
    return paymentId;
  }

  public void setPaymentId( String paymentId )
  {
    this.paymentId = paymentId;
  }

  public int getAmountInCents()
  {
    return amountInCents;
  }

  public void setAmountInCents( int amountInCents )
  {
    this.amountInCents = amountInCents;
  }

  public String getMemo()
  {
    return memo;
  }

  public void setMemo( String memo )
  {
    this.memo = memo;
  }
}
