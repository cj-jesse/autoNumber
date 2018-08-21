package com.seeyon.apps.autonum.clocked.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

	private static SimpleDateFormat simpleDateFormat = null;
	
	public static String getFormatDate(String date,String sFormat,String eFormat){
		simpleDateFormat = new SimpleDateFormat(sFormat);
		try {
			Date date2 = simpleDateFormat.parse(date);
			simpleDateFormat = new SimpleDateFormat(eFormat);
			date = simpleDateFormat.format(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	
}
