package com.chargify.services.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

public class ChargifyErrorHandler implements ResponseErrorHandler
{
  @Override
  public boolean hasError( ClientHttpResponse response ) throws IOException
  {
    return (response.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR)
            || (response.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);
  }

  @Override
  public void handleError( ClientHttpResponse response ) throws IOException
  {
    if (response.getStatusCode() == HttpStatus.NOT_FOUND)
    {
      throw new RuntimeException( "Not found" );
    }
    throw new HttpClientErrorException( response.getStatusCode() );
  }
}
