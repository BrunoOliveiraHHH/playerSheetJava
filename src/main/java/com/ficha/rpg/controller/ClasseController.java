package com.ficha.rpg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ficha.rpg.service.ClasseService;

@RestController
@RequestMapping("/classe")
public class ClasseController {
	
	@Autowired
	private ClasseService service;

}
