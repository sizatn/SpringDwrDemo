package com.sizatn.springdwrdemo.controller;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;

@RemoteProxy(name = "sendController")
public class SendController {

	@RemoteMethod
	public String sendMessage(String message) {
		return "Hello, " + message + "!";
	}

}
