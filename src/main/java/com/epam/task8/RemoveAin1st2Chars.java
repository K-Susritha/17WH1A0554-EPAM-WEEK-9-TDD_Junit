package com.epam.task8;

public class RemoveAin1st2Chars {

		public String remove(String str) {
			int len = str.length();
			String res = "";
			if(len > 1) {
				if(str.charAt(0) == 'A' && str.charAt(1) == 'A') {
					res =  str.substring(2,len);
				} else if(str.charAt(0) == 'A') {
					res =  str.substring(1,len);
				} else if(str.charAt(1) == 'A') {
					res += str.charAt(0);
					res += str.substring(2,len);
				} else {
					res = str;
				}
			} else {
				if(len == 1 && str.charAt(0) == 'A') {
					res = "";
				} else {
					res = str;
				}
			}
			return res;
		}

	}