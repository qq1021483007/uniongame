package com.woniuxy.tools;

import java.util.UUID;

public class UUIDUtil {
public static String getUUID() {
	String uuid =UUID.randomUUID().toString();
	uuid=uuid.replace("-", "");
	return uuid;
	
}
}
