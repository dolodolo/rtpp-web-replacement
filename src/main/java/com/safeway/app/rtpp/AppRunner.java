package com.safeway.app.rtpp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.safeway.app.rtpp.service.UserService;

@Component
public class AppRunner implements CommandLineRunner{

	protected final Logger log = LoggerFactory.getLogger(getClass());
	
	protected UserService userService;
	
	public AppRunner(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		int[] ids = {2,4};
		
		userService.cleanCustomer();        
		userService.insertCustomer(ids);
	}	
}

