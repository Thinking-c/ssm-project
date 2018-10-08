package com.thinking.ws.test;

import java.util.Iterator;

import javax.xml.namespace.QName;

import ocpp.cp._2012._06.CancelReservationRequest;
import ocpp.cp._2012._06.ChargePointService;
import ocpp.cp._2012._06.ChargePointService_Service;
import ocpp.cs._2012._06.AuthorizeRequest;
import ocpp.cs._2012._06.BootNotificationRequest;
import ocpp.cs._2012._06.CentralSystemService;
import ocpp.cs._2012._06.CentralSystemService_Service;

/**
 *@Author:caoj
 *@Date:2018/09/04
 *@version:v1.0
 *@Description:
 */
public class OcppTest {
	
	public static void main(String[] args) {
		ChargePointService_Service factoryCP = new  ChargePointService_Service();
		ChargePointService chargePointService = factoryCP.getChargePointServiceSoap12();
//		
//		CancelReservationRequest cancelReservationRequest = new CancelReservationRequest(); 
//		cancelReservationRequest.setReservationId(1);
//		chargePointService.cancelReservation(cancelReservationRequest);
		
		CentralSystemService_Service factoryCS = new CentralSystemService_Service();
		CentralSystemService centralSystemService = factoryCS.getCentralSystemServiceSoap12();
		
		AuthorizeRequest parameters = new AuthorizeRequest();
		parameters.setIdTag("1234567890");
		centralSystemService.authorize(parameters);
		
		BootNotificationRequest parametersB = new BootNotificationRequest();
		parametersB.setChargeBoxSerialNumber("123456789");
		
		
//		centralSystemService.bootNotification(parametersB);
	}

}
