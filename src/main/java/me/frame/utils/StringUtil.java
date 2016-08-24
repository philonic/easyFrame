package me.frame.utils;

public abstract class StringUtil {
	
	/**
	 * null  true
	 * ""    true
	 * "   " true
	 * "*"   false
	 * @param string
	 * @return
	 */
	public static boolean isNullOrEmpty(String string){

		if(null==string){
			return true;
		}else if (string.trim().isEmpty()) {
			return true;
		}
		else {
			return false;
		}

	}
	
	public static boolean equal(String s1,String s2){
		return s1.equals(s2);
	}

}
