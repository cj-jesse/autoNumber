package com.seeyon.apps.autonum.clocked.util;

/**
 * 字符串工具类
 * 
 * @author wangguocheng
 *
 */
public class StringUtil {

	/**
	 * 判断字符串是否为null
	 * 
	 * @param str
	 * @return
	 */
	public static Boolean isEmpty(String str) {
		return str == null ? true : str.equals("null") ? true : str.equals("") ? true : false;
	}

	/**
	 * 判断字符串是否为null
	 * 
	 * @param str
	 * @return
	 */
	public static Boolean isNotEmpty(String str) {
		return str == null ? false : str.equals("") ? false : str.equals("null") ? false : true;
	}

}
