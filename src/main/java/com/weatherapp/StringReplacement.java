package com.weatherapp;

public class StringReplacement {
	
	public  static String StringReplace (String payload){
		
		
		
		String Payload = payload.replaceAll("&amp;lt;", "<");			
		Payload = Payload.replaceAll("&amp;gt;", ">");		
		Payload =Payload.replaceAll("&lt;", "<");
		Payload =Payload.replaceAll("&gt;", ">");
		Payload =Payload.replace("<![CDATA[" ,"");
		Payload =Payload.replace("]]" ,"");		
		Payload = Payload.trim();
		
		
		
		return Payload;
		
	}
	


}
