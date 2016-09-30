package com.chargify.services;

import com.chargify.model.ComponentDefinition;
import com.chargify.model.ComponentLineItem;
import com.chargify.model.wrappers.ComponentWrapper;
import com.chargify.services.handlers.ChargifyErrorHandler;
import com.chargify.properties.ChargifyProperties;
import com.chargify.properties.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ComponentsService
{
  @Autowired
  private ChargifyProperties chargifyProperties;

  @Autowired
  private RestTemplateBuilder restTemplateBuilder;

  public List<ComponentDefinition> getComponentDefinitions( final String productFamilyId ){
    final String url = chargifyProperties.getHost() + "/product_families/{productFamilyId}/components.json";
    final HttpEntity<String> entity = new HttpEntity<>( getHeaders() );
    final ParameterizedTypeReference<List<ComponentWrapper<ComponentDefinition>>> typeRef = new ParameterizedTypeReference<List<ComponentWrapper<ComponentDefinition>>>() {};
    final ResponseEntity<List<ComponentWrapper<ComponentDefinition>>> response  = getTemplate().exchange( url, HttpMethod.GET, entity, typeRef, productFamilyId );
    return response.getBody().stream()
            .map( ComponentWrapper::getComponent )
            .collect( Collectors.toList() );
  }

  public ComponentLineItem getComponentLineItem( final Integer subscriptionId, final Integer componentId ){
    final String url = chargifyProperties.getHost() + "/subscriptions/{subscriptionId}/components/{componentId}.json";
    final HttpEntity<String> entity = new HttpEntity<>( getHeaders() );
    final ParameterizedTypeReference<ComponentWrapper<ComponentLineItem>> typeRef = new ParameterizedTypeReference<ComponentWrapper<ComponentLineItem>>() {};
    final ResponseEntity<ComponentWrapper<ComponentLineItem>> response  = getTemplate().exchange( url, HttpMethod.GET, entity, typeRef, subscriptionId, componentId );
    return response.getBody().getComponent();
  }

  private HttpHeaders getHeaders()
  {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType( MediaType.APPLICATION_JSON_UTF8 );
    return headers;
  }

  private RestTemplate getTemplate()
  {
    final Keys keys = chargifyProperties.getAuth().getV1();
    return restTemplateBuilder.basicAuthorization( keys.getApikey(), keys.getPassword() )
            .errorHandler( new ChargifyErrorHandler() )
            .build();
  }
}
