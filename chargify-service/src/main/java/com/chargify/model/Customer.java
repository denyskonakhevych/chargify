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
public class Customer
{
  // Required
  @JsonProperty( "first_name" )
  private String firstName;

  @JsonProperty( "last_name" )
  private String lastName;

  private String email;

  // Optional, but better to have
  private String reference;

  // Optional
  private String organization;

  @JsonProperty( "vat_number" )
  private String vatNumber;

  private String address;

  @JsonProperty( "address_2" )
  private String address2;

  private String city;

  private String state;

  private String zip;

  private String country;

  private String phone;

  // Read-only
  private String id;

  @JsonProperty( "created_at" )
  private Date createdAt;

  @JsonProperty( "updated_at" )
  private Date updatedAt;

  public Customer()
  {

  }

  public Customer( String firstName, String lastName, String email, String reference )
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.reference = reference;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName( String firstName )
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName( String lastName )
  {
    this.lastName = lastName;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail( String email )
  {
    this.email = email;
  }

  public String getReference()
  {
    return reference;
  }

  public void setReference( String reference )
  {
    this.reference = reference;
  }

  public String getOrganization()
  {
    return organization;
  }

  public void setOrganization( String organization )
  {
    this.organization = organization;
  }

  public String getVatNumber()
  {
    return vatNumber;
  }

  public void setVatNumber( String vatNumber )
  {
    this.vatNumber = vatNumber;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress( String address )
  {
    this.address = address;
  }

  public String getAddress2()
  {
    return address2;
  }

  public void setAddress2( String address2 )
  {
    this.address2 = address2;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity( String city )
  {
    this.city = city;
  }

  public String getState()
  {
    return state;
  }

  public void setState( String state )
  {
    this.state = state;
  }

  public String getZip()
  {
    return zip;
  }

  public void setZip( String zip )
  {
    this.zip = zip;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry( String country )
  {
    this.country = country;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setPhone( String phone )
  {
    this.phone = phone;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getId()
  {
    return id;
  }

  public Date getCreatedAt()
  {
    return createdAt;
  }

  public Date getUpdatedAt()
  {
    return updatedAt;
  }

  public void setCreatedAt( Date createdAt )
  {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt( Date updatedAt )
  {
    this.updatedAt = updatedAt;
  }
}
