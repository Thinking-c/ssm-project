package com.thinking.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import ocpp.cp._2012._06.ChargePointService;
import ocpp.cp._2012._06.ChargePointService_Service;
import ocpp.cp._2012._06.RemoteStartTransactionRequest;
import ocpp.cp._2012._06.RemoteStartTransactionResponse;

/**
 * @Author:caoj
 * @Date:2018/09/21
 * @version:v1.0
 * @Description:
 */
public class CPOcppTest {

	public static void main(String[] args) throws MalformedURLException {

		ChargePointService_Service fartory = new ChargePointService_Service(new URL("file:/C:/Users/Thinking/Desktop/ocpp_chargepointservice_1.5_final.wsdl"));
		ChargePointService chargePointService = fartory.getChargePointServiceSoap12();

		Client client = ClientProxy.getClient(chargePointService);
		List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
//		outInterceptors.add(new AuthOutInterceptor("chargedot_0"));

		// 客户端的日志出拦截器
		outInterceptors.add(new LoggingOutInterceptor());

		RemoteStartTransactionRequest parameters = new RemoteStartTransactionRequest();
		parameters.setConnectorId(1);
		parameters.setIdTag("TAG1234");
		String chargeBoxIdentity = "chargedot_0";
		RemoteStartTransactionResponse remoteStartTransaction = chargePointService.remoteStartTransaction(parameters, chargeBoxIdentity);
		System.out.println(remoteStartTransaction.getStatus().value());

	}

}
