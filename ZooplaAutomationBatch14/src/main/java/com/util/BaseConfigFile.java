package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public  class BaseConfigFile {
	
	static Properties pro;
	
	public static String  getData(String data) {	
		
try {
	File file = new File("./Confige.Properties");
	
	FileInputStream fis = new FileInputStream(file);
	
	pro = new Properties();
	pro.load(fis);
	System.out.println(pro.getProperty(data));
}catch(Exception e) {
e.printStackTrace();

}	
return pro.getProperty(data);
	}
	

	
	}	

