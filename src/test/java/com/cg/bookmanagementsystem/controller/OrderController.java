package com.cg.bookmanagementsystem.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.bookmanagementsystem.entity.Order;
import com.cg.bookmanagementsystem.service.IOrderService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class OrderController {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IOrderService orderService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private Order order;
	private Order order1;
	
	@BeforeEach
	public void init() {
		order = new Order();
		
	}
	
	@Test
	public void testAddOrder() throws Exception{
		when(orderService.saveOrder((Order) any(Order.class))).thenReturn(order);
	}

}

