package com.cheesey.pizzashopapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {
	@RequestMapping(value = "/pizzas")
	public String getpizzas() 	{
		return "pizzas";
	}

}
