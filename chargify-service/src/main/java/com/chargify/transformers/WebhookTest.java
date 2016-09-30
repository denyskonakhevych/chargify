package com.chargify.transformers;

import com.chargify.model.webhooks.PaymentWebhookEntity;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WebhookTest
{
  private final static String PAYMENT_PAYLOAD =
          "id=111111111&" +
                  "event=payment_success&" +
                  "payload[site][id]=22222&" +
                  "payload[site][subdomain]=domain&" +
                  "payload[subscription][id]=33333333&" +
                  "payload[subscription][state]=active&" +
                  "payload[subscription][trial_started_at]=&" +
                  "payload[subscription][trial_ended_at]=&" +
                  "payload[subscription][activated_at]=2011-01-02 13:45:56 -0400&" +
                  "payload[subscription][created_at]=2016-08-09 08:18:04 -0400&" +
                  "payload[subscription][updated_at]=2016-08-11 07:58:05 -0400&" +
                  "payload[subscription][expires_at]=&" +
                  "payload[subscription][balance_in_cents]=0&" +
                  "payload[subscription][current_period_ends_at]=2016-09-01 00:00:00 -0400&" +
                  "payload[subscription][next_assessment_at]=2016-09-01 00:00:00 -0400&" +
                  "payload[subscription][canceled_at]=&" +
                  "payload[subscription][cancellation_message]=&" +
                  "payload[subscription][next_product_id]=&" +
                  "payload[subscription][cancel_at_end_of_period]=&" +
                  "payload[subscription][payment_collection_method]=automatic&" +
                  "payload[subscription][snap_day]=&" +
                  "payload[subscription][cancellation_method]=&" +
                  "payload[subscription][current_period_started_at]=2016-08-09 08:18:04 -0400&" +
                  "payload[subscription][previous_state]=active&" +
                  "payload[subscription][signup_payment_id]=0&" +
                  "payload[subscription][signup_revenue]=0.00&" +
                  "payload[subscription][delayed_cancel_at]=&" +
                  "payload[subscription][coupon_code]=&" +
                  "payload[subscription][total_revenue_in_cents]=1234&" +
                  "payload[subscription][product_price_in_cents]=0&" +
                  "payload[subscription][product_version_number]=1&" +
                  "payload[subscription][payment_type]=credit_card&" +
                  "payload[subscription][referral_code]=&" +
                  "payload[subscription][customer][id]=12345678&" +
                  "payload[subscription][customer][first_name]=First&" +
                  "payload[subscription][customer][last_name]=Last&" +
                  "payload[subscription][customer][organization]=&" +
                  "payload[subscription][customer][email]=em%40il.com&" +
                  "payload[subscription][customer][created_at]=&" +
                  "payload[subscription][customer][updated_at]=&" +
                  "payload[subscription][customer][reference]=1&" +
                  "payload[subscription][customer][address]=&" +
                  "payload[subscription][customer][address_2]=&" +
                  "payload[subscription][customer][city]=&" +
                  "payload[subscription][customer][state]=&" +
                  "payload[subscription][customer][zip]=&" +
                  "payload[subscription][customer][country]=&" +
                  "payload[subscription][customer][phone]=&" +
                  "payload[subscription][customer][portal_invite_last_sent_at]=&" +
                  "payload[subscription][customer][portal_invite_last_accepted_at]=&" +
                  "payload[subscription][customer][verified]=false&" +
                  "payload[subscription][customer][portal_customer_created_at]=&" +
                  "payload[subscription][customer][cc_emails]=&" +
                  "payload[subscription][product][id]=666666666&" +
                  "payload[subscription][product][name]=Free%20Plan&" +
                  "payload[subscription][product][handle]=free-plan&" +
                  "payload[subscription][product][description]=&" +
                  "payload[subscription][product][accounting_code]=&" +
                  "payload[subscription][product][request_credit_card]=true&" +
                  "payload[subscription][product][expiration_interval]=&" +
                  "payload[subscription][product][expiration_interval_unit]=never&" +
                  "payload[subscription][product][created_at]=2014-02-07 05:42:29 -0400&" +
                  "payload[subscription][product][updated_at]=2014-02-07 05:42:29 -0400&" +
                  "payload[subscription][product][price_in_cents]=0&" +
                  "payload[subscription][product][interval]=1&" +
                  "payload[subscription][product][interval_unit]=month&" +
                  "payload[subscription][product][initial_charge_in_cents]=0&" +
                  "payload[subscription][product][trial_price_in_cents]=0&" +
                  "payload[subscription][product][trial_interval]=1&" +
                  "payload[subscription][product][trial_interval_unit]=month&" +
                  "payload[subscription][product][archived_at]=&" +
                  "payload[subscription][product][require_credit_card]=true&" +
                  "payload[subscription][product][return_params]=&" +
                  "payload[subscription][product][taxable]=false&" +
                  "payload[subscription][product][update_return_url]=&" +
                  "payload[subscription][product][initial_charge_after_trial]=false&" +
                  "payload[subscription][product][version_number]=1&" +
                  "payload[subscription][product][update_return_params]=&" +
                  "payload[subscription][product][product_family][id]=376743&" +
                  "payload[subscription][product][product_family][name]=Backendless%20Online&" +
                  "payload[subscription][product][product_family][description]=This%20is%20a%20product%20family%20for%20the%20service%20offerred%20through%20backendless.com.&" +
                  "payload[subscription][product][product_family][handle]=backendless&" +
                  "payload[subscription][product][product_family][accounting_code]=&" +
                  "payload[subscription][product][public_signup_pages][id]=75367&" +
                  "payload[subscription][product][public_signup_pages][return_url]=&" +
                  "payload[subscription][product][public_signup_pages][return_params]=&" +
                  "payload[subscription][product][public_signup_pages][url]=https%3A%2F%2Fbackendlesstest.chargify.com%2Fsubscribe%2F9a1dbf421bc5%2Ffree-plan&" +
                  "payload[subscription][credit_card][id]=9242085&" +
                  "payload[subscription][credit_card][first_name]=1&" +
                  "payload[subscription][credit_card][last_name]=1&" +
                  "payload[subscription][credit_card][masked_card_number]=XXXX-XXXX-XXXX-1&" +
                  "payload[subscription][credit_card][card_type]=bogus&" +
                  "payload[subscription][credit_card][expiration_month]=2&" +
                  "payload[subscription][credit_card][expiration_year]=2023&" +
                  "payload[subscription][credit_card][customer_id]=12689379&" +
                  "payload[subscription][credit_card][current_vault]=bogus&" +
                  "payload[subscription][credit_card][vault_token]=1&" +
                  "payload[subscription][credit_card][billing_address]=&" +
                  "payload[subscription][credit_card][billing_city]=&" +
                  "payload[subscription][credit_card][billing_state]=&" +
                  "payload[subscription][credit_card][billing_zip]=&" +
                  "payload[subscription][credit_card][billing_country]=&" +
                  "payload[subscription][credit_card][customer_vault_token]=&" +
                  "payload[subscription][credit_card][billing_address_2]=&" +
                  "payload[subscription][credit_card][payment_type]=credit_card&" +
                  "payload[transaction][id]=148525123&" +
                  "payload[transaction][subscription_id]=13818748&" +
                  "payload[transaction][type]=Payment&" +
                  "payload[transaction][kind]=component_proration&" +
                  "payload[transaction][transaction_type]=payment&" +
                  "payload[transaction][success]=true&" +
                  "payload[transaction][amount_in_cents]=1825&" +
                  "payload[transaction][memo]=Payment%20for%3A%20Prorated%20component%20allocation%20changes.&" +
                  "payload[transaction][created_at]=2016-08-11 07:58:05 -0400&" +
                  "payload[transaction][starting_balance_in_cents]=1825&" +
                  "payload[transaction][ending_balance_in_cents]=0&" +
                  "payload[transaction][gateway_used]=bogus&" +
                  "payload[transaction][gateway_transaction_id]=53433&" +
                  "payload[transaction][gateway_order_id]=&" +
                  "payload[transaction][payment_id]=&" +
                  "payload[transaction][product_id]=3378127&" +
                  "payload[transaction][tax_id]=&" +
                  "payload[transaction][component_id]=&" +
                  "payload[transaction][statement_id]=74943997&" +
                  "payload[transaction][customer_id]=12689379&" +
                  "payload[transaction][card_number]=XXXX-XXXX-XXXX-1&" +
                  "payload[transaction][card_expiration]=02%2F2023&" +
                  "payload[transaction][card_type]=bogus&" +
                  "payload[transaction][refunded_amount_in_cents]=0&" +
                  "payload[transaction][invoice_id]=&" +
                  "payload[event_id]=316222771";

  public static void main( String[] args )
  {
    final Map<String, String[]> webhookBody = getTestData();
    final Map<String, Object> webhookData = WebhookParser.parse( webhookBody );
    final String event = (String)webhookData.get( "event" );
    PaymentWebhookEntity webHookEntity = WebhookFactory.create( webhookData, PaymentWebhookEntity.class );
    System.out.println(webHookEntity);
  }

  private static Map<String, String[]> getTestData()
  {
    return Arrays.asList( PAYMENT_PAYLOAD.split( "&" ) )
            .stream()
            .map( WebhookTest::splitRecordForTest )
            .collect( Collectors.toMap( recordParts -> recordParts[ 0 ],
                                        recordParts -> new String[] { recordParts[ 1 ] },
                                        ( s1, s2 ) -> {
                                          throw new IllegalStateException( String.format( "Duplicate key %s", s1 ) );
                                        },
                                        LinkedHashMap<String, String[]>::new ) );
  }

  private static String[] splitRecordForTest( String record )
  {
    String[] splitedRecord = record.split( "=" );
    if( splitedRecord.length == 1 )
      return new String[] { splitedRecord[0], "" };
    return splitedRecord;
  }
}
