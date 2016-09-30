package com.chargify.controller;

import com.chargify.model.ComponentDefinition;
import com.chargify.model.ComponentLineItem;
import com.chargify.model.webhooks.WebhookEntity;
import com.chargify.services.ComponentsService;
import com.chargify.webhooks.CountedWebhookHandler;
import com.chargify.webhooks.WebhookHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChargifyController
{
	@Autowired
	@Qualifier("counted")
	private WebhookHandler webhookHandler;
	@Autowired
	private ComponentsService service;

	@RequestMapping("/product_families/{productFamilyId}/components.json")
	@ResponseBody
	public List<ComponentDefinition> getProductFamilyById( final @PathVariable String productFamilyId ) {
		return service.getComponentDefinitions( productFamilyId );
	}

	@RequestMapping(value = "/subscriptions/{subscriptionId}/components/{componentId}", method = RequestMethod.GET)
	@ResponseBody
	public ComponentLineItem getComponent( final @PathVariable Integer subscriptionId, final @PathVariable Integer componentId ) {
		return service.getComponentLineItem( subscriptionId, componentId );
	}

	@RequestMapping(value = "/webhook", method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void handleWebhook( final WebhookEntity webhook ) {
		webhookHandler.handle( webhook );
	}

	@RequestMapping(value = "/webhook/stats", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Integer> getWebhookStats() {
		if( webhookHandler instanceof CountedWebhookHandler )
		{
			return ((CountedWebhookHandler) webhookHandler).getStats();
		}
		return new HashMap<>();
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}

}
