//package com.campushaat.rangerapp.utils;
//
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//
//import com.campushaat.rangerapp.model.Address;
////import com.campushaat.rangerapp.model.Elements;
////import com.campushaat.rangerapp.model.TextValue;
//
//
//public class TimeDistanceHandler {
//
//	/**
//	 * @param buyerAddress
//	 * @param address
//	 * @return
//	 */
//	public static Elements getTimeDistance(Address buyerAddress, Address address) {
//		
//		String googleMatrixURL;
//		String origins;
//		String destinations;
//		String key;
//
//		TextValue timeEstimate = new TextValue();
//		TextValue distanceEstimate = new TextValue();
//		
//		// Google Matrix API
//		googleMatrixURL = Constants.googleMatrixApiUrl;
//		
//		// Origin location
//		origins = "origins=";
//		if(buyerAddress!=null) {
//			origins = origins + buyerAddress.getLatitude()+ "," +buyerAddress.getLongitude();
//		}
//
//		// Destination location
//		destinations = "&destinations=";
//		if(address!=null && address.getLatitude()!=null && address.getLongitude()!=null) {
//			destinations = destinations + address.getLatitude() + "," + address.getLongitude();
//		}
//		
//		key = "&key="+Constants.googleMatrixAPIKey;
//		googleMatrixURL = googleMatrixURL + origins + destinations + key;
//		System.out.print(googleMatrixURL + "\n");
//		
//		RestClient restClient = new RestClient(googleMatrixURL);
//		ArrayList<Elements> elements = restClient.getTimeDistance();
//
//		for(int j=0; j<elements.size(); j++) {
//			if(elements.get(j).getDuration()!=null) {
//				
//				timeEstimate = getMax(timeEstimate, elements.get(j).getDuration());
//				distanceEstimate = getMax(distanceEstimate, elements.get(j).getDistance());
//			}
//		}
//		return new Elements(timeEstimate, distanceEstimate);
//	}
//	
//	private static TextValue getMax(TextValue timeEstimate, TextValue input) {
//		
//		if(timeEstimate==null || timeEstimate.getText()==null) return input;
//		if(input==null || input.getText()==null) return timeEstimate;
//		
//		if(Integer.parseInt(timeEstimate.getValue()) < Integer.parseInt(input.getValue()))
//			return input;
//		else return timeEstimate;
//	}
//	
//	/*
//	 * @param distance
//	 * @return
//	 * guddu
//	 * 2018 Dec 19, 2018 6:24:54 PM
//	 * 
//	 * TODO 
//	 */
//	public static TextValue getDistanceTVFromValue(Double distance) {
//		
//		if(distance == 0) {
//			return new TextValue("");
//		}else if(distance < 0.1) {
//			distance=distance*1000;
//			return new TextValue(new DecimalFormat(".#").format(distance)+" m");
//		}else {
//			return new TextValue(new DecimalFormat(".#").format(distance)+" km");
//		}
//	}
//}
