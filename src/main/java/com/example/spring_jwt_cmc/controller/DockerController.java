package com.example.spring_jwt_cmc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test/docker")
@RequiredArgsConstructor
public class DockerController {
	
	@GetMapping("")
	public String helloVietNam () {
		return "Hello Viet Nam";
	}
}
