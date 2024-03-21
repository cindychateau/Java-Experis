package com.codingdojo.cynthia.controladores;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.payment.PaymentClient;
import com.mercadopago.client.payment.PaymentCreateRequest;
import com.mercadopago.client.payment.PaymentPayerRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.payment.Payment;


@Controller
public class ControladorMercadoPago {
	
	@PostMapping("/process_payment")
	public String process_payment(@RequestParam("transaction_amount") BigDecimal transactionAmount,
								  @RequestParam("token") String token,
								  @RequestParam("description") String description,
								  @RequestParam("paymentMethodId") String paymentMethodId,
								  @RequestParam("email" ) String email)  {
		MercadoPagoConfig.setAccessToken("TEST-6209326045776048-101618-9ff6102e1000e7e3b02a44890809843b-21283552");
		
	    PaymentClient client = new PaymentClient();

	    PaymentCreateRequest createRequest =
	            PaymentCreateRequest.builder()
	                .transactionAmount(transactionAmount)
	                .token(token)
	                .description(description)
	                .installments(1)
	                .paymentMethodId(paymentMethodId)
	                .payer(PaymentPayerRequest.builder().email(email).build())
	                .build();

	        try {
	          Payment payment = client.create(createRequest);
	          System.out.println(payment);
	        } catch (MPApiException ex) {
	          System.out.printf(
	              "MercadoPago Error. Status: %s, Content: %s%n",
	              ex.getApiResponse().getStatusCode(), ex.getApiResponse().getContent());
	        } catch (MPException ex) {
	          ex.printStackTrace();
	        }
		
		return "index.jsp";
	}
	
}
