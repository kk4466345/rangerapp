package com.campushaat.rangerapp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeHandler {

	/**
	 * @return current timestamp in "yyyy-MM-dd HH:mm:ss" format. ex: 2018-03-30 14:01:22
	 */
	public String CurrentTimeStamp() {
		
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateUrl = dateFormat.format(today);
		return dateUrl;
	}
	
	/**
	 * @return current timestamp in "yyyy-MM-dd HH:mm:ss" format. ex: 2018-03-30 14:01:22
	 */
	public static String CurrentTimeStampF1() {
		
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateUrl = dateFormat.format(today);
		return dateUrl;
	}
	
	/*
	 * @return
	 * guddu
	 * 2018 Jul 26, 2018 12:08:37 AM
	 * 
	 * TODO 
	 */
	public static String CurrentTimeStampF2() {
		
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		return dateFormat.format(today);
	}

	/**
	 * @return dateTime (String) in Date format
	 */
	public Date StringToDate(String dateTime) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		try {
			date = dateFormat.parse(dateTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	/*
	 * @param date
	 * @param formatIn
	 * @param formatOut
	 * @return
	 * guddu
	 * 2018 Dec 27, 2018 6:26:01 PM
	 * 
	 * TODO 
	 */
	public static String convertDateFormat(String dateStr, String formatIn, String formatOut) {
		
		SimpleDateFormat dateFormatIn = new SimpleDateFormat(formatIn);
		SimpleDateFormat dateFormatOut = new SimpleDateFormat(formatOut);
		Date date = new Date();
		String output = "";
		try {
			date = dateFormatIn.parse(dateStr);
			output = dateFormatOut.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}

	/*
	 * @param inputDate
	 * @return
	 * guddu
	 * 2018 Nov 22, 2018 6:00:22 PM
	 * 
	 * TODO 
	 * type = 0 (post), 1 (ride)
	 */
	public static String getDateText(String inputDate, int type) throws ParseException {
		
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		if(type==1) inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
		else if(type==2) inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM");
		return dateFormat.format(inputFormat.parse(inputDate));
	}
	
	/*
	 * @param inputDate
	 * @return
	 * guddu
	 * 2018 Nov 22, 2018 6:01:01 PM
	 * 
	 * TODO 
	 * type = 1 (ride)
	 */
	public static String getTimeText(String inputTime, int type) throws ParseException {
		
		SimpleDateFormat inputFormat = new SimpleDateFormat("HH:mm:ss");
		if(type==1) inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
		else if(type==2) inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
		return timeFormat.format(inputFormat.parse(inputTime));
	}
	
	/*
	 * @param inputDateTime
	 * @return
	 * @throws ParseException
	 * guddu
	 * 2018 Dec 21, 2018 4:04:59 PM
	 * 
	 * TODO 
	 */
	public static String getDateTimeText(String inputDateTime) throws ParseException {
		
		return getTimeText(inputDateTime, 2) + " " + getDateText(inputDateTime, 2);
	}
	
	/**
	 * @return timeDifference in seconds 
	 */
	public long getTimeDifference(String dateTime1, String dateTime2) {
		
		Date time1 = StringToDate(dateTime1);
		Date time2 = StringToDate(dateTime2);
		Long seconds = time1.getTime() - time2.getTime(); 
		
		// convert into seconds
		seconds /= 1000;
		return seconds;
	}
	

	/*
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 * guddu
	 * 2018 Dec 21, 2018 4:47:04 PM
	 * 
	 * get days difference between 2 date
	 * TODO 
	 */
	public static long getDaysDifference(String date1, String date2) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return TimeUnit.DAYS.convert(format.parse(date1).getTime() - format.parse(date2).getTime(), TimeUnit.MILLISECONDS);
	}

	/*
	 * @param format
	 * @param rideDate
	 * @param currentDate
	 * @return
	 * guddu
	 * 2018 Dec 20, 2018 5:11:55 PM
	 * 
	 * TODO 
	 */
	public static String getRideDepartText(String rideDate, String currentDate) {
	
	    long day, hour, minute;
	    Boolean isLeft;
	    String rideDepart = "";
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
	    
	    try {
	
	        day =  TimeUnit.DAYS.convert(format.parse(rideDate).getTime() - format.parse(currentDate).getTime(), TimeUnit.MILLISECONDS);
	        isLeft = day<0;
	        if(day<0) day*=-1;
	
	        hour = TimeUnit.HOURS.convert(format.parse(rideDate).getTime() - format.parse(currentDate).getTime(), TimeUnit.MILLISECONDS);
	        isLeft = hour<0 ? true : isLeft;
	        if(hour<0) hour*=-1;
	
	        minute = TimeUnit.MINUTES.convert(format.parse(rideDate).getTime() - format.parse(currentDate).getTime(), TimeUnit.MILLISECONDS);
	        isLeft = minute<0 ? true : isLeft;
	        if(minute<0) minute*=-1;
	
	        if(isLeft) rideDepart = rideDepart.concat("left ");
	        else rideDepart = rideDepart.concat("leaves in ");
	
	        if(day!=0) rideDepart = rideDepart.concat(String.valueOf(day) + " day ");
	        if(hour % 24!=0) rideDepart = rideDepart.concat(String.valueOf(hour % 24) + " hr ");
	        if(minute % 60!=0) rideDepart = rideDepart.concat(String.valueOf(minute%60) + " min ");
	
	        if(isLeft) rideDepart = rideDepart.concat("ago");
	
	        return rideDepart;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "";
	    }
	}
	
    /*
     * @param dateStr
     * @return
     * @throws ParseException
     * guddu
     * 2018 Dec 21, 2018 5:15:23 PM
     * 
     * TODO 
     */
    public static int getDayFromDate(String dateStr) throws ParseException {
        
        Calendar c = Calendar.getInstance();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                return 4008;
            case 2:
                return 4002;
            case 3:
                return 4003;
            case 4:
                return 4004;
            case 5:
                return 4005;
            case 6:
                return 4006;
            case 7:
                return 4007;
            default:
                return 100;
        }
    }
    
    public static String getDayfromDate(String date) throws ParseException {
    	
    		int dayId = getDayFromDate(date);
    		
    		switch (dayId) {
            case 4008:
                return "Sun";
            case 4002:
                return "Mon";
            case 4003:
                return "Tue";
            case 4004:
                return "Wed";
            case 4005:
                return "Thu";
            case 4006:
                return "Fri";
            case 4007:
                return "Sat";
            default:
                return "NA";
        }
    }

	/*
	 * @param createDate
	 * @throws ParseException
	 * guddu
	 * 2018 Aug 14, 2018 7:34:09 PM
	 * 
	 * TODO 
	 */
	public static String addDaysToString(String createDate, int days, int type) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(type==1) sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(createDate));
		c.add(Calendar.DAY_OF_MONTH, days); 
		return sdf.format(c.getTime());
	}
	
	/*
	 * @param createDate
	 * @return
	 * @throws ParseException
	 * guddu
	 * 2018 Aug 23, 2018 1:58:46 PM
	 * 
	 * TODO 
	 */
	public static String addMinuteToString(String createDate, int minute) throws ParseException {
		
		String expiryDate;
		expiryDate = createDate;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(expiryDate));
		c.add(Calendar.MINUTE, minute); 
		return sdf.format(c.getTime());
	}
}
