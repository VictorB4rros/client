package com.victor.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.client.dto.ClientDTO;
import com.victor.client.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/{id}")
	public ClientDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
