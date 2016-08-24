package me.frame.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;


public abstract class DateUtil {
	
	private static final Logger log= LoggerFactory.getLogger(DateUtil.class);
	
	public static final String DATE_FORMAT_PATTERN="yyyy-MM-dd HH:mm:ss";
	
	public static Date time(){
		return Calendar.getInstance().getTime();
	}
	
	/**
	 * strDate要和pattern格式相匹配，否则返回当前的Date
	 * strDate : 201608241052
	 * pattern : yyyyMMddHHmmss
	 * @param strDate
	 * @param pattern
	 * @return java.util.Date
	 * @since 20160824---zhang
	 */
	public static Date getDateWithPattern(String strDate, String pattern)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			log.error("date类型的字符\""+strDate+"\"和pattern\""+pattern+"\"不匹配,已返回当前日期");
			return new Date();
		}
		return date;
	}
	
	
}
