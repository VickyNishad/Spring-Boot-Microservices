package com.tool.connection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tool.connection.pojo.RequestOrderEntry;
import com.tool.connection.service.ToolService;

@RestController
@RequestMapping("api/v1/orderEntry")
public class ToolController {
	
	@Autowired
	private ToolService service;

	public ToolController() {
		// TODO Auto-generated constructor stub
	}

	
	@PostMapping()
	public void getByte(@RequestBody RequestOrderEntry requestOrderEntry) {
		service.getByte(requestOrderEntry);
	}
}
