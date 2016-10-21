package com.spider.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesUtil {
	
	    
	    private static Locale locale = new Locale("en", "US");
	    private static ResourceBundle bundle = ResourceBundle.getBundle("config", locale); 
	    
	    public static String getValue(String key){

		
		return bundle.getString(key);
		
	}
	
	public static int getValueForInt(String key){
		String val = bundle.getString(key);
		
		return Integer.parseInt(val);
		
		
	}

}
