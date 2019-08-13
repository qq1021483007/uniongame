package com.woniuxy.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public static String getMD5(String passtext) {
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			byte[] result = digest.digest(passtext.getBytes());
			StringBuffer buffer = new StringBuffer();
			for (byte b : result) {
				int num = b & 0xff;
				String str = Integer.toHexString(num);
				if (str.length() == 1) {
					buffer.append("0");
				}
				buffer.append(str);

			}
			return buffer.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}

	}
	
}
