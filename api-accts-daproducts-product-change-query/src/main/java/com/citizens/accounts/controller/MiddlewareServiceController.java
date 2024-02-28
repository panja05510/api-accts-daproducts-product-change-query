package com.citizens.accounts.controller;

import java.io.IOException;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citizens.accounts.model.ProductChangeRequest;
import com.citizens.accounts.model.SavingsBalanceResponseModel;
import com.citizens.accounts.service.RequestResponseHandler;




@RestController
@RequestMapping("/product-change")
public class MiddlewareServiceController {
	@Autowired
	SavingsBalanceResponseModel savingsBalanceResponseModel;
	
	@Autowired
	RequestResponseHandler requestResponseHandler;

	@PostMapping("/query")
	public String mainframeResponse(@RequestBody ProductChangeRequest savingsAccountDetails)
			throws IOException, JMSException {

		System.out.println(savingsAccountDetails.toString());
		String obj = requestResponseHandler.callMq(savingsAccountDetails);

		return obj;

	}

}
