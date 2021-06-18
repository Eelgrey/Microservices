package com.micro.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.limitsservice.config.Configuration;
import com.micro.limitsservice.config.LimitConfiguration;

@RestController
public class LimitServiceController {
	
	@Autowired
	private Configuration con;
	
	
	@GetMapping("/limits")
	public LimitConfiguration getLimits(){
		return new LimitConfiguration(con.getMaximum(),con.getMinimum());
	}

}
