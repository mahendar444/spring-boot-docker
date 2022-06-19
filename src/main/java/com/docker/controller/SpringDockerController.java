/**
 * 
 */
package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MAHENDAR REDDY
 *
 */
@RestController
public class SpringDockerController {
	
	@GetMapping("/hello")
	public String getHelloDocker() {
		return "Hello SpringBoot Docker Demo project....";
	}

}
