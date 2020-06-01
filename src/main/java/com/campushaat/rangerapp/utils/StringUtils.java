package com.campushaat.rangerapp.utils;

import java.util.ArrayList;

import com.campushaat.rangerapp.model.Users;
public class StringUtils {

	public String concatStrings(ArrayList<String> list) {
		
		if(list==null || list.size()==0) return "";
		
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
		   strBuilder.append(list.get(i));
		   strBuilder.append(";");
		}
		return strBuilder.toString();
	}
	
	/*
	 * @param s
	 * guddu
	 * 2018 Aug 16, 2018 3:25:28 PM
	 * 
	 * TODO 
	 */
	public static Boolean isNullOrEmpty(String s) {
		
		return (s==null || s.isEmpty());
	}
	
	/*
	 * @param s
	 * @return
	 * guddu
	 * 2018 Aug 16, 2018 3:43:38 PM
	 * 
	 * TODO 
	 */
	public static Boolean isNullOrEmptyOrNull(String s) {
		
		return (s==null || s.isEmpty() || s.equals("null"));
	}
	
	/*
	 * @param s
	 * @return
	 * guddu
	 * 2018 Aug 27, 2018 7:19:35 PM
	 * 
	 * TODO 
	 */
	public static Boolean isNullOrEmptyOrZero(String s) {
		
		return (s==null || s.isEmpty() || s.equals("0"));
	}
	
	/*
	 * @param str1
	 * @param str2
	 * @return
	 * guddu
	 * 2018 Dec 27, 2018 12:03:46 AM
	 * 
	 * TODO 
	 */
	public static Boolean isNotEqual(String str1, String str2) {
		
		// Null - Null
		if(str1==null && str2==null) return false;
		
		// Null - Not-null
		else if((str1!=null && str2==null) || (str1==null && str2!=null)) return true;
		
		// Not equal
		else if(!str1.equals(str2)) return true;
		
		// Contents are equal
		return false;
	}
	
	/*
	 * @param str1
	 * @param str2
	 * @return
	 * guddu
	 * 2018 Dec 27, 2018 12:17:15 AM
	 * 
	 * TODO 
	 */
	public static Boolean isNotNullNotEqual(String str1, String str2) {
		
		// !Null - !Null - !Equal
		if(str1!=null && str2!=null && !str1.equals(str2)) return true;
		
		return false;
	}
	
	public static Boolean isNotNullAndEqual(String str1, String str2) {
		
		// !Null - !Null - !Equal
		if(str1!=null && str2!=null && str1.equals(str2)) return true;
		
		return false;
	}
	
	/*
	 * @param user
	 * @return
	 * guddu
	 * 2018 Nov 1, 2018 6:50:08 PM
	 * 
	 * TODO 
	 */
	public static String getUserName(Users user) {
		
		String userName = !StringUtils.isNullOrEmptyOrNull(user.getFirstName()) ? user.getFirstName() : user.getLastName();
		return !StringUtils.isNullOrEmpty(userName) ? userName : "Someone";
	}
}
