package com.sonar.api.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public String getMessage(String name) {
		Map<String,String> map = getData();
		String message = map.get(name);
		return message;
	}
	
	private Map<String,String> getData(){
		Map<String,String> map = new HashMap<>();
		map.put("john", "Hey John, You have a call at 12.30PM today with Fanny team");
		map.put("emma", "Hey Emma, You have a call at 3.00PM today with Freedy team");
		map.put("geoff", "Hey Geoff, You have a call at 12.30PM today with Fanny team");
		return map;
	}

	
}
